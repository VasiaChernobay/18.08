package company.vehiches;


import company.ditails.Engine;
import company.profissions.Driver;
import company.profissions.Person;

public  class  Car {
    public  String name;


    public static void main(String[] args) {
      //  Driver driver=new Driver();
     //   Engine engine=new Engine();

        Car Lorry=new Car();
       Car SportCar=new Car();

        printInfo();

    }
    String markCar;
    String klassCar;
    int weight;
     public void start(){
         System.out.println("Поехали");
    }
    void stop(){
        System.out.println("Стоп");
    }
    void turnRight(){
        System.out.println("Поварачиваем на право");
    }
    void  turnLeft(){
        System.out.println("Поварачиваем на лево");
    }
  static   void printInfo(){
       Person person=new Person();
         Car car=new Car();
         Engine engine=new Engine();
       Driver driver=new Driver();
       driver.Fio="Vasily";
        driver.drivingExperience=0.1;
       engine.manufacturer="Vaz";
       engine.volume=1.3;
       engine.power=76;
       car.name="Vaz210113";
      System.out.println("Водитель-"+driver.Fio+",cтаж-"+driver.drivingExperience+",Машина-"+car.name+",Двигатель-"+engine.manufacturer+",мощность-"+engine.power+"лс"+".");




    }
    void liftingCcapacity(){
         int n=20;
        System.out.println(n);
    }
    void rearingSpeed(){
        System.out.println("Максимальная скорость");
    }
}
