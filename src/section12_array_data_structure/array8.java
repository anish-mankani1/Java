package section12_array_data_structure;
import java.util.Scanner;
import java.util.Arrays;
public class array8 {
    public static void main(String[] args) {
        int[] a=new int[5];
        Scanner input=new Scanner(System.in);
        System.out.println("enter the values of arrays");
        for(int i=0;i<5;i++){
            a[i]=input.nextInt();
        }
        System.out.println("The arrsy is " + Arrays.toString(a));




int[] b=new int[a.length];

        for(int i=a.length-1,j=0 ; i>=0; i--,j++) {
           b[j]=a[i];

        }
        System.out.println("The reverse array  is " +(Arrays.toString(b)));





    }
}
