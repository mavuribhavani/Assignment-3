import java.util.*;
public class HashSetEx{
   public static void main (String args[])
   {
       HashSet<String> cities=new HashSet<>();
       cities.add("Vijayawada");
       cities.add("Guntur");
       cities.add("Chirala");
       cities.add("Tenali");
       cities.add("Chirala");
       System.out.println("List of Cities:"+cities);
       
       String checkcity="Guntur";
       System.out.println("Contains " + checkcity + "? " + cities.contains(checkcity));
       
       cities.remove("Tenali");
       System.out.println("After removing Tenali:"+cities);
    }
       
} 