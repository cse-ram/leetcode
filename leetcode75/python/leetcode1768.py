#1768. Merge Strings Alternately
#https://leetcode.com/problems/merge-strings-alternately/description/

class Solution:

    def mergeAlternately(self, word1, word2):
        result = []

        for i in range(min(len(word1), len(word2))):    
            result.append(word1[i])
            result.append(word2[i])

        if len(word1) > len(word2):
            result.append(word1[len(word2):])
        else:    
            result.append(word2[len(word1):])

        return ''.join(result)
    
if __name__ == '__main__':
    word1 = "abc"
    word2 = "pqr"
    solution = Solution()
    print(solution.mergeAlternately(word1, word2))