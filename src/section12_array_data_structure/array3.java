package section12_array_data_structure;
import java.util.Scanner;
public class array3{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

       //Write a Java program to create an array with the elements {10, 25, 30, 45, 50}. Take a number as
        //input from the user and use a for loop to search for the element in the array. If found, print its index;
        //otherwise, display a message saying the element is not present.

        int[] a={5,10,15,20,25};
        System.out.println("enter the number you want to search");
        int number=input.nextInt();


        int flag=0;
        for (int i=0;i<a.length;i++) {
            if (a[i] == number) {
                flag = i;
            }
        }
            if(flag==0){
                System.out.println("number not found");
            }
            else{
                System.out.println("number found " + flag);
            }





    }

}
