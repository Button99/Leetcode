class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        l1= list(t)
        for i in range(len(s)):
            if s[i] in l1:
                l1.remove(s[i])
            else:
                return False          
        return True