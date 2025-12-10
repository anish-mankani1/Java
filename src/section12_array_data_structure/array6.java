package section12_array_data_structure;
import java.util.Scanner;
import java.util.Arrays;
public class array6 {
    public static void main(String[] args) {
        int[] a=new int[5];
        Scanner input=new Scanner(System.in);
        System.out.println("enter the values of arrays");
        for(int i=0;i<5;i++){
            a[i]=input.nextInt();
        }
        System.out.println("The arrsy is " + Arrays.toString(a));


        System.out.println("enter the position in which you want to insert an element");
        int position= input.nextInt();;
        System.out.println("enter the element now");
        int element= input.nextInt();

        int[] b=new int[a.length+1];

        for(int j = 0,i=0; j<b.length; j++){
         if(j==position){
             b[j]=element;
         }
         else{
             b[j]=a[i];
             i++;
         }
            System.out.println("The new array is" + Arrays.toString(b));
        }




    }
}
