package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Учитывая массив целых чисел nums и целое число target,
 * верните индексы двух чисел так, чтобы их сумма составляла target.
 * 
 * Вы можете предположить, что каждый вход будет иметь ровно одно решение,
 * и вы не можете использовать один и тот же элемент дважды.\
 * Вы можете вернуть ответ в любом порядке.
 * 
 * Пример 1:
 * Ввод: nums = [2,7,11,15], target = 9
 * Выход: [0,1]
 * Объяснение: поскольку nums[0] + nums[1] == 9, мы возвращаем [0, 1].
 * 
 * Пример 2:
 * Ввод: nums = [3,2,4], цель = 6
 * Вывод: [1,2]
 * 
 * Пример 3:
 * Ввод: nums = [3,3], цель = 6
 * Вывод: [0,1]
 */
public class TwoSum {
    public static void main(String[] args) {
        // int[] nums = new int[] { 2, 7, 11, 15 };
        // int[] nums = new int[] { 3, 2, 4 };
        int[] nums = new int[] { 3, 3 };

        // int target = 9;
        int target = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < n; i++) {
            int t = target - nums[i];
            if ((map.containsKey(t)) && (map.get(t) != i)) {
                return new int[] { i, map.get(t) };
            }
        }
        return new int[] {};
    }
}
