import java.beans.PropertyEditorSupport;

public class Subarray2 {
    public static void main(String[] args) {
        int[]  a={1,2,3,5,4};
    int current_product=1;
    int maximun_Sum=Integer.MIN_VALUE;

    for(int x:a)
    {
        current_product*=x;
        maximun_Sum=Math.max(current_product,maximun_Sum);
        
    }
        System.out.println("the maximum sum is " + maximun_Sum);

    }
}
