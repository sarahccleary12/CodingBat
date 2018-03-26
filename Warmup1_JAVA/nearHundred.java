/*
PROMPT
Given an int n, return true if it is within 10 of 100 or 200.
Note: Math.abs(num) computes the absolute value of a number.
*/

public boolean nearHundred(int n) {
  return ((Math.abs(100-n) <= 10) || (Math.abs(200-n) <= 10));
}

/*
This return statement returns true if either of the expressions
are true.
This is checking the values surrounding both 100 and 200 to see
if n is within 10 points of either.
Can also be written...
---
if (Math.abs(100-n) <= 10) {
  return true;
}
else if (Math.abs(200-n) <= 10) {
  return true;
}
return false;
*/
