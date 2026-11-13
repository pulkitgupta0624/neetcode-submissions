class Solution:
    def maxArea(self, heights: List[int]) -> int:
        
        i=0
        j=len(heights) - 1

        ans = 0

        while i < j:
            l = j-i
            area = min(heights[i], heights[j])*l;

            if heights[i] > heights[j]:
                j -= 1
            else:
                i += 1

            ans = max(ans, area)


        return ans
            
        