#345. Reverse Vowels of a String
# https://leetcode.com/problems/reverse-vowels-of-a-string/description/

class Solution:

    VOWELS = 'aeiouAEIOU'

    def reverseVowels(self, s):
        listOfChar = list(s);

        left, right = 0, len(s)-1

        while left < right:

            while left < right and listOfChar[left] not in self.VOWELS:
                left += 1
            
            while left < right and listOfChar[right] not in self.VOWELS:
                right -= 1

            listOfChar[left], listOfChar[right] = listOfChar[right], listOfChar[left]
            left += 1
            right -= 1
        
        return ''.join(listOfChar)
    
if __name__ == '__main__':
    s = "IceCreAm"
    solution = Solution()
    print(solution.reverseVowels(s))