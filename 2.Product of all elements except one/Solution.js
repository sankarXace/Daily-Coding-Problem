// Solution class
class Solution {
  static solve(nums) {
    const res = new Array(nums.length).fill(0);
    let runningProduct = 1;
    for (let i = 0; i < nums.length; i++) {
      res[i] = runningProduct;
      runningProduct *= nums[i];
    }
    runningProduct = 1;
    for (let i = nums.length - 1; i >= 0; i--) {
      res[i] *= runningProduct;
      runningProduct *= nums[i];
    }
    return res;
  }
}

// Main
const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.question("", (input) => {
  const nums = input.split(" ").map(Number);
  const result = Solution.solve(nums);
  console.log(result);
  rl.close();
});
