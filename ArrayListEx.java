import java.util.*;
public class ArrayListEx{
   public static void main (String args[])
   {
       ArrayList<Integer> list=new ArrayList<>();
       list.add(1);
       list.add(6);
       list.add(17);
       list.add(31);
       list.add(90);
       System.out.println("List of Integers:"+list);

       list.remove(2);
       System.out.println("After removing 3rd element:"+list);
       
       list.set(1,60);
       System.out.println("After updating 2nd element:"+list);
       System.out.println("Final List");
       for (Integer list1: list)
       {
         System.out.println(list1);

       }
    }
       
} 