class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        sum = 0
        product = 1
        while(n !=0):
            last = n%10
            sum += last 
            product *= last
            n//=10
        result = product - sum
        return result
