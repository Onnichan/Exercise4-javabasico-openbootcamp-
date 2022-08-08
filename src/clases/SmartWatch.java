package clases;

public class SmartWatch extends SmartDevice {
  private int pedometer;
  private boolean handsFree;


  public SmartWatch() {
  }


  public SmartWatch(int pedometer, boolean handsFree, String color, double weight, double price, String model) {
    super(color, weight, price, model);
    this.pedometer = pedometer;
    this.handsFree = handsFree;
  }

  public int getPedometer() {
    return this.pedometer;
  }

  public void setPedometer(int pedometer) {
    this.pedometer = pedometer;
  }

  public boolean isHandsFree() {
    return this.handsFree;
  }

  public boolean getHandsFree() {
    return this.handsFree;
  }

  public void setHandsFree(boolean handsFree) {
    this.handsFree = handsFree;
  }


  @Override
  public String toString() {
    return "{" +
      " pedometer='" + getPedometer() + "'" +
      ", handsFree='" + isHandsFree() + "'" +
      ", color='"+ getColor() +"'" +
      ", model='"+ getModel() +"'" +
      ", price='"+ getPrice() +"'" +
      ", weight='"+ getWeight() +"'" +
      "}";
  }

}
