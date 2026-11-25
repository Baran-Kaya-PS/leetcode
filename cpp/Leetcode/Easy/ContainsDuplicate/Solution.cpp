//
// Created by Baran on 1/2/2025.
//
#include <iostream>
#include <vector>
#include <unordered_set>
#include "Include/Solution.h"
bool containsDuplicate(std::vector<int>& nums){
    std::unordered_set<int> seen;
    for (int num : nums){
        if (seen.count(num)){
            return true;
        }
        seen.insert(num);
    }
    return false;
}
