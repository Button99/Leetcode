class Solution:
    def reverse(self, x: int) -> int:
        converted= str(x)
        if(converted[0] == '-'):
            num= int('-' + converted[:0:-1])
            if(num < -2147483648):
                return 0
            return num
        if(converted[0] == 0):
            return int(converted[1:0:1])
        case3=int(converted[::-1])
        if(case3 > 2147483648):
            return 0
        return case3