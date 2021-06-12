package lesson1.classWork;

/*
 * полиморфизм - 1 интерфейс и множество реализаций
 * интерфейс - контракт для классов
 **/

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.voice();

        Animal cat = new Cat();
        cat.voice();


    }
    // Пример плохой программы
    public void test(Animal animal){
        if (animal instanceof Cat) {
            System.out.println("this is cat");
        }

        if (animal instanceof  Animal){
            System.out.println("this is plain animal");
        }
    }


}
