/*
PROMPT
Given a non-empty string and an int N, return the
string made starting with char 0, and then every
Nth char of the string. So if N is 3, use char 0,
3, 6, ... and so on. N is 1 or more.
*/

public String everyNth(String str, int n) {
  String result = "";

  for (int i = 0; i < str.length(); i += n) {
    result = result + str.charAt(i);
  }

  return result;
}

/*
Set the result variable to an empty string. This is
what you will return at the end of the program. The for
loop will increment by the given variable n, and append
the str.charAt(i) to the string result. This will give
you every Nth letter in the string.
*/
