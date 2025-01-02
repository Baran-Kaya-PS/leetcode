cmake_minimum_required(VERSION 3.29)
project(LCPP)

set(CMAKE_CXX_STANDARD 20)

add_executable(LCPP main.cpp
        Leetcode/Easy/ContainsDuplicate/Solution.cpp
        Leetcode/Easy/ContainsDuplicate/Include/Solution.h)
