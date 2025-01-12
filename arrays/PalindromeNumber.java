package arrays;

public class PalindromeNumber 
{
    public static void main(String[] args) 
    {
        int x = -656;

        int rev = 0;
        int n = x;

        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }

        if (rev == x && x >= 0)
            System.out.println("Is a palindrome");
        else
            System.out.println("Not palindrome");
    }
}
