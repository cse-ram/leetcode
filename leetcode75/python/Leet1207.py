#1207. Unique Number of Occurrence
#https://leetcode.com/problems/unique-number-of-occurrences/

class Solution:
    def uniqueOccurrences(self, arr: list[int]) -> bool:
        frequency_map = {}
        for num in arr:
            frequency_map[num] = frequency_map.get(num, 0) + 1

        frequency_set = set(frequency_map.values())

        return len(frequency_map) == len(frequency_set)


if __name__ == '__main__':
    arr = [1,2,2,1,1,3]

    solution = Solution()
    print(solution.uniqueOccurrences(arr))