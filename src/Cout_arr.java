public class Cout_arr {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';

    public static int countWords(String input) {

        if (input == null) {
            return -1;
        }
        int count = 0;
        int size = input.length();
        for (int i = 0; i < size; i++) {
            boolean notCounted = true;
            if (input.charAt(i) != SPACE && input.charAt(i) != TAB
                    && input.charAt(i) != BREAK_LINE) {
                if(notCounted) {
                    count++;
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        return count;
    }
}

