package GenericsAndMaps.studentsolution;

import common.Employee;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author kritterbusch
 */
public class EmployeeWithTreeSet {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Bucket", "Mr.", "111-11-1111");
        Employee e2 = new Employee(2, "Brinstinston", "Gormo", "555-55-5555");
        Employee e3 = new Employee(3, "Nimbo", "Schnib", "333-33-3333");
        Employee e4 = new Employee(2, "Jornston", "Tubey", "222-22-2222");

        Set<Employee> tree = new TreeSet<Employee>();
        tree.add(e1);
        tree.add(e2);
        tree.add(e3);
        tree.add(e4);

        System.out.println("The size of the Sorted Set is: " + tree.size());
        for (Employee e : tree) {
            System.out.println(e);
        }
        
        System.out.println("");
        
        //Use of an iterator
        Iterator<Employee> iterator = tree.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }
}
