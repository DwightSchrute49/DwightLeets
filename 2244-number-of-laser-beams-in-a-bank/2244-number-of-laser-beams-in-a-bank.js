/**
 * @param {string[]} bank
 * @return {number}
 */
var numberOfBeams = function(bank) {
    let deviceCounts = []

    for (let row of bank){
        let count = 0
        for (let ch of row){
            if (ch === '1'){
                count++
            }
        }
        if(count > 0){
            deviceCounts.push(count)
        }
    }
    let beams = 0
    for(let i = 0 ; i < deviceCounts.length -1 ; i++){
        beams += deviceCounts[i] * deviceCounts[i+1]
    }
    return beams
};