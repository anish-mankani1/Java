package section12_array_data_structure;
import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

     //Write a Java program to create an array with the elements {5, 10, 15, 20, 25}. Use a for loop to
        //calculate and print the sum of all elements in the array

        int[] a={5,10,15,20,25};
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("The sum is  " + sum);



    }

}
