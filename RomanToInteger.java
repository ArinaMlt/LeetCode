package leetCode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Дана римская цифра, преобразуйте ее в целое число.
 * 
 * Пример 1:
 * Ввод: s = «III»
 * Выход: 3
 * Объяснение: III = 3.
 * 
 * Пример 2:
 * Ввод: s = «LVIII»
 * Выход: 58
 * Объяснение: L = 50, V = 5, III = 3.
 * 
 * Пример 3:
 * Ввод: s = "MCMXCIV"
 * Вывод: 1994 г.
 * Объяснение: M = 1000, CM = 900, XC = 90 и IV = 4.
 */
public class RomanToInteger {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        // блок кода, время выполнения которого нужно измерить
        long endTime = System.nanoTime();

        String s = "III";
        // String s = "LVIII";
        // String s = "MCMXCIV";

        System.out.println(romanToInt("D"));
        long timeElapsed = endTime - startTime;

        System.out.println("Время: " + timeElapsed);
    }

    public static int romanToInt(String s) {
        int result = 0;
        String[] line = s.split("");
        System.out.println(Arrays.toString(line));
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("X", 10);
        map.put("V", 5);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        int i = line.length;
        if (i > 0) {
            i--;
            while (i >= 1) {
                if (map.get(line[i]) > map.get(line[i - 1])) {
                    result = result + (map.get(line[i]) - map.get(line[i - 1]));
                    i = i - 2;
                } else if (map.get(line[i]) < map.get(line[i - 1])) {
                    result = result + (map.get(line[i]));
                    i--;
                } else if (map.get(line[i]) == map.get(line[i - 1])) {
                    result = result + map.get(line[i]);
                    i = i - 1;
                }
            }
            if (i == 0) {
                result = result + map.get(line[i]);
            }
        }
        if (i == 1) {
            result = map.get(line[0]);
        }
        return result;
    }
}
