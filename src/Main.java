import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    NearbyFinder finder = new NearbyFinder();
    /*{2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323},
            {1, 3, 5, 7},
            {321, 320, 32, 3, 41241, -11, -12, -13, -66, -688}*/
    System.out.println(Arrays.toString(finder.getNearby(0, 0, 10)));


  }
}
