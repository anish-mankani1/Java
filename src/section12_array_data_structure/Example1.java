package section12_array_data_structure;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;

public class Example1 {

    //HOW TO CREATE ARRAY
    //int[] nums={1,2,3,4};


    public static void main(String[] args) {
        byte[] bnum = null;
        short[] snums = null;
        int[] num = null;
        String[] snum = null;
        float[] fnum = null;
        char[] cnum = null;
        double[] dnum = null;
        Scanner input = new Scanner(System.in);
        //how to initialized

        //   int[] number={1,2,3};
        //   int[] num1s=new int[4];
        //    int[] numbers=new int[]{1,2,3,4,6};
        //  System.out.println(number[1]); //2
        //  System.out.println(number.length);
        //  System.out.println("enter the values");
        // num1s=input.nextInt();

        //float
        //  float[] number={1.1f,2.9f,3.8f};
        //  float[] num1s=new float[4];
        //  float[] numbers=new float[]{1f,2.4f,3.0f,4.14141f,6.42f};
        //  System.out.println(number[1]); //2
        //  System.out.println(number.length);
        // System.out.println("enter the values")//;
        // System.out.println("size" + 4*num1s.length);


        //   double[] number={1.44,2.32424,3432423.2323};
        // double[] num1s=new double[4];
        // double[] numbers=new double[]{1.324,2.3424,3.1234123,4.44123,6.23242};
        // System.out.println(number[1]); //2
        // System.out.println(number.length);
        // System.out.println("enter the values double");
        //  System.out.println("size" + 8*num1s.lenchar
        // char[] cnumber={'A','B','C'};
        // char[] num1s=new char[4];
        // char[] numbers=new char[]{'A','B','c'};
        // System.out.println(cnumber[1]); //2
        // System.out.println(cnumber.length);
        //System.out.println("enter the values char");
        //System.out.println("size" + 2*num1s.length);

        //
        // String[] number = {"Anish", "manish", "tanish"};
        //
        // String[] num1s = new String[4];
        //
        // String[] numbers = new String[]{"ada", "sadasd", "dasdas", "dsass"};
        //
        // System.out.println(number[1]); //2
        //
        // System.out.println(number.length);
        //
        // System.out.println("enter the values string");
        //
        // System.out.println("size" + 2 * number.length);


        //   int[] a=new int[]{1,2,3,4};
        //    int[] b=new int[4];
        //   int[] c={1,2,3,4,5};

        ////
        boolean[] a = {true, false};
        ////
        boolean[] b = new boolean[2];
        //System.out.println(a[1]);////


        System.out.println("hash code" + a);


        int[] numb = new int[100];
        Arrays.fill(numb, -99);
        numb[0] = -123;


        int[] c = {1, 2, 3, 4};
        int[] d = {1, 6, 3, 4};
        System.out.println(Arrays.compare(c, d));


        int[] ab = new int[4];
        Scanner inputs = new Scanner(System.in);
        // for(int i=0;i<ab.length;i++){
        //  System.out.println("enter the data of array you want");
        //   ab[i]=inputs.nextInt();
        //}
        //  System.out.println("the numbe is " + Arrays.toString(ab));

    }
}
