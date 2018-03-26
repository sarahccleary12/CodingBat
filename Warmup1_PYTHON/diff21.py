'''
PROMPT
Given an int n, return the absolute difference between
n and 21, except return double the absolute difference
if n is over 21.
'''

def diff21(n):
  if (n > 21):
    return 2*(n - 21)
  return 21 - n

'''
The statement (n > 21) is NOT inclusive. You could also
say (n >= 22) to mean the same thing.
The else statement is unnecessary because the program will only read
"return 21 - n" if the previous if-statement proves to be False.
The program always stops running after a return statement.
'''
