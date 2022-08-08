package clases;

public class SmartPhone extends SmartDevice {

  public String OS;
  public boolean SMS;


  public SmartPhone() {
  }


  public SmartPhone(String OS, boolean SMS, String color, double weight, double price, String model) {
    super(color, weight, price, model);
    this.OS = OS;
    this.SMS = SMS;
  }


  public String getOS() {
    return this.OS;
  }

  public void setOS(String OS) {
    this.OS = OS;
  }

  public boolean isSMS() {
    return this.SMS;
  }

  public boolean getSMS() {
    return this.SMS;
  }

  public void setSMS(boolean SMS) {
    this.SMS = SMS;
  }


  @Override
  public String toString() {
    return "{" +
      " OS='" + getOS() + "'" +
      ", SMS='" + isSMS() + "'" +
      ", COLOR='" + getColor() + "'" +
      ", MODEL='" + getModel() + "'" +
      ", PRICE='" + getPrice() + "'" +
      ", WEIGHT='" + getWeight() + "'" +
      "}";
  }

}
