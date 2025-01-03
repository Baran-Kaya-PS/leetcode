//
// Created by Baran on 1/3/2025.
//

#include <iostream>
#include <string>
#include "Solution.h"
#include <unordered_map>
bool isAnagram(std::string s, std::string t) {
    if (s.length() != t.length()) return false;
    std::unordered_map<char,int> charCount1;
    std::unordered_map<char,int> charCount2;
    for (auto ch : s) {
        auto[it,inserted] = charCount1.insert({ch,1});
        if (!inserted) it->second++;
    }
    for (auto ch : t) {
        auto[it,inserted] = charCount2.insert({ch,1});
        if (!inserted) it->second++;
    }
    for (const auto & [key,value] : charCount1){
        if (charCount2[key] != value) return false;
    }
    return true;
}