package week13;

public class Car {
    public boolean totaled;

    public Car(){
        this.totaled=false;
    }
    public void drive(boolean overweight){
        if (this.totaled){
            System.out.println("can't drive");
        } else if (overweight){
            System.out.println("The suspension was damanged");
        } else {
            System.out.println("Driving");
        }
    }
    public void smash(){
        this.totaled=true;
        System.out.println("Car was totaled");
    }
}
