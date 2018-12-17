package sample;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Andrew Howard
 *
 * User gives their Name and ID
 */
public class EmployeeInfo {

  StringBuilder name;
  String code;

  String deptId;
  Scanner sc = new Scanner(System.in);

  /**
   * Default Constructor
   */
  public EmployeeInfo() {

    setName();
    setDeptId();
    sc.close();
  }

  /**
   * Gets the Employee Name
   *
   * @return the employee name
   */
  public StringBuilder getName() {
    return this.name;
  }

  /**
   * Getter for Employee Code
   *
   * @return Employee Code
   */
  public String getCode() {
    return this.code;
  }

  /**
   * Setter for Employee Name
   */
  private void setName() {

    String inputName = inputName();
    StringBuilder name = new StringBuilder(inputName);
    boolean nameCheck = checkName(name); //return from nameCheck
    if(nameCheck){
      createEmployeeCode(name);
    }
    else{
      this.code = "guest";
    }
  }


  /**
   * Takes the first letter of the Employees name and adds it to the last name
   */
  private void createEmployeeCode(StringBuilder name) {
    int spaceAt = name.indexOf(" ");
    StringBuilder nameCut = name.delete(1,spaceAt+1);
    this.code = nameCut.toString();
  }


  /**
   * Gets the Employees input for name
   *
   * @return First and LAst name of Epmloyee
   */
  private String inputName() {

    System.out.println("Please enter your first and last name: ");
    String name = sc.nextLine();
    return name;

  }

  /**
   * Checks the name for the nameSplitter
   */
  private boolean checkName(StringBuilder name) {
    if(name.toString().contains(" ")){
      return true;
    }
    else{
      return false;
    }

  }

  /**
   * Getter for department ID
   */
  private String getDeptId() {
    return this.deptId;
  }

  /**
   * Setter for the Department ID
   */
  public void setDeptId() {

    String id = getId();
    boolean validCheck = validId(id);
    if(validCheck){
      this.deptId = id;
    }
    else{
      this.deptId = "None01";
    }


  }

  public String getId(){
    System.out.println("Please enter the department ID: ");
    String id = sc.nextLine();

    return id;
  }

  /**
   * Checks that the ID is valid by using Regular Expressions
   *
   * @return True or False match for "Valid ID"
   */
  private boolean validId(String id) {

    Pattern p = Pattern.compile("[A-Z][a-z]{3}[0-9]{2}");

    Matcher matcher = p.matcher(id);
    boolean matches = matcher.matches();

    return matches;

  }

  /**
   * Reverses the string input
   * @param id
   * @return Reversed ID
   */
  public String reverseString(String id) {

    if(id.length() == 0){
      return id;
    }
    return reverseString( id.substring(1) ) + id.charAt(0);
  }

  /**
   * New formatted toString() method to output Employee Code and ID number
   *
   * @return printed out version of employee code and department number.
   */
  @Override
  public String toString() {

    return "Employee Code : " + getCode() + "\n" +
        "Department Number : " + getDeptId();

  }

}
