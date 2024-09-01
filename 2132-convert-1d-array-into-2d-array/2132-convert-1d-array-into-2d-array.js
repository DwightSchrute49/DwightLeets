function construct2DArray(original, m, n) {
    // Check if it's possible to construct the 2D array
    if (original.length !== m * n) {
        return [];  // Return an empty 2D array if it's impossible
    }

    // Initialize the 2D array
    let result = [];

    // Fill the 2D array
    for (let i = 0; i < m; i++) {
        let row = [];
        for (let j = 0; j < n; j++) {
            row.push(original[i * n + j]);
        }
        result.push(row);
    }

    return result;
}

// Example usage
let original = [1, 2, 3, 4, 5, 6];
let m = 2;
let n = 3;

let result = construct2DArray(original, m, n);
console.log(result);
