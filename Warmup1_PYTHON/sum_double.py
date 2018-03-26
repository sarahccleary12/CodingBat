'''
PROMPT
Given two int values, return their sum. Unless
the two values are the same, then return double
their sum.
'''

def sum_double(a, b):
  if (a == b):
    return (a+b)*2
  return a+b

'''
Simply putting a == b into the if statement will simplify to
true or false on its own. If it's true, double the sum.
An else statement is unnecessary, because if the initial if-
statement is true, it will automatically return. If it's not
true, only then will it read the rest of the program.
'''
