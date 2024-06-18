package day09.step1;

public class Bus {
  int busNumber;
  int passengerCount;
  int money;

  public Bus(int busNumber){
    this.busNumber=busNumber;
  }

  public void take(int money){
    this.money +=money;
    passengerCount++;
  }



  @Override
  public String toString() {
    return "Bus{" +
            "busNumber=" + busNumber +
            ", passengerCount=" + passengerCount +
            ", money=" + money +
            '}';
  }
}
