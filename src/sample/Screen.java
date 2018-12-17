package sample;

public class Screen implements ScreenSpec {
  String resolution = "3840 × 2160";
  int refreshRate = 60;
  int responseTime = 1;

  /**
   * Constructor for a Screen
   *
   * Takes in
   *
   * @param resolution ex. 1920X1080
   * @param refreshRate ex. 60 Hz
   * @param responseTime ex. 4ms
   */
  public Screen(String resolution, int refreshRate, int responseTime) {
    this.resolution = resolution;
    this.refreshRate = refreshRate;
    this.responseTime = responseTime;
  }

  /**
   *
   * @return
   */
  public String toString() {
    return "Resolution : " + resolution + "\n" +
        "Refresh rate : " + refreshRate + "\n" +
        "Response time : " + responseTime;
  }

  @Override
  public String getResolution() {
    return this.resolution;
  }

  @Override
  public int getRefreshRate() {
    return this.refreshRate;
  }

  @Override
  public int getResponseTime() {
    return this.responseTime;
  }
}
