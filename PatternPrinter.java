import java.util.Scanner;
class PatternPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        patternPrinter(n);
    }
    static void patternPrinter(int n) {
        int i, j, k, l=n;
        for (i = n; i >= 1; i--)
        {
            for (j = n; j >= 1; j--)
            {
                for (k = 1; k <= l; k++)
                {
                    System.out.print(j);
                }
            }
            l = l - 1;
            System.out.println();
        }
    }
}