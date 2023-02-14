package Yoho;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Yoho {
    public static void main(String[]args) {
        Yoh.getEmployeeForManager();
    }
}

class Yoh {
    public static void getEmployeeForManager() {
        Map<String, ArrayList> map = new HashMap<>();
        map.put("Ravi", new ArrayList<String>());
        map.put("Mathew", new ArrayList<String>());
        map.put("Kali", new ArrayList<String>());
        map.get("Ravi").add("Ram");
        map.get("Ravi").add("Kanti");
        map.get("Ravi").add("Shah");
        map.get("Ravi").add("Jay");
        map.get("Mathew").add("Shiva");
        map.get("Mathew").add("Jake");
        map.get("Mathew").add("Pope");
        map.get("Kali").add("Suresh");
        map.get("Kali").add("Tim");
        System.out.println("The List of all Managers and Employees : "+map);
        for (var yo : map.keySet()) {
            System.out.println("Manager: "+yo+" has following employees: "+map.get(yo));
        } // end of for
    }
}