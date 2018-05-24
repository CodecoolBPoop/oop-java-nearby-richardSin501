import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    NearbyFinder finder = new NearbyFinder();
    System.out.println(Arrays.toString(finder.getNearby(0, 0, 10)));


  }
}
