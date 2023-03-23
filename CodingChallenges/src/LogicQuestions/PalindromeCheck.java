package LogicQuestions;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "level";
        boolean isPalindrome = checkPalindrome(str);
        if(isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean checkPalindrome(String str) {
        int n = str.length();
        for(int i=0; i<n/2; i++) {
            if(str.charAt(i) != str.charAt(n-i-1)) {
                return false; // characters do not match
            }
        }
        return true; // string is a palindrome
    }
}
