package TEST;
import java.util.Arrays;
public class Example9 {
    public static void main(String[] args){
        String sdata="Java means s2p";
        System.out.println("The length is " + sdata.length());
        System.out.println(" " + sdata.isEmpty());
String lowercase=sdata.toLowerCase();
        System.out.println("The string  is  " + sdata);
        System.out.println("The string  is  after changes " + lowercase);

      byte[]   bytesss=sdata.getBytes();
      System.out.println(bytesss);
        System.out.println(Arrays.toString(bytesss));

        String[] split=sdata.split(" ");
        System.out.println(Arrays.deepToString((split)));

        String a="anish mankani";
        int  b=a.indexOf('a');
        System.out.println(b);
        String  c=a.substring(0,6);
        System.out.println(c);
    }
}