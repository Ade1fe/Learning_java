public class Vehicle {
    String model;
    String price;
    int doors;
    Vehicle(String model,String price, int doors){
       this.model = model;
       this.price = price;
       this.doors = doors;
    }
   public void drive(){
        System.out.println("Your Car name is "+ this.model);
    }
   public void brake(){
        System.out.println("You stopped the car");
    }
}
