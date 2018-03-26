/*
PROMPT
We have two monkeys, a and b, and the parameters aSmile and
bSmile indicate if each is smiling. We are in trouble if they
are both smiling or if neither of them is smiling. Return
true if we are in trouble.
*/

public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  return (aSmile == bSmile);
}

/*
If both monkeys are doing the same thing, you are in trouble.
If aSmile is equal to bSmile, then they are doing the same
thing, which means that you're in trouble.
aSmile == bSmile will return true if they are the same, and
false if they are different.
*/
