'''
PROMPT
Given 2 int values, return True if one is negative and one
is positive. Except if the parameter "negative" is True,
then return True only if both are negative.
'''

def pos_neg(a, b, negative):
  if (negative == True):
    return (a < 0 and b < 0)
  return ((a < 0 and b > 0) or (a > 0 and b < 0))

'''
Check if the variable negative is True. If it is,
return true only if both a and b are greater than 0.
The last return statement has two components. It checks if
either of them is true; if one of them is, then it returns
True.
'''
