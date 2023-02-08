public class StringEx {

  public static void main(String[] args) {
    String a = new String(" C#");
    String b = new String(",C++ ");
    System.out.println(a.length());

    a = a.concat(b);
    System.out.println(a);

    a = a.trim();
    System.out.println(a);

    System.out.println(a.contains("#"));

    a = a.replace("C#", "Java");
    System.out.println(a);

    String s[] = a.split(","); //문자 분리는 배열로
    System.out.println(s[0]);
    System.out.println(s[1]);

    a = a.substring(2); //va,C++
    System.out.println(a);

    char c = a.charAt(0); //v
    System.out.println(c);
  }
}
