/*
PROMPT
Given 2 ints, a and b, return true if one if them is 10 or
if their sum is 10.
*/

public boolean makes10(int a, int b) {
  return ((a == 10) || (b == 10) || (a + b == 10));
}

/*
This return statement is basically a concentrated version of
three if statements.
It can be expanded into...
---
if (a == 10) {
  return true;
}
else if (b == 10) {
  return true;
}
else if (a + b == 10) {
  return true;
}
return false;
*/
