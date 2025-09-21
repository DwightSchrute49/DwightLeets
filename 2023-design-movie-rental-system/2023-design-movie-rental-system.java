class MovieRentingSystem {

	HashMap<Integer, HashMap<Integer, Integer>> shopMoviesPrice = new HashMap<>();
	
    HashMap<Integer, SortedSet<ShopPrice>> currentMovieShopsPrice = new HashMap<>();
	
    SortedSet<MovieShopPrice> minRentedOut = new TreeSet<MovieShopPrice>((MovieShopPrice a, MovieShopPrice b) -> {
		if (a.price == b.price) {
			if (a.shopId == b.shopId) {
				return a.movieId - b.movieId;
			} else {
				return a.shopId - b.shopId;
			}
		} else {
			return a.price - b.price;
		}
	});

	public MovieRentingSystem(int n, int[][] entries) {
		for (int i = 0; i < entries.length; i++) {
			ShopPrice sp = new ShopPrice(entries[i][0], entries[i][2]);
			if (shopMoviesPrice.get(entries[i][0]) == null) {
				shopMoviesPrice.put(entries[i][0], new HashMap<>());
			}

			if (currentMovieShopsPrice.get(entries[i][1]) == null) {
				currentMovieShopsPrice.put(entries[i][1], new TreeSet<ShopPrice>((ShopPrice a, ShopPrice b) -> {
					if (a.price == b.price)
						return a.id - b.id;
					return a.price - b.price;
				}));
			}

			shopMoviesPrice.get(entries[i][0]).put(entries[i][1], entries[i][2]);
			currentMovieShopsPrice.get(entries[i][1]).add(sp);
		}
	}

	public List<Integer> search(int movie) {
		int count = 0;
		List<Integer> ans = new ArrayList<Integer>();
		Set<Integer> p = new HashSet<Integer>();
		if (currentMovieShopsPrice.get(movie) != null) {
			for (ShopPrice mp : currentMovieShopsPrice.get(movie)) {
				if (count == 5) {
					break;
				}
				ans.add(mp.id);
				count++;
			}

		}
		return ans;
	}

	public void rent(int shop, int movie) {
		int price = shopMoviesPrice.get(shop).get(movie);
		currentMovieShopsPrice.get(movie).remove(new ShopPrice(shop, price));
		MovieShopPrice msp = new MovieShopPrice(movie, shop, price);
		minRentedOut.add(msp);
	}

	public void drop(int shop, int movie) {
		int price = shopMoviesPrice.get(shop).get(movie);
		currentMovieShopsPrice.get(movie).add(new ShopPrice(shop, price));
		MovieShopPrice msp = new MovieShopPrice(movie, shop, price);
		minRentedOut.remove(msp);
	}

	public List<List<Integer>> report() {
		int count = 0;
        
		List<List<Integer>> ans = new ArrayList<>();
		;
		for (MovieShopPrice msp : minRentedOut) {
			if (count == 5) {
				break;
			}
			ArrayList<Integer> shopMovie = new ArrayList<Integer>();
			shopMovie.add(msp.shopId);
			shopMovie.add(msp.movieId);
			ans.add(shopMovie);

			count++;
		}
		return ans;
	}
}

class ShopPrice {
	int id;
	int price;

	ShopPrice(int id, int price) {
		this.id = id;
		this.price = price;
	}

	public boolean equals(Object o) {
		return ((ShopPrice) o).id == this.id;
	}

	public int hashCode() {
		return id;
	}
}

class MoviePrice {
	int id;
	int price;

	MoviePrice(int id, int price) {
		this.id = id;
		this.price = price;
	}

	public boolean equals(Object o) {
		return ((MoviePrice) o).id == this.id;
	}

	public int hashCode() {
		return id;
	}
}

class MovieShopPrice {
	int movieId;
	int shopId;
	int price;

	MovieShopPrice(int movieId, int shopId, int price) {
		this.movieId = movieId;
		this.shopId = shopId;
		this.price = price;
	}

	public boolean equals(Object o) {
		return ((MovieShopPrice) o).movieId == this.movieId && ((MovieShopPrice) o).shopId == this.shopId;
	}

	public int hashCode() {
		return movieId + shopId * 10000;
	}
}
/**
 * Your MovieRentingSystem object will be instantiated and called as such:
 * MovieRentingSystem obj = new MovieRentingSystem(n, entries); List<Integer>
 * param_1 = obj.search(movie); obj.rent(shop,movie); obj.drop(shop,movie);
 * List<List<Integer>> param_4 = obj.report();
 */