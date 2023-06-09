public class Main {
    public static void main(String[] args) {
        String original = "racecar";
        String reversed = "";

        /*
        Insert code solution here
        */
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println("The word " + original + " is a palindrome.");
        } else {
            System.out.println("The word " + original + " is not a palindrome.");
        }
    }
}
