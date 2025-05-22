package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {

        Car car1 = new Car("Hyundai", "Kona", "Gasolina");

        if (car1.isTachometerGreaterThanZero())
            System.out.println("Tachometer value: NOT Zero");
        else
            System.out.println("Tachometer value: Zero");
        car1.start();
        car1.start();
        car1.stop();
        car1.isTachometerGreaterThanZero();
        if (car1.isTachometerEqualToZero())
            System.out.println("Tachometer value: Zero");
        else
            System.out.println("Tachometer value: NOT Zero");
        car1.start();
        car1.accelerate();
        car1.stop();
        car1.accelerate();
        car1.accelerate();
        car1.accelerate();
        car1.setReverse(car1.isSpeedometerEqualToZero());
        car1.brake();
        car1.brake();
        car1.brake();
        car1.brake();
        car1.turnAngleOfWheels(20);
        car1.turnAngleOfWheels(45);
        car1.setReverse(car1.isSpeedometerEqualToZero());

    }

}