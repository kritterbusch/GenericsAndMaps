package GenericsAndMaps.studentsolution;

import common.Employee;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author kritterbusch
 */
public class EmployeeWithTreeMap {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Bucket", "Mr.", "111-11-1111");
        Employee e2 = new Employee(2, "Brinstinston", "Gormo", "555-55-5555");
        Employee e3 = new Employee(3, "Nimbo", "Schnib", "333-33-3333");
        Employee e4 = new Employee(4, "Jornston", "Tubey", "555-55-5555");

        Map map = new TreeMap();
        map.put("111-11-1111", e1);
        map.put("555-55-5555", e2);
        map.put("333-33-3333", e3);
        map.put("555-55-5555", e4);

        Employee e = (Employee) map.get("555-55-5555");
        System.out.println("Retrieving employee with ssn: 555-55-5555: " + e);
        //This time, it printed the second instance of this ssn. not the duplicate. - not sure why it didn't choose the first one.
        //tested to see if it did a second sort by name, but it didn't make a difference.

        System.out.println("\nUsing a keyset, get the employees...");
        Set keys = map.keySet();
        for (Object key : keys) {
            Employee found = (Employee) map.get(key);
            System.out.println(found.toString());
        }

    }
}
