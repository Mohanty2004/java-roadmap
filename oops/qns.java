package oops;

abstract class Pen {
   abstract void write();
   abstract void refill();
    
}
class FountainPen extends Pen{
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeName(){
        System.out.println("changing the nib");
    }
}
class Monkey{
    void jump(){
        System.out.println("jumping");
    }
    void bite(){
        System.out.println("biting");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();

}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello Sir!");
    }
    @Override
    public void eat() {
        System.out.println("eating");
    }
    @Override
    public void sleep() {
        System.out.println("sleeping");
    }
}
public class qns {
    public static void main(String[] args) {
        FountainPen pen= new FountainPen();
        pen.changeName();

        Human mama= new Human();
        mama.sleep();
    }
}
