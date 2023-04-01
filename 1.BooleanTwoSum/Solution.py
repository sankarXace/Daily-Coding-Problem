from typing import List

# Solution Class
class Solution:
    def solve(nums:List[int], k:int) -> bool:
        check = []
        for i in nums:
            diff = k-i
            if diff in check:
                return True
            check.append(i)
        return False

# Main  
nums = list(map(int,input().split()))
k = int(input())
result = Solution.solve(nums,k)
print(result) 
