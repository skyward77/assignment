package week_2.Day_4;

import java.util.*;

public class parenthesis {

    public static void generate(List<String> result,
                                String current,
                                int open,
                                int close,
                                int n) {

        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        if (open < n) {
            generate(result, current + "(", open + 1, close, n);
        }

        if (close < open) {
            generate(result, current + ")", open, close + 1, n);
        }
    }

    public static void main(String[] args) {
        int n = 3;

        List<String> result = new ArrayList<>();
        generate(result, "", 0, 0, n);

        System.out.println(result);
    }
}