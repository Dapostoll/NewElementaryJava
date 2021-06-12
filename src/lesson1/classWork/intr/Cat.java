package lesson1.classWork.intr;

public class Cat extends AbstractAnimal implements AnimalInterface{

    @Override
    public void voice() {
        System.out.println("voice");
    }
}
