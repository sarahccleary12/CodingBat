/*
PROMPT
Given 2 int values, return whichever value is nearest
to the value 10, or return 0 in the event of a tie.
Note that Math.abs(n) returns the absolute value of a number.
*/

public int close10(int a, int b) {
  if (Math.abs(10-a) < Math.abs(10-b)) {
    return a;
  }
  else if (Math.abs(10-a) > Math.abs(10-b)) {
    return b;
  }
  return 0;
}

/*
Use Math.abs(_) and if-statements to find the differences
between a and 10, and b and 10. Return the greater of the two.
*/
