# 2215. Find the Difference of Two Arrays
# https://leetcode.com/problems/find-the-difference-of-two-arrays/

class Solution:
    def findDifference(self, nums1: list[int], nums2: list[int]) -> list[list[int]]:
        set1, set2 = set(nums1), set(nums2)

        unique_to_nums1 = list(set1-set2)
        unique_to_nums2 = list(set2-set1)

        return [unique_to_nums1, unique_to_nums2]
    

if __name__ == '__main__':
    nums1 = [1,2,3]
    nums2 = [2,4,6]
    solution = Solution()
    print(solution.findDifference(nums1, nums2))