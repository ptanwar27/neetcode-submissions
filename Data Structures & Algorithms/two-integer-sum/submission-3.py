class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # Solution 1 Brute Force
        # for i in range(0, len(nums)):
        #     for j in range(i+1, len(nums)):
        #         if(nums[i] + nums [j] == target):
        #             return [i, j]

        #Solution 2 Hash Table

        numIndex = {}
        for i in range(0, len(nums)):
            numIndex[nums[i]] = i
        
        for j in range(0, len(nums)):
            if target - nums[j] in numIndex:
                if(numIndex[target - nums[j]]!=j):
                    secondIndex = numIndex[target - nums[j]]
                    val = [j, secondIndex]       
                    val.sort()
                    return val     
