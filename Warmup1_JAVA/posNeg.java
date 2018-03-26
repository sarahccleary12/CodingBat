/*
PROMPT
Given 2 int values, return true if one is negative and one
is positive. Except if the parameter "negative" is true,
then return true only if both are negative.
*/

public boolean posNeg(int a, int b, boolean negative) {
  if (negative) {
    return ((a < 0) && (b < 0));
  }
  return (((a < 0) && (b > 0)) || ((a > 0) && (b < 0)));
}

/*
Check if the variable negative is true. If it is,
return true only if both a and b are greater than 0.
The last return statement has two components. It checks if
either of them is true; if one of them is, then it returns
true.
*/
