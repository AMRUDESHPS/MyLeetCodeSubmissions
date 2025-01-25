/*
 *42. Trapping Rain Water
*/

class Solution:
    def trap(self, height: List[int]) -> int:

        left,right=0,len(height)-1

        lmax,rmax=height[left],height[right]

        result=0

        
        while left<right:
            lmax,rmax=max(lmax,height[left]),max(rmax,height[right])
            if lmax<=rmax:
                result+=lmax-height[left]
                left+=1
            else:
                result+=rmax-height[right]
                right-=1
        return result
