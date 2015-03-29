package simple.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author kritterbusch
 */
public class EmployeeRecords {

    public static void main(String[] args) {
        Map<String, String> e1 = new HashMap<>();
        e1.put("firstName", "Mr.");//(Key, Value)
        e1.put("lastName", "Bucket");
        e1.put("ID", "100");
        
        Map<String, String> e2 = new HashMap<>();
        e2.put("firstName", "Gormo");
        e2.put("lastName", "Merr");
        e2.put("ID", "22");

        List<Map<String, String>> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        

        
        
    }
}
