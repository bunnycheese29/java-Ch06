public class StringBufferEx {

  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("This");
    System.out.println(sb);
    sb.append(" is pencil"); //This is pencil
    System.out.println(sb);

    sb.insert(8, "my "); //This is my pencil
    System.out.println(sb);

    sb.replace(8, 10, "your"); //This is your pencil
    System.out.println(sb);

    sb.delete(8, 13); //This is pencil
    System.out.println(sb);

    sb.setLength(4); //This
    System.out.println(sb);
  }
}
