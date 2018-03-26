/*
PROMPT
Given a string, we'll say that the front is the first
3 chars of the string. If the string length is less than 3,
the front is whatever is there. Return a new string which
is 3 copies of the front.
*/

public String front3(String str) {
  if (str.length() < 3) {
    return str + str + str;
  }
  String newstr = str.substring(0, 3);
  return newstr + newstr + newstr;
}

/*
Unfortunately in Java you cannot say return str*3 to mean
the same as str + str + str.
Remember that str.substring(0, 3) includes the characters
in str at indexes 0, 1, and 2 but NOT at index 3.
*/
