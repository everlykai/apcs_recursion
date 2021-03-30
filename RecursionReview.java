public class RecursionReview {
    public static void main(String[] args) {
//        triangle(5);
//        reverseTriangle(5);
//        System.out.println(getGCF(252, 105));
//        System.out.println(reverse("meow"));
//        System.out.println(isPalindrome("race car"));
//        System.out.println(isPalindrome("not race car"));
    }

    public static String reverse(String word) {
        if (word.length() == 0) return "";
        String lastLetter = word.substring(word.length()-1);
        String trimmed = word.substring(0,word.length()-1);
        return lastLetter+reverse(trimmed);
    }

    public static boolean isPalindrome(String word) {
        word = word.trim();
        if (word.length() < 2) return true;

        char a = word.charAt(0);
        char b = word.charAt(word.length()-1);
        String trimmed = word.substring(1,word.length()-1);

        return a == b && isPalindrome(trimmed);
    }

    private static int getGCF(int a, int b) {
        if (a == b) return a;
        if (a > b) {
            int newA = a-b;
            return getGCF(newA, b);
        }
        else if (b > a) {
            int newB = b-a;
            return getGCF(a, newB);
        }

        return 1;
    }
    private static void triangle(int n) {
        if (n == 0) return;
        printStars(n);
        triangle(n-1);
    }

    private static void reverseTriangle(int n) {
        if (n == 0) return;
        reverseTriangle(n-1);
        printStars(n);
    }

    private static void printStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
