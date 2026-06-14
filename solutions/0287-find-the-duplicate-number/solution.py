class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        nums.sort()
        i=0
        for i in range(1,len(nums)):
            if nums[i-1]==nums[i]:
                duplicate=nums[i];
                break;
        return duplicate
        
