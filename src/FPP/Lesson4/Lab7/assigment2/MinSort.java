package FPP.Lesson4.Lab7.assigment2;

public class MinSort {

    public String sort(String s) {
        // Base case: if the string has only one character, return it
        if (s.length() == 1) {
            return s;
        }

        // Find the position of the alphabetically least character in the string
        int minpos = findMinPos(s);

        // Swap the character in position 0 with the character ch in position minpos
        char ch = s.charAt(minpos);
        char[] chars = s.toCharArray();
        chars[minpos] = chars[0];
        chars[0] = ch;

        // Remove character ch from the string, store it, and call the remaining string t
        String t = new String(chars, 1, chars.length - 1);

        // Sort t recursively and place in storage to the right of the character ch
        String sortedT = sort(t);

        // Return the stored string with the character ch and the sorted t
        return ch + sortedT;
    }

    private int findMinPos(String s) {
        int minpos = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(minpos)) {
                minpos = i;
            }
        }
        return minpos;
    }

    public static void main(String[] args) {
        MinSort ms = new MinSort();
        String result = ms.sort("zwxuabfkafutbbbb");
        System.out.println(result);
    }
}
