package Java_Level2;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public static void main(String[] args) {
        String input = "automation";

        // HashMap donde:
        // key = carácter
        // value = número de veces que aparece
        Map<Character, Integer> map = new HashMap<>();

        // Recorremos cada carácter del string
        for (char c : input.toCharArray()) {
            // getOrDefault:
            // - si el carácter ya existe, toma su valor actual
            // - si no existe, usa 0
            // luego sumamos 1
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Imprime el conteo final
        System.out.println(map);
    }
}
