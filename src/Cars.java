public class Cars extends Vehicle{


    Cars(String model, String price, int doors) {
        super(model, price, doors);
    }
    public static void main(String[] args){
        Cars car1 = new Cars("Camry","$400",4);
        car1.drive();
    }



}
