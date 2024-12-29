from collections import defaultdict

nums = [1,3,9,4,2,7,7,8]

b = defaultdict(int)

for c in nums:
    b[c] += 1

for c in nums:
 if b[c]>1:
  print(c)
  break
	