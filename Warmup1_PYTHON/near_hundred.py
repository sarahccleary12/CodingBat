'''
PROMPT
Given an int n, return True if it is within 10 of
100 or 200. Note: abs(num) computes the absolute
value of a number.
'''

def near_hundred(n):
  return ((abs(100 - n) <= 10) or (abs(200 - n) <= 10))

'''
This return statement returns True if either of the expressions
are true.
This is checking the values surrounding both 100 and 200 to see
if n is within 10 points of either.
Can also be written...
---
if (abs(100-n) <= 10):
  return True
elif (abs(200-n) <= 10):
  return True
return False
'''
