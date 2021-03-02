/*
I have been wanting to review Inheritance so this what the class has been made for.
I will just do a little practice to do a little refresher
 */

import java.sql.SQLOutput;

public class Inheritance {
    public static void main(String[] args) {
        Apple apple = new Apple("red");
        Orange orange = new Orange("orange");
        apple.whereIGrow();
        orange.whereIGrow();
        orange.drinks();
        apple.otherFoods();
        print(orange);
        print(apple);
        apple.setColor("yellow");
        orange.setColor("blood orange");
        print(orange);
        print(apple);

    }
    public static void print(Fruit fruit){
        System.out.println(fruit);
    }
}

//a basic super class/ parent class for fruits contains some functions that agree with all fruits
class Fruit {
    String flavor;
    String color;
    Fruit(String flavor, String color){
        this.flavor = flavor;
        this.color = color;
    }
    public void setFlavor(String flavor){
        this.flavor = flavor;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        return "I taste like " + flavor + ", and I am " + color;
    }
    public void whereIGrow(){
        System.out.println("I mainly grow outside");
    }
}

//just has some basic functions of oranges
class Apple extends Fruit {
    Apple( String color){
        super("apple", color);
    }
    @Override
    public void whereIGrow(){
        System.out.println("I grow in most any climates, whether that be warm all year or seasonal");
    }
    public void otherFoods(){
        System.out.println("I make a great apple sauce");
    }
}

//this just has some basic functions of oranges
class Orange extends Fruit {
    Orange(String color){
        super("orange", color);
    }
    @Override
    public void whereIGrow(){
        System.out.println("I grow mostly in hot and humid climates");
    }
    public void drinks(){
        System.out.println("I am really known for a classic cup od OJ in the morning.");
    }

}
