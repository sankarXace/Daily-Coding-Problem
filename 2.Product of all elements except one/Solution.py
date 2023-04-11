from typing import List

# Solution Class
class Solution:
    def solve(nums:List[int]) -> List[int]:
        res = [0]*len(nums)
        runningProduct = 1
        for i in range(len(nums)):
            res[i] = runningProduct
            runningProduct *= nums[i]
        runningProduct = 1
        for i in range(len(nums)-1,-1,-1):
            res[i] *= runningProduct
            runningProduct *= nums[i]
        return res

# Main
nums = list(map(int,input().split()))
result = Solution.solve(nums)
print(result)