public class Solution5 {
    public static int primeiroCaractereUnico(String input) {
        int[] charCount = new int[256];

        for (char c : input.toCharArray()) {
            charCount[c]++;
        }

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (charCount[c] == 1) {
                return i;
            }
        }

        return -1;
    }
}
