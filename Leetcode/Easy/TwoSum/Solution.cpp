//
// Created by Baran on 1/4/2025.
//
#include <vector>
#include <map>
class Solution {
public:
    std::vector<int> twoSum(std::vector<int>& nums, int target) {
        std::vector<int> twoSum = {0,0};
        std::map<int,int> values;
        for (int i = 0; i < nums.size(); i++){
            values.insert({nums[i],i});
        }
        for (int i = 0; i < nums.size();i++){
            int difference = target-nums[i];
            if (values.contains(difference)){
                if (values[difference] != i){
                    twoSum[0] = values[difference];
                    twoSum[1] = i;
                }
            }
        }
        return twoSum;
    }
};
