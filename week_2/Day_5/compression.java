

package week_2.Day_5;





public class compression {

    public static int compress(char[] chars) {

        int index = 0;
        int i = 0;

        while(i < chars.length) {

            char current = chars[i];
            int count = 0;

            while(i < chars.length && chars[i] == current) {
                count++;
                i++;
            }

            chars[index++] = current;

            if(count > 1) {
                String cnt = String.valueOf(count);

                for(char c : cnt.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {

        char[] chars = {'a','a','b','b','c','c','c'};

        int newLength = compress(chars);

        System.out.println("New Length = " + newLength);

        System.out.print("Compressed Array = ");
        for(int i = 0; i < newLength; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}