package TEST;

public class Example6 {
    public static void main(String[] args){
        byte num1=12;
        int num2=1200;
        short num3=123;
        long num4=1234567L;
        char num5='A';
        // int - byte + int
        int result1=num1+num2;
        System.out.print((result1));

         // int -int + short
        int result2= num2 + num3;
        System.out.print((result2));

       long  result3= num3 + num4;
       System.out.print((result3));


        int result4=num5 + 5;
        System.out.print((result4));

        // byte +  short ->> int
        int result5= num1 + num3;
        System.out.print((result5));

        // long + interger ->> long

        // Character + Integer -> Integer
        char lcCharacter = 99;  //c
        int lnNextValue  = 2;//  e
        int lnResult     = lcCharacter + lnNextValue;
        System.out.println(lnResult );






    }
}
