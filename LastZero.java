import java.util.Arrays;
import java.util.Scanner;

class LastZero {
    public static void main(String[] args) {
        LastZero lastZero = new LastZero();
     // int arr[] = {9, 2, 0, 4, 3, 0, 2, 0};
       Scanner in = new Scanner(System.in);
        System.out.println("Enter lenght of the array: ");
        int input = in.nextInt();
        int[] arr = new int[input];
        for(int i=0;i<input;i++){
            System.out.println("Enter "+(i+1)+"th element of array");
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(lastZero.sortedLastZero(arr)));
    }

    public int[] sortedLastZero(int[] a) {
        int lastIndex = a.length - 1;
        for (int i = 0; i <= lastIndex; i++) {
            if (a[i] == 0) {
                while (lastIndex > i && a[lastIndex] == 0) {
                    lastIndex--;
                }

                if (lastIndex > i) {
                    int temp = a[lastIndex];
                    a[lastIndex] = a[i];
                    a[i] = temp;
                    lastIndex--;
                }
            }
        }
        return a;
    }
}

