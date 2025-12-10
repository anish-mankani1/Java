package section12_array_data_structure;
import java.util.Scanner;
import java.util.Arrays;
public class array7 {
    public static void main(String[] args) {
        int[] a=new int[5];
        Scanner input=new Scanner(System.in);
        System.out.println("enter the values of arrays");
        for(int i=0;i<5;i++){
            a[i]=input.nextInt();
        }
        System.out.println("The arrsy is " + Arrays.toString(a));


        System.out.println("enter the position in which you want to copy an element");
        int position= input.nextInt();;



        int copy_element=0;

        for(int i=0; i<a.length; i++) {
            if (i == position) {
                copy_element = a[i];
            }
        }
            System.out.println("The copy elemeent is " +(copy_element));





    }
}
