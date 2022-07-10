import java.util.Scanner;
class MissingNumberFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in .nextInt();
        int[] arr = new int[size-1];
        for(int i=0;i<size-1;i++)
            arr[i] = in.nextInt();
        System.out.println(missingNumberFinder(arr, size));
    }
    static int missingNumberFinder(int array[], int n) {
        int arrlen = array.length;
        int sum = ((arrlen + 1) * (arrlen + 2)) / 2; //Calculate the sum of all the elements from 1 to arrlen
        for(int i = 0; i < arrlen; i++)
            sum -= array[i];
        return sum;
    }
}