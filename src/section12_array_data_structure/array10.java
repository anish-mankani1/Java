package section12_array_data_structure;
import java.util.Scanner;
import java.util.Arrays;
public class array10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the values of array");
        int[] arraysss={1,2,3,4,5};
        System.out.println("the array is " + Arrays.toString(arraysss));

        System.out.println("enter the position you want to perform right rotate array");
        int k=input.nextInt();

         for(int i=0;i<k;i++){
             int last=arraysss[arraysss.length-1];
             for(int j=arraysss.length - 1;j>0;j--){
                 arraysss[j]=arraysss[j-1];
             }
             arraysss[0]=last;
         }
        System.out.println("the right array is  " + Arrays.toString(arraysss));
        
    }
}
