#include <bits/stdc++.h>

using namespace std;

class Solution
{
public:
    bool solve(std::vector<int> &nums, int k)
    {
        std::vector<int> check;
        for (int i : nums)
        {
            int diff = k - i;
            if (std::find(check.begin(), check.end(), diff) != check.end())
            {
                return true;
            }
            check.push_back(i);
        }
        return false;
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
    int k;
    std::cin >> k;
    bool result = Solution().solve(nums, k);
    std::cout << result;
    return 0;
}
