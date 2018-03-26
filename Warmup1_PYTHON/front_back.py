'''
PROMPT
Given a string, return a new string where the
first and last chars have been exchanged.
'''

def front_back(str):
  if len(str) <= 1:
    return str

  center = str[1:-1]

  return str[-1:] + center + str[0]

'''
You can return a substring of unknown length that
excludes the last character by typing str[x:-1]. This
can also be used in conjunction with a lack of parameter,
like in the return statement on Line 13.
'''
