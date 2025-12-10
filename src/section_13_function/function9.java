package section_13_function;
import java.util.Scanner;
public class function9{


    public static void pri(int[] arr){
        for (int j : arr) {
            System.out.println(j);
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

       int[] arr={1,2,3,4,5};

        String s1;
       pri(arr);





    }
}
