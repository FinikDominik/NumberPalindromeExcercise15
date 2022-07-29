public class Main {
    public static void main(String[] args) {
        isPalindrome(-222);
    }

    public static boolean isPalindrome(int number) {


        if (number < 0)  {
            number *= -1;
        }

        int reverse = 0;
        int stored = number;
        while (stored > 0 ) {
            int lastDigit = stored % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            stored = stored / 10;
        }
        if (number == reverse) {
            System.out.println("Number is Palindrome");
            return true;
        }
        System.out.println("Number is not Palindrome");
        return false;
    }
}