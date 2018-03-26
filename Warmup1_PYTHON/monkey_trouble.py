'''
PROMPT
We have two monkeys, a and b, and the parameters
a_smile and b_smile indicate if each is smiling.
We are in trouble if they are both smiling or if
neither of them is smiling. Return True if we are
in trouble.
'''

def monkey_trouble(a_smile, b_smile):
  return (a_smile == b_smile)

'''
If both monkeys are doing the same thing, you are in trouble.
If aSmile is equal to bSmile, then they are doing the same
thing, which means that you're in trouble.
a_Smile == b_Smile will return True if they are the same, and
False if they are different.
'''
