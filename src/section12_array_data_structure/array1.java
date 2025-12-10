package section12_array_data_structure;
import java.util.Arrays;
import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int a[]=new int[5];
        System.out.println("enter the values");
        for (int i=0;i<a.length;i++){
            a[i]=input.nextInt();
        }
        System.out.println(" The array is " + Arrays.toString(a));


        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("The maximum is " + max);

       int  second_largest=a[0]; //1
        for(int i=0;i<a.length;i++){//0<5
            if(a[i]!=max && a[i]>second_largest){  //0!=5  || 0>0
                second_largest=a[i];
            }
        }
        System.out.println("The maximum is " + second_largest);
    }
}
