import java.util.Random;

public class Car {
    static String brand;
    int speed;
    int price;


    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    // public void start() {

//        try {
//            if (randomInt % 2 == 0) {
//                throw new Except();
//            }
//            System.out.println("���������� �������");
//
//        } catch (Except e) {
//            System.out.println("����������");
    //   }


    public static void a() {
        try {
            b();
            System.out.println("���������� " + brand + " �������");
        } catch (Except e) {
            e.printStackTrace();
        }
    }

    public static void b() throws Except {
        Random random = new Random();
        int randomInt = random.nextInt(21);
        if (randomInt % 2 == 0) {
            throw new Except("My exception");
        }
    }
}
