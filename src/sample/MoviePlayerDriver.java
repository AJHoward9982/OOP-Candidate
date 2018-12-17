package sample;

public class MoviePlayerDriver {
  public static void testMoviePlayer(){
    MonitorType lcd = MonitorType.LCD;
    MonitorType led = MonitorType.LED;

    MoviePlayer test1 = new MoviePlayer("DBPOWER MK101",new Screen("720x480",40,22),lcd);
    MoviePlayer test2 = new MoviePlayer("Pyle PDV156BK",new Screen("1366x768",40,22),led);

    System.out.println(test1);
    System.out.println(test2);

  }
}
