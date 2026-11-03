class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        # 0(1) solution
        res, count = 0, 0
        for num in nums:
            if count == 0:
                res = num
            count += (1 if num == res else -1)
        return res

        # Brute force solution
        # creating a dictionary
        count = {}
        for num in nums:
            count[num] = count.get(num,0)+1
        for num, freq in count.items():
            if freq > len(nums) // 2:
                return num

        