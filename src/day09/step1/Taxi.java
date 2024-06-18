package day09.step1;

public class Taxi {
  int taxiNumber;
  int passengerCount;
  int money;

  public Taxi(int taxiNumber) {
    this.taxiNumber = taxiNumber;
  }

  public void take(int money){
    this.money +=money;
    passengerCount++;
  }

  @Override
  public String toString() {
    return "Taxi{" +
            "taxiNumber=" + taxiNumber +
            ", passengerCount=" + passengerCount +
            ", money=" + money +
            '}';
  }
}
