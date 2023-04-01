class Solution {
    solve(nums, k) {
        let check = [];
        for (let i of nums) {
            let diff = k - i;
            if (check.includes(diff)) {
                return true;
            }
            check.push(i);
        }
        return false;
    }
}

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('', (input) => {
    let nums = input.split(' ').map(Number);
    rl.question('', (k) => {
        let result = new Solution().solve(nums, parseInt(k));
        console.log(result);
        rl.close();
    });
});
