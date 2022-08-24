class Animal{
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
    void bark(){System.out.println("barking..." );}
}
class Cat extends Animal{
    void meow(){System.out.println("meowing...");}
}
class Cow extends Animal{
    void moo(){System.out.println("mooing...");}
}
class BabyDog extends Dog{
    void smallbark(){System.out.println("barking but not too loud...");}
}
class Inheritance3 {
    public static void main(String[] args){
        Dog dog1= new Dog();
        Cat cat1= new Cat();
        Cow cow1= new Cow();
        BabyDog smalldog1= new BabyDog();
        Animal nguoi1= new Animal();
        dog1.eat();
        dog1.bark();
        cat1.eat();
        cat1.meow();
        cow1.eat();
        cow1.moo();
        smalldog1.eat();
        smalldog1.bark();
        smalldog1.smallbark();
        nguoi1.eat();
    }
}