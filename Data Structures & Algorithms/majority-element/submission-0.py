class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        # creating a dictionary
        count = {}
        for num in nums:
            count[num] = count.get(num,0)+1
        for num, freq in count.items():
            if freq > len(nums) // 2:
                return num

        