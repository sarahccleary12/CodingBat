/*
PROMPT
We'll say that a number is "teen" if it is in
the range 13..19 inclusive. Given 2 int values,
return true if one or the other is teen, but
not both.
*/

public boolean loneTeen(int a, int b) {
  boolean a0 = (a >= 13 && a <= 19);
  boolean b0 = (b >= 13 && b <= 19);

  return (a0 && !b0) || (!a0 && b0);
}

/*
We are checking if one of the given integers is
a 'teen', but only one.
Helpful hint: creating boolean expressions to put into
a return statement reduces the possibility of mixing
up parentheses or getting confused. It also makes the
return statement in this case look a lot more palatable.
*/
