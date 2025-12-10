package section12_array_data_structure;
import java.util.Arrays;
import java.util.Scanner;

public class array12 {
    public static void main(String[] args) {

  Scanner input=new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int rows= input.nextInt();


        System.out.println("Enter the number of column");
        int column= input.nextInt();

        int[][] a=new int[rows][column];

        for(int i=0;i<rows;i++){
           for(int j=0;j<column;j++){
               a[i][j]=input.nextInt();
           }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.print((a[i][j]) + " ");
            }
            System.out.println();
        }


    }
}
