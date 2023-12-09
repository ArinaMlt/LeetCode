package leetCode;

import java.lang.reflect.Array;

/**
 * Учитывая две строки needleи haystack, верните индекс первого вхождения
 * needlein haystackили, -1если needleон не является частью haystack.
 * 
 * 
 * 
 * Пример 1:
 * Ввод: haystack = «sadbutsad», Needle = «sad»
 * Выход: 0
 * Объяснение: «sad» встречается в индексах 0 и 6.
 * Первое вхождение имеет индекс 0, поэтому мы возвращаем 0.
 * 
 * Пример 2:
 * Ввод: haystack = "leetcode", Needle = "leeto"
 * Вывод: -1
 * Объяснение: "leeto" не встречается в "leetcode", поэтому мы возвращаем -1.
 */
public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        System.out.println(strStr("aa", "aaaa"));

    }

    public static int strStr(String haystack, String needle) {
        char[] c = haystack.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (needle.charAt(0) == c[i] && (i + needle.length() <= c.length)) {
                if (haystack.substring(i, needle.length() + i).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int strStr2(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            if (i + needle.length() <= haystack.length()) {
                if (haystack.substring(i, needle.length() + i).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

}
