package list;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class StringJoinStudy {
    public static void main(String[] args) {
        String message1 = String.join("-", "Java", "is", "cool");
        System.out.println("message1 = " + message1);
        // message returned is : "Java-is-cool"
        
        List<String> strings1 = List.of("Java", "is", "cool");
        String message2 = String.join(" ", strings1);
        System.out.println("message2 = " + message2);
        //message returned is: "Java is cool"

        Set<String> strings2 = new LinkedHashSet<>(List.of("Java", "is", "very", "cool"));
        String message3 = String.join("-", strings2);
        System.out.println("message3 = " + message3);
        //message returned is: "Java-is-very-cool"
    }
}
