import java.util.StringTokenizer;

public class StringTokenizerEx {

  public static void main(String[] args) {
    String txt = "홍길동/장화/홍련/콩쥐/팥쥐:고길동:둘리";
    StringTokenizer st = new StringTokenizer(txt, "/:");
    System.out.println(st.nextToken()); //홍길동
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }
    // int n = st.countTokens();
    // for (int i = 0; i < n; i++) {
    //   String token = st.nextToken();
    //   System.out.println(token);
    // }
  }
}
