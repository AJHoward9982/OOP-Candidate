package sample;

/**
 * Andrew Howard
 *
 * ENUM for the different display types
 */
public enum ItemType {
  AUDIO("AU"), AUDIOMOBILE("AM"), VISUAL("VI"), VISUALMOBILE("VM");

  public String code;

  ItemType(String item) {
    this.code = item;
  }


}
