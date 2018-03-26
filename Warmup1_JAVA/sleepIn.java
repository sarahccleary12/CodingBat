/*
PROMPT
The parameter weekday is true if it is a weekday, and the
parameter vacation is true if we are on vacation. We sleep
in if it is not a weekday or we're on vacation. Return true
if we sleep in.
*/

public boolean sleepIn(boolean weekday, boolean vacation) {
  if (weekday && !vacation) {
    return false;
  }
  return true;
}

/*
You can use an if else statement, but it's unnecessary.
The program will only read the "return true" if the initial
if statement is false.
*/
