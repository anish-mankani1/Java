package section12_array_data_structure;
import java.util.Scanner;
import java.util.Arrays;
public class array9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the values of array");
        int[] arraysss={1,2,3,4,5};
        System.out.println("the array is " + Arrays.toString(arraysss));

        System.out.println("enter the position you want to perform left rotate array");
        int k=input.nextInt();

        for (int i=0;i<k;i++){
            int first=arraysss[0];
            for (int j=0;j< arraysss.length-1;j++){
                arraysss[j]=arraysss[j+1];

            }
            arraysss[arraysss.length-1]=first;
        }
        System.out.println("The left rotate array is " + Arrays.toString(arraysss));

    }
}
