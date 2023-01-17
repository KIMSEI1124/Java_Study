package map;

import java.util.*;

public class KeySetSortStudy {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("c", 3);
        map.put("b", 2);
        System.out.println("map = " + map);
        // map = {a=1, b=2, c=3}

        Set<String> set = map.keySet();
        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println("list = " + list);
        // list = [a, b, c]
    }

}
