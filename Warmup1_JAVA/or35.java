/*
PROMPT
Return true if the given non-negative number is a multiple
of 3 or a multiple of 5. Use the % "mod" operator.
*/

public boolean or35(int n) {
  return ((n % 3 == 0) || (n % 5 == 0));
}

/*
The modulo operation returns the REMAINDER of a division
calculation. For example, 4 % 2 == 0 because 2 can be
multiplied perfectly into four.
While 5.0 / 2.0 == 2.5,   5 % 2 == 1 because one is the
remainder of 5/2.
*/
