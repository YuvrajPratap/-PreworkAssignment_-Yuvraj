import java.util.Scanner;

class FirstLetterPrinter {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(firstLetterPrinter(input));
    }
    static String firstLetterPrinter(String str) {
        char c[] = str.toCharArray();
        String firstletter = "";
        for (int i=0; i < c.length; i++) {
            // Logic to implement first character of each word in a string
            if(c[i] != ' ' && (i == 0 || c[i-1] == ' ')) {
                firstletter += c[i];
            }
        }
        return firstletter;
    }
}