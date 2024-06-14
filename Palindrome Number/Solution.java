class Solution {
  public boolean isPalindrome(int x) {
    String string = String.valueOf(x):
    int length = string.length();

    for (int i = 0; i < length / 2; i++) {
      if (string.charAt(i) != string.charAt(length - i - 1)) {
        return false;
      }
    }
    return true;
  }
}
