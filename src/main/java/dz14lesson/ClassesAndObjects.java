package dz14lesson;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;
        //System.out.println("Меня зовут " + person1.name
        //                   + ", мне " + person1.age + " лет.");
        person1.speak();
        person1.sayHello();
        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 20;
        //System.out.println("Меня зовут " + person2.name
        //                   + ", мне " + person2.age + " лет.");
        person2.speak();
        person2.sayHello();
    }
}

class Person{
    //У класса могут быть:
    //1. Данные (поля)
    //2. Действия, которые он может совершать (методы)
    String name;
    int age;
    void speak(){
        System.out.println("Меня зовут " + name + ", мне " + age + " лет. ");
    }
    void sayHello(){
        System.out.println("Привет!");
    }
}






