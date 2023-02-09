package practice;

import java.util.Calendar;
import java.util.Scanner;

class Player01 {

  private String name;

  public Player01(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public int turn() {
    System.out.println(name + "시작 <Enter>키>>");
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();
    Calendar calendar = Calendar.getInstance();
    int startSec = calendar.get(Calendar.SECOND);
    System.out.println("현재 초 시간 = " + startSec);
    System.out.println("10초 예상 후 <Enter>키>>");
    scanner.nextLine();

    calendar = Calendar.getInstance();
    int endSec = calendar.get(Calendar.SECOND);
    if (startSec > endSec) {
      endSec += 60;
    }
    System.out.println("현재 초 : " + endSec);
    return Math.abs(endSec - startSec);
  }
}

class Game {

  public void run() {
    Player01 p01 = new Player01("황기태");
    Player01 p02 = new Player01("이재문");
    System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
    int duration01 = p01.turn();
    int duration02 = p02.turn();
    System.out.println(
      p01.getName() +
      "의 결과 " +
      duration01 +
      ", " +
      p02.getName() +
      "의 결과 " +
      duration02 +
      ", "
    );
    System.out.println("승자는 ");
    if (Math.abs(10 - duration01) < Math.abs(10 - duration02)) {
      System.out.println(p01.getName());
    } else if (Math.abs(10 - duration01) > Math.abs(10 - duration02)) {
      System.out.println(p02.getName());
    } else {
      System.out.println("비김");
    }
  }
}

public class Practice06 {

  public static void main(String[] args) {
    Game game = new Game();
    game.run();
  }
}
