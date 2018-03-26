/*
PROMPT
Given a string, return true if the string starts with "hi"
and false otherwise.
*/

public boolean startHi(String str) {
  if (str.length() > 1) {
    return (str.substring(0, 2).equals("hi"));
  }
  return false;
}

/*
We first check to make sure that the string is more than one
character long. If it's 1 character or less, we know that there
is no way that it can be equal to "hi", which is two characters
long.
Then, use the substring and equals() expressions to check if
the first two characters of str are equal to "hi".
*/
