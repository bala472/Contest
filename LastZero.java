import java.util.Arrays;
import java.util.Scanner;

class LastZero {
    public static void main(String[] args) {
        LastZero lastZero = new LastZero();
        //  int arr[] = {1, 2, 0, 4, 3, 0, 2, 0};
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
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(j+1 < a.length && a[j]==0){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                }
            }
        }
        return a;
    }
}
