class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:

        count = 0
        currSum = 0

        mp = {}

        for num in nums:
            currSum += num

            if currSum == k:
                count += 1

            rem = currSum - k

            if rem in mp:
                count += mp[rem]

            if currSum in mp:
                mp[currSum] += 1
            else:
                mp[currSum] = 1

        return count
        