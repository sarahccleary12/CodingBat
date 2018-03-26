/*
PROMPT
Given three int values, a b c, return the largest.
*/

public int intMax(int a, int b, int c) {
  int max;
  max = Math.max(a, b);
  max = Math.max(max, c);
  return max;
}

/*
Math.max(a, b) returns the maximum value of a and
b. First find the max between a and b, and then check
that between the current max and c.
*/
