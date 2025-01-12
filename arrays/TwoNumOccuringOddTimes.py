from collections import defaultdict

nums = [1,3,3,2,6,2,3,1,6,3,2,8,3,8]

b = defaultdict(int)

for c in nums:
    b[c] += 1


count=0

for c in nums:

 if b[c]%2==1:
  print(c)
  prev=c
  count=count+1
  break
  
for c in nums: 
    if b[c]%2==1:
        if c!=prev:
            print(c) 
            break
	