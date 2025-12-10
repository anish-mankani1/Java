package section_13_function;
import java.util.Scanner;
public class function3 {


    public static void print(int start,int end){
        System.out.println("counting from " + start + " to " + end);
        for(int i=start;start<=end;start++) {

            System.out.println("the number are " + start);
        }
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("enter the  ranges you want ");;
        int start=input.nextInt();
        int end=input.nextInt();

        print(start ,end);


    }
}
