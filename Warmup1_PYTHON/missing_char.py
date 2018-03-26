'''
PROMPT
Given a non-empty string and an int n, return a
new string where the char at index n has been
removed. The value of n will be a valid index of
a char in the original string (i.e. n will be in
the range 0..len(str)-1 inclusive).
'''

def missing_char(str, n):
  return str[:n] + str[n+1:]

'''
The expression str[:n] returns the characters
starting at index 0 up until index n (but the char at index
n is NOT included).
Because you want to exclude the character at index n,
return a string that includes a substring of str UNTIL
n, and then another substring starting at n+1. You don't
need to include an end in the second substring. It will
go to the end of the string automatically if an ending parameter
isn't included.
'''
