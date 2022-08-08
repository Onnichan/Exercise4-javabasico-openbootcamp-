package clases;

public class SmartDevice{
  
  protected String color;
  protected double weight;
  protected double price;
  protected String model;


  public SmartDevice() {
  }


  public SmartDevice(String color, double weight, double price, String model) {
    this.color = color;
    this.weight = weight;
    this.price = price;
    this.model = model;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getWeight() {
    return this.weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    this.model = model;
  }


  @Override
  public String toString() {
    return "{" +
      " color='" + getColor() + "'" +
      ", weight='" + getWeight() + "'" +
      ", price='" + getPrice() + "'" +
      ", model='" + getModel() + "'" +
      "}";
  }


}
