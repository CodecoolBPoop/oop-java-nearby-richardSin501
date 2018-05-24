import java.util.Arrays;

public class NearbyFinder {

  private int[][] twoDimInts;

  /**
   *
   * @param twoDimInts 2 dimensional array of <code>ints</code>
   */
  public NearbyFinder(int[][] twoDimInts) {
    this.twoDimInts = twoDimInts;
  }

  /**
   * Constructor with a default array;
   */
  public NearbyFinder() {
    this.twoDimInts = new int[][]{
        {2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323},
        {1, 3, 5, 7},
        {321, 320, 32, 3, 41241, -11, -12, -13, -66, -688}
    };
  }

  /**
   * @param x <code>int</code> x coordinate
   * @param y <code>int</code> y coordinate
   * @return an <code>int[]</code> with the nearby elements of the
   * target at [x, y] within the maximum
   * "distance" of range (excluding the target element itself)
   */
  public int[] getNearby(int x, int y, int range) {
    if (x < 0 || x > this.twoDimInts.length - 1) {
      return new int[]{};
    }

    int[] row = this.twoDimInts[x];
    int[] firstHalfArray;
    int[] secondHalfArray;

    if (y<0 || y > row.length-1) {
      return new int[]{};
    }

    if (y - range >= 0) {
      firstHalfArray = Arrays.copyOfRange(row, y - range, y);

    } else {
      firstHalfArray = Arrays.copyOfRange(row, 0, y);
    }

    if (y + 1 == row.length) {
      return firstHalfArray;

    } else if (row.length < y + 1 + range) {
      secondHalfArray = Arrays.copyOfRange(row, y + 1, row.length);

    } else {
      secondHalfArray = Arrays.copyOfRange(row, y + 1, y + 1 + range);

    }

    int[] resultArray = new int[firstHalfArray.length + secondHalfArray.length];

    System.arraycopy(firstHalfArray, 0, resultArray, 0, firstHalfArray.length);
    System.arraycopy(
        secondHalfArray, 0, resultArray,
        firstHalfArray.length, secondHalfArray.length
    );

    return resultArray;

  }


}
