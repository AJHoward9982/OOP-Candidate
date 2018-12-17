package sample;
import java.util.ArrayList;
import java.util.Date;

/**
 * Andrew Howard
 * <p>
 * Product uses the interface Item and has a Product constructor containing SerialNumber ,
 * Manufacturer , ManufactureDate , and Name
 */
public abstract class Product implements Item {
  int serialNumber;
  String manufacturer;
  Date manufacuredOn;
  String name;

  /**
   * Add an integer class variable called currentProductionNumber. This will store the next number to be
   * assigned to serialNumber.
   */
  private static int currentProductionNumber = 1;


  /**
   * A Setter method setProductionNumber
   *
   * @param number production number
   */
  public void setProductionNumber(int number) {
    currentProductionNumber = number;
  }

  /**
   * A Setter method setName
   *
   * @param newName Product name
   */
  public void setName(String newName) {
    this.name = newName;
  }


  /**
   * A Getter method getName
   *
   * @return String Name
   */
  public String getName() {
    return this.name;
  }


  /**
   * A Getter method getManufactureDate
   *
   * @return Manufacture Date
   */
  public Date getManufactureDate() {
    return this.manufacuredOn;
  }


  /**
   * A Getter method getSerialNumber
   *
   * @return Serial Number
   */
  public int getSerialNumber() {
    return this.serialNumber;
  }


  /**
   * Constructor for product that takes in a Name String
   *
   * @param newName Product Name
   */
  public Product(String newName) {
    manufacturer = Item.manufacturer;
    this.name = newName;
    serialNumber = currentProductionNumber++;
    manufacuredOn = new Date();
  }

  /**
   * Formatted toString() method
   *
   * @return Manufacturer , Serial Number , Date , Name
   */
  public String toString() {
    return "Manufacturer : " + manufacturer + "\n" +
        "Serial Number : " + serialNumber + "\n" +
        "Date : " + getManufactureDate() + "\n" +
        "Name : " + getName();
  }

  /**
   * Compares the products' name
   *
   * @param o
   * @return Int
   */
  public int compareTo(Item o) {
    return name.compareTo(o.getName());
  }

  public static void printType( ArrayList<Product> productList ){

    for(Product product : productList){

      if( product instanceof AudioPlayer){

        System.out.println(product);

      }
    }
  }


}

