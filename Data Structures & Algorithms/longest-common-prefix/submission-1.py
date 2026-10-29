class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        first = strs[0]
        minLen = len(first)

        ans = ""

        for s in strs:
            minLen = min(len(s), minLen)

        for i in range(0, minLen):
            ch = first[i]

            for s in strs:
                if ch != s[i]:
                    return ans

            ans = ans + ch

        return ans
        