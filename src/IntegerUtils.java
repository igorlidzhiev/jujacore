/**
 * Created by igorl on 23.11.2015.
 */

public class IntegerUtils {
    public static int leftShift(int arg) {
        //int x = 19;
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(arg));
        int max = arg;
        while (true) {
            sb.insert(0, sb.charAt(sb.length() - 1));
            sb.delete(sb.length() - 1, sb.length());
            int j = Integer.parseInt(sb.toString(), 2);
            if (j > max) {
                max = j;
            }
            if (j == arg) {
                break;
            }
        }
        return max;
    }
}

