/*
PROMPT
Return true if the given string begins with "mix",
except the 'm' can be anything, so "pix", "9ix" ..
all count.
*/

public boolean mixStart(String str) {
  if (str.length() > 2) {
    return (str.substring(1, 3).equals("ix"));
  }
  return false;
}

/*
Since the first letter of '_ix' can be anything,
only check if the characters at indexes 1 and 2
are equal to 'i' and 'x', respectively. You also
have to make sure that the lenth of str is at least
2, because '_ix' has a length of three.
*/
