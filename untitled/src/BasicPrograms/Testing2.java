package BasicPrograms;

public class Testing2 {
    /**
     * Returns whether the given integer is a palindrome.
     *
     * @param x the integer to check
     * @return {@code true} if the integer is a palindrome, {@code false} otherwise
     */
    public boolean isPalin(int x) {
        int c = 0;
        int z = x;
        while (z != 0) {
            c = c * 10 + z % 10;
            z = z / 10;
        }
        return c == x;
    }
}