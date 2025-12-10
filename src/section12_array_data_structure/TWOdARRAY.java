package section12_array_data_structure;


import java.util.Arrays;

public class TWOdARRAY {
        public static int[][] two_d_array(int[][] matrix1, int[][] matrix2) {
            int[][] result = new int[2][2];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2.length; j++) {
                    for (int k = 0; k < matrix1.length; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            return result;
        }
        public static int[][]print_array(int[][]result){
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }

            return result;
        }




                public static void main (String[]args){


                    int[][] matrix1 = {
                            {1, 2},
                            {3, 4}
                    };
                    int[][] matrix2 = {
                            {5, 6},
                            {7, 8}
                    };
                    int[][] matrix3={
                            {9,10},
                            {11,12}
                    };


                    int[][] result=two_d_array(matrix1, matrix2);
                   print_array(result);
                     result=two_d_array(matrix1, matrix3);
                    print_array(result);

                }
            }


