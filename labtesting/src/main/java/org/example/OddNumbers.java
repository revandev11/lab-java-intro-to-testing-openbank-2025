package org.example;

import java.util.ArrayList;
import java.util.List;
public class OddNumbers {
    public static int[] getOddNumbersUpTo(int n) {
        if (n < 1) {
            return new int[0];
        }

        List<Integer> odds = new ArrayList<>();
        for (int i = 1; i <= n; i += 2) {
            odds.add(i);
        }
        return odds.stream().mapToInt(i -> i).toArray();
    }
}
