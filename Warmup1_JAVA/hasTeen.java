/*
PROMPT
We'll say that a number is "teen" if it is in the
range 13..19 inclusive. Given 3 int values, return
true if 1 or more of them are teen.
*/

public boolean hasTeen(int a, int b, int c) {
  return ((a >= 13 && a <= 19) ||
          (b >= 13 && b <= 19) ||
          (c >= 13 && c <= 19));
}

/*
This can also be written as a series of if/else if statments,
but it is more compact as one long return statement.
The funciton will return true if any of the given expressions
prove to be true.
Putting your parentheses in the correct place is really important
when you are writing out long statements like this one.
*/
