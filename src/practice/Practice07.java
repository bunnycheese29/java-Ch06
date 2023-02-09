package practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice07 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print(">>");
      String s = scanner.nextLine();
      if (s.equals("그만")) {
        System.out.println("종료합니다...");
        break;
      }

      StringTokenizer st = new StringTokenizer(s, " ");
      System.out.println("어절 개수는 " + st.countTokens());
    }
    // while (true) {
    //   System.out.print(">>");
    //   String s = scanner.nextLine();
    //   if (s.equals("그만")) {
    //     System.out.println("종료합니다...");
    //     break;
    //   }
    //   String words[] = s.split(" ");
    //   System.out.println("" + words.length);
    // }
    scanner.close();
  }
}
