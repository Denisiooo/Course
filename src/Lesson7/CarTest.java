package Lesson7;

public class CarTest {
    public void change(Car car, int changeNunb){
        car.numberDoors = changeNunb;
    }

    public void changeColor(Car car2, Car car3){
        String color = car2.color;
        car2.color = car3.color;
        car3.color = color;
    }


    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car2 = new Car("red", "V6", 5);
        Car car3 = new Car("blue", "V7", 7);
        ct.changeColor(car2, car3);
        ct.change(car2, 6);
        System.out.println(car2.color + " " + car3.color);


    }
}
