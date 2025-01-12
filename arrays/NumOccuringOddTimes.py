from collections import defaultdict

nums = [1,1,7,4,4,7,7,4,1,9]

b = defaultdict(int)

for c in nums:
    b[c] += 1

for c in nums:
 if b[c]%2==1:
  print(c)
  break
	
            
                