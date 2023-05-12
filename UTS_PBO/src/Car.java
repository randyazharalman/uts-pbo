public class Car {
  String brand, model, year;
  public Car(String brand, String model, String year){
    this.brand = brand;
    this.model = model;
    this.year = year;
  }
  public void start_engine(){
    System.out.println(this.brand +" " + this.model +" "+ this.year+ " Car engine started");
  }
  
  public void stop_engine(){
    System.out.println(this.brand +" " + this.model +" "+ this.year+ " Car engine stopped");
  }

  public void get_car_info(){
    System.out.println("Car Brand: "+this.brand +" \nModel:"+ this.model +" \nYear:" + this.year);
  }


  public static void main(String[] args) {
    Car car = new Car("Honda", "Civic", "2020");

    car.get_car_info();
    car.start_engine();
    car.stop_engine();
  }
}
