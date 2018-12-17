package sample;
/**
 * Andrew Howard
 *
 * ENUM for the different display types
 */
public enum MonitorType {
  LCD("LCD") , LED("LED");

  public String code;

  MonitorType(String item) {
    this.code = item;
  }
}