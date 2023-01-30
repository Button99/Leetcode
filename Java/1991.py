class Solution:
    def canThreePartsEqualSum(self, arr: List[int]) -> bool:
        count=0
        n= sum(arr)/3
        totSum=0
        if len(arr) < 3:
            return False
        for i in arr:
            totSum+=i
            if totSum==n:
                count+=1
                totSum=0
            if count==3:
                return True
        return False