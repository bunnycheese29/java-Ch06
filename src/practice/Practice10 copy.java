// package practice;

// import java.util.Scanner;

// class Person01 {

//   private String name;

//   public String getName() {
//     return name;
//   }

//   public Person01(String name) {
//     this.name = name;
//   }

//   public int turn() {
//     Scanner scanner = new Scanner(System.in);
//     System.out.println("[" + name + "]:<Enter>");
//     scanner.nextLine();

//   }
// }

// class Game {
//     public void run(){
//     Scanner scanner = new Scanner(System.in);
//     System.out.println("1번째 선수 이름>>");
//     Person01 player01 = new Person01("");

//     System.out.println("["+player01.getName() + "]:<Enter>");
//     scanner.nextLine();
//     player01.turn();
//     int a = (int) (Math.random() * 3 + 1);
//     int b = (int) (Math.random() * 3 + 1);
//     int c = (int) (Math.random() * 3 + 1);
//     if (a == b && b == c) {
//       System.out.println(
//         "\t" + a + "\t" + b + "\t" + c + "\t" + "님이 이겼습니다!"
//       );
//     } else {
//       System.out.println("\t" + a + "\t" + b + "\t" + c + "\t" + "아쉽군요!");
//     }
//     }
// }

// class Person02 extends Person01 {

//   private String name;

//   public String getName() {
//     return this.name;
//   }

//   public Person02() {}

//   public Person02(String name) {
//     super(name);
//   }
// }

// public class Practice10 {

//   public static void main(String[] args) {

//   }
// }
