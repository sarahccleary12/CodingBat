'''
PROMPT
Given 2 ints, a and b, return True if one if
them is 10 or if their sum is 10.
'''

def makes10(a, b):
  return (a == 10 or b == 10 or a + b == 10)

'''
This return statement is basically a concentrated version of
three if statements.
It can be expanded into...
---
if (a == 10):
  return True
elif (b == 10):
  return True
elif (a + b == 10):
  return True
return False
'''
