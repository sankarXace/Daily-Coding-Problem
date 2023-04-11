#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> solve(vector<int>& nums) {
        vector<int> res(nums.size(), 0);
        int runningProduct = 1;
        for (int i = 0; i < nums.size(); i++) {
            res[i] = runningProduct;
            runningProduct *= nums[i];
        }
        runningProduct = 1;
        for (int i = nums.size() - 1; i >= 0; i--) {
            res[i] *= runningProduct;
            runningProduct *= nums[i];
        }
        return res;
    }
};

int main()
{
    string input;
    getline(cin, input);

    vector<int> nums;
    stringstream ss(input);
    string token;
    while (getline(ss, token, ' '))
    {
        int num = stoi(token);
        nums.push_back(num);
    }
    vector<int> result = Solution().solve(nums);
    for(int i : result) cout<<i<<" ";
    return 0;
}