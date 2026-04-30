class Solution:
    def isHappy(self, n: int) -> bool:
        # def digit(n:int)-> int:
        #     sum = 0
        #     while n>0:
        #         sum+=(n%10)**2
        #         n//=10
        #     return sum
        
        # seen = set([n])
        # curr = n
        # while curr != 1:
        #     new = digit(curr)
        #     if new in seen:
        #         return False
        #     seen.add(new)
        #     curr = new
        # return True
        visit = set()
        while n not in visit:
            visit.add(n)
            sum = 0
            while n>0:
                last = n%10
                n//=10
                sum+=last**2
            n = sum
            if n == 1:
                return True
        return False
