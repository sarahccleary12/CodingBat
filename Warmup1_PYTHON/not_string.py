'''
PROMPT
Given a string, return a new string where "not "
has been added to the front. However, if the string
already begins with "not", return the string unchanged.
'''

def not_string(str):
  if (len(str) >= 3) and (str[:3] == "not"):
    return str
  return "not " + str

'''
The expression len(str) returns the length of the string
'str'. You can create a substring of a string by typing
str[a:b]. This will return a string starting at index a,
and ending at b - 1 (does not include b). Typing str[:3]
is the same as typing str[0:3]. You can also reverse this
and type str[5:] to return a string starting at index 5 and
extending until the end of the string. 
'''
