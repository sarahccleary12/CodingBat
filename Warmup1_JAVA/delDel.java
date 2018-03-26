/*
PROMPT
Given a string, if the string "del" appears starting at
index 1, return a string where that "del" has been deleted.
Otherwise, return the string unchanged.
*/

public String delDel(String str) {
  if ((str.length() >= 4) && (str.substring(1, 4).equals("del"))) {
    return str.substring(0, 1) + str.substring(4);
  }
  return str;
}

/*
Line 9 checks to see if the length of str is greater than
or equal to 4, and also if the string "del" appears starting
at index 1. If both of these are true, Line 10 returns the
string without the substring "del".
If this if-statement returns false, Line 12 returns the string
unchanged.
*/
