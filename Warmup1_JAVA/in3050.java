/*
PROMPT
Given 2 int values, return true if they are both in the
range 30..40 inclusive, or they are both in the range
40..50 inclusive.
*/

public boolean in3050(int a, int b) {
  if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
    return true;
  }
  if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
    return true;
  }
  return false;
}

/*
First check if both a AND b are in the 30-40 range.
If they are, return true. If they aren't the program
will move on to the next if-statement, which checks
if a AND b are in the 40-50 range. If they aren't, the
program will automatically read the next line, returning
false.
*/
