package section12_array_data_structure;
import java.util.Scanner;
import java.util.Arrays;
public class array5{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);



        int[] a={5,10,15,20,25};
        System.out.println("The array is " + Arrays.toString(a));
       // System.out.println("Enter the elemnt you want to delete");
       //// int number=input.nextInt();
       //// System.out.println("the emelment want to delete is" + number);

        int b=2;
        int[] c=new int[3];
        for(int i=0;i<c.length;i++){  // 0<5
           c[i]=a[i + 2]; //0+2
                  }
        System.out.println("the new array is" + Arrays.toString(c));








    }

}
