package GenericsAndMaps.studentsolution;

import java.util.HashMap;
import java.util.Map;
import common.Employee;
import java.util.Set;

/**
 * @author kritterbusch
 */
public class EmployeeWithHashMap {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Bucket", "Mr.", "111-11-1111");
        Employee e2 = new Employee(2, "Trinstinston", "Gormo", "222-22-2222");
        Employee e3 = new Employee(3, "Nimbo", "Schnib", "333-33-3333");
        Employee e4 = new Employee(4, "Jornston", "Tubey", "222-22-2222");

        Map map = new HashMap();
        map.put("111-11-1111", e1);
        map.put("222-22-2222", e2);
        map.put("333-33-3333", e3);
        map.put("222-22-2222", e4);

        Employee e = (Employee) map.get("222-22-2222");
        System.out.println("Retrieving employee with ssn: 222-22-2222: " + e);
        //only prints the first instance of this ssn. not the duplicate.

        System.out.println("\nUsing a keyset, get the employees...");
        Set keys = map.keySet();
        for (Object key : keys) {
            Employee found = (Employee) map.get(key);
            System.out.println(found.toString());
        }
    }

}
