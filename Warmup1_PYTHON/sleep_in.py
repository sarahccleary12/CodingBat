'''
PROMPT
The parameter weekday is True if it is a weekday,
and the parameter vacation is True if we are on
vacation. We sleep in if it is not a weekday or
we're on vacation. Return True if we sleep in.
'''

def sleep_in(weekday, vacation):
  return (not weekday or vacation)

 '''
 Since we are returning True if we're sleeping in,
 we have to make the parameters inside of the return
 statements signify sleeping in. The word "not" is the
 python equivalent of '!' in most other languages.
 '''
