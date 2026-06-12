package week_2.Day_4;
public class reverse {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";


        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder(words[i]);
            result.append(word.reverse());

            if (i != words.length - 1) {
                result.append(" ");
            }
        }

        System.out.println(result.toString());
    }
}