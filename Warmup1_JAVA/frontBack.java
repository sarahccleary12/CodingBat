/*
PROMPT
Given a string, return a new string where the first
and last chars have been exchanged.
*/

public String frontBack(String str) {
  int len = str.length();
  if (len > 1) {
    return str.charAt(len-1) + str.substring(1, len-1) + str.charAt(0);
  }
  return str;
}

/*
To switch the first and last characters, you can also create variables
and call those instead. I just returned a string by returning
the last character + middle substring + first character.
*/
