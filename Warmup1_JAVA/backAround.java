/*
PROMPT
Given a string, take the last char and return
a new string with the last char added at the
front and back, so "cat" yields "tcatt". The
original string will be length 1 or more.
*/

public String backAround(String str) {
  return str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
}

/*
str.charAt(index) returns the character at the index in
string str. To get the last character of a string of unknown
length, you can subtract one from the string's length.
You cannot say str.charAt(str.length()) because the length
of the string will NOT equal the index of the last character.
Example:
"program" --> length = 7
 0123456  --> indexes
Indexes start at 0, while length is simply the number of
characters.
*/
