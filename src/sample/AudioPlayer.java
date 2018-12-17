package sample;

/**
 * Andrew Howard
 * <p>
 * Implements Multimedia Control , subclass of Product
 * <p>
 * For Audio Devices
 */
public class AudioPlayer extends Product implements MultimediaControl {

  String audioSpecification;
  ItemType mediaType;

  /**
   * Formatted toString() method to display Audio Spec and Media Type
   *
   * @return Audio Spec and Media Type
   */
  public String toString() {
    return super.toString() + "\n" +
        "Audio Spec : " + audioSpecification + "\n" +
        "Type : " + mediaType;
  }

  /**
   * Prints Playing
   */
  @Override
  public void play() {
    System.out.println("Playing");
  }

  /**
   * Prints Stopped
   */
  @Override
  public void stop() {
    System.out.println("Stopping");
  }

  /**
   * Prints Next
   */
  @Override
  public void next() {
    System.out.println("Next");
  }

  /**
   * Prints Previous
   */
  @Override
  public void previous() {
    System.out.println("Previous");
  }

  /**
   * Constructor that takes in newName and audioSpecification
   * Sets mediaType to AUDIO
   *
   * @param newName
   * @param audioSpecification
   */
  public AudioPlayer(String newName, String audioSpecification) {
    super(newName);

    this.audioSpecification = audioSpecification;

    mediaType = ItemType.AUDIO;
  }
}