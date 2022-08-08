package clases;

public class Main {
  public static void main(String[] args) {
    System.out.println("Mostrando las clases");

    // SmartDevice smartDevice = new SmartDevice("black", 80.8, 150.5, "model generic");

    SmartWatch smartWatch = new SmartWatch(15, true, "black", 50.5, 150.5, "X-155");

    SmartPhone smartPhone = new SmartPhone("Android", true, "black", 70.5, 450.5, "SAMSUNG J7");
    System.out.println("CLASS SMARTWATCH : " + smartWatch);
    System.out.println("CLASS SMARTPHONE : " + smartPhone);
  }
}
