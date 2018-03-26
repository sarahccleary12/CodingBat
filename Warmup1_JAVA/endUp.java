/*
PROMPT
Given a string, return a new string where the last
3 chars are now in upper case. If the string has
less than 3 chars, uppercase whatever is there. Note
that str.toUpperCase() returns the uppercase version
of a string.
*/

public String endUp(String str) {
  if (str.length() < 3) {
    return str.toUpperCase();
  }

  String upper = str.substring(str.length() - 3);
  return str.substring(0, str.length()-3) + upper.toUpperCase();
}

/*
The expression stringVariable.toUpperCase() returns the
uppercase version of the string. Use this and the substring
in range (0, str.length() - 3) to return the requested
string.
*/
