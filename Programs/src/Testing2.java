public class Testing2 {
  boolean isPalin(int x) {
      int c = 0;
      int z = x;
      while (z != 0) {
          c = c * 10 + z % 10;
          z = z / 10;
      }
      return c == x;
  }
}
