package inheritance_programs;

import java.util.*;

public class sdsd {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
      int target=3;
        System.out.println("the origignal array is  " + Arrays.toString(a));

Map<Integer,Integer> obj=new HashMap<>();
obj.put(0,1);
int sum=0;
int count=0;

for(int x:a)

{
    sum+=x;
    if(obj.containsKey(sum-target))
    {
count+=obj.get(sum-target);
    }

    obj.put(sum,obj.getOrDefault(sum ,0)+1);
}
        System.out.println(obj);



    }
}
