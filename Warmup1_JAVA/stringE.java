/*
PROMPT
Return true if the given string contains
between 1 and 3 'e' chars.
*/

public boolean stringE(String str) {
  int e = 0;

  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == 'e') {
      e++;
    }
  }

  if (e >= 1 && e <= 3) {
    return true;
  }
  return false;
}

/*
Create an int variable to count the number of 'e' characters
in the string. The for loop then checks each character in the
string using str.charAt(i). {you can use == when comparing
characters, but not when comparing strings} If there is a
character 'e' in the string, increment the 'e' counter by
one. The final if-statement returns true if the 'e' counter
is between 1 and three characters, inclusive.
*/
