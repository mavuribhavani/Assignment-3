import java.util.*;

public class HashMapEx {
    public static void main(String args[]) {
        HashMap<Integer, String> students = new HashMap<>();
        
        students.put(201, "Viswa");
        students.put(202, "Kumar");
        students.put(203, "Venkat");
        students.put(204, "Sai");
        students.put(205, "Prasad");
        
        int rollNumberToFind = 203;
        System.out.println("Student with Roll No " + rollNumberToFind + ": " + students.get(rollNumberToFind));
        int rollNumberToRemove = 202;
        
        students.remove(rollNumberToRemove);
        System.out.println("Removed student with Roll No " + rollNumberToRemove);
        System.out.println("All Student Records:");
        
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
