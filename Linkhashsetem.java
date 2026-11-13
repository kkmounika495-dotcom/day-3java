
import java.util.LinkedHashSet;

public class Linkhashsetem {
    public static void main(String[] args) {

        LinkedHashSet<Integer> employees = new LinkedHashSet<Integer>();

        employees.add(101);
        employees.add(102);
        employees.add(103);
        employees.add(104);
        employees.add(105);
        employees.add(106);
        employees.add(107);
        employees.add(108);
        employees.add(109);
        employees.add(110);
        employees.add(111);

        System.out.println("LinkedHashSet: " + employees);

        System.out.println("Student 102: " + employees.contains(102));

        employees.remove(103);

        System.out.println("After Removing: " + employees);

        System.out.println("Size: " + employees.size());

        System.out.println("Is Empty: " + employees.isEmpty());
    }
}
