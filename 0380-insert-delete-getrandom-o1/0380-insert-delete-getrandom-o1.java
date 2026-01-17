class RandomizedSet {
    ArrayList<Integer> list;
    HashMap<Integer, Integer> map;
    Random rand;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        map.put(val, list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;

        int index = map.get(val);
        int lastIndex = list.size() - 1;
        int lastVal = list.get(lastIndex);

        // only swap if not removing last element
        if (index != lastIndex) {
            list.set(index, lastVal);
            map.put(lastVal, index);
        }

        list.remove(lastIndex);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}
