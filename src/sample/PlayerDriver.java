package sample;

public class PlayerDriver {
  public static void testPlayer(){

    MonitorType led = MonitorType.LED;

    AudioPlayer test1 = new AudioPlayer("iPod Mini","MP3");
    MoviePlayer test2 = new MoviePlayer("Pyle PDV156BK",new Screen("1366x768",40,22),led);

    test1.next();
    test1.play();
    test1.previous();
    test1.stop();


    test2.next();
    test2.play();
    test2.previous();
    test2.stop();

  }
}
