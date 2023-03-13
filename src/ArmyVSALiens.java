import java.util.Scanner;

public class ArmyVSALiens {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[4];
    arr[0] = sc.nextInt(); // departure time hh
    arr[1] = sc.nextInt(); // departure time mm
    arr[2] = sc.nextInt(); // travel time hh
    arr[3] = sc.nextInt(); // travel time mm

    float totalMinutesOfTravel = (arr[2] * 60) + arr[3];

    for (float i = 1; i <= totalMinutesOfTravel; i++) {
      arr[1] += 1;
      if (arr[1] > 59) {
        arr[1] = 0;
        arr[0] += 1;
        if (arr[0] > 23) {
          arr[0] = 0;
        }
      }
    }
    System.out.println(String.format("%02d", arr[0]) + " " + String.format("%02d", arr[1]));
  }
  }


