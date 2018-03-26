/*
PROMPT
Given a string, return a string made of the first 2
chars (if present), however include first char only
if it is 'o' and include the second only if it is 'z',
so "ozymandias" yields "oz".
*/

public String startOz(String str) {
  String str1 = "";
  if (str.length() > 0) {
    if (str.charAt(0) == 'o') {
      str1 = str1 + "o";
    }
    if (str.length() > 1) {
      if (str.charAt(1) == 'z') {
        str1 = str1 + "z";
      }
    }
  }
  return str1;
}

/*
Check the length of the string to see if you can
include 'o' and/or 'z' in the final result.
*/
