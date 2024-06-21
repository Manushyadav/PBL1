class Assignment4{
    public static void main(String[] args){
        Animal a = new Animal();
        Bird b = new Bird();
        a.eat();
        a.sleep();
        a.fly();
    }
}
class Animal{
    void eats(){
        System.out.println("Animal class : Animals can eat");
    }
    void sleep(){
        System.out.println("Animal Class : Animal can sleep");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Bird Class : Bird can fly");
    }
}
