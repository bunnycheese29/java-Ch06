import java.util.Calendar;

public class CalenderEx {

  public static void main(String[] args) {
    Calendar now = Calendar.getInstance(); //singleton 패턴
    int year = now.get(Calendar.YEAR);
    int month = now.get(Calendar.MONTH) + 1;
    int day = now.get(Calendar.DAY_OF_WEEK); //1,2,3,4,5,6,7
    int hour = now.get(Calendar.HOUR);
    int hourOfDay = now.get(Calendar.HOUR_OF_DAY);
    int apm = now.get(Calendar.AM_PM); //0 AM / 1 PM
    System.out.println(year);
    System.out.println(month);
    System.out.println(day);
    System.out.println(hour); //0~12시
    System.out.println(hourOfDay); //0~24시
    System.out.println(apm);
    if (day == 1) {
      System.out.println("일요일");
    } else if (day == 5) {
      System.out.println("목요일");
    }
  }
}
