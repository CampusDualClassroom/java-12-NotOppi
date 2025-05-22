package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {}

    public Car() {}

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehículo acendido");
        } else {
            System.out.println("O vehículo xa está acendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("Non se pode apagar o vehículo, primeiro ten que estar detido");
        }
    }

    public void accelerate() {
        if ((this.speedometer + 40) > 120)
            System.out.println("Maximun speed of the vehicle already reached. Cannot keep accelerating");
        else
            this.speedometer += 40;
    }

    public void brake() {
        if ((this.speedometer - 40) < 0)
            System.out.println("Cannot keep breaking. Vehicle already stopped");
        else
            this.speedometer -= 40;
    }

    public void turnAngleOfWheels(int angle) {
        if ((this.wheelsAngle + angle) > 45)
            this.wheelsAngle = 45;
        else if ((this.wheelsAngle + angle) < -45)
            this.wheelsAngle = -45;
        else
            this.wheelsAngle += angle;

    }

    public String showSteeringWheelDetail() {
        return "";
    }

    public boolean isReverse() {
        return this.gear.equals("R");
    }

    public void setReverse(boolean reverse) {
        if (this.speedometer > 0)
            System.out.println("Cannot set car to reverse gear. Car is still in motion.");
        else
            this.gear = "R";
    }

    public void showDetails() {}

    public boolean isTachometerGreaterThanZero(){
        return this.tachometer > 0;
    }

    public boolean isTachometerEqualToZero(){
        return this.tachometer == 0;
    }

    public boolean isSpeedometerEqualToZero(){
        return this.speedometer == 0;
    }

}