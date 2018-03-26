/*
PROMPT
Given two non-negative int values, return true
if they have the same last digit, such as with
27 and 57. Note that the % "mod" operator computes
remainders, so 17 % 10 is 7.
*/

public boolean lastDigit(int a, int b) {
  return (a % 10 == b % 10);
}

/*
The mod operator (%) returns the remainder of
the division expression. For example, 5 % 2
returns 1, because 1 is the remainder of
5 / 2. The statement on Line 10 will return
true if a%10 is equal to b%10. You use 10
as the divisor, so that it will return the
remainder in the ones column of digits.
*/
