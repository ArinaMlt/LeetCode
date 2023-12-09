package leetCode;

import java.util.Arrays;

/**
 * Напишите функцию для поиска самой длинной строки общего префикса среди
 * массива строк.
 * Если общего префикса нет, верните пустую строку "".
 * 
 * 
 * Пример 1:
 * Ввод: strs = ["цветок","поток","полет"]
 * ["flower","flow","flight"]
 * Вывод: "fl"
 * 
 * Пример 2:
 * Ввод: strs = ["dog","racecar","car"]
 * Выход: ""
 * Объяснение: Во входных строках нет общего префикса.
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {

        System.out.println(longestCommonPrefix2(new String[] { "flow", "flower", "flight" }));
    }

    public static String longestCommonPrefix(String[] strs) {
        char[] one = strs[0].toCharArray();
        int prefixLength = one.length;
        char[] prefix = new char[prefixLength];
        int i = 0;
        String answer = "";
        while (i < prefixLength) {
            for (int j = 1; j < strs.length; j++) {
                if ((prefixLength >= strs[j].length()) && (one[i] == strs[j].charAt(i))) {
                    if (j == strs.length - 1) {
                        prefix[i] = strs[j].charAt(i);
                    }
                } else {
                    return String.valueOf(prefix);
                }
            }
            i++;
        }
        answer = new String(prefix);
        answer = answer.replaceAll(" ", "");
        System.out.println("length: " + answer.length());
        return answer;
    }

    public static String longestCommonPrefix2(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int ind = 0;
        while (ind < s1.length() && ind < s2.length()) {
            if (s1.charAt(ind) == s2.charAt(ind)) {
                ind++;
            } else {
                break;
            }

        }
        return s1.substring(0, ind);
    }
}
