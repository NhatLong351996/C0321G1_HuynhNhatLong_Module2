package bai7_abstractclass_and_interface.thuc_hanh.animal;

// Tạo lớp con Chicken kế thừa Animal và implement Edible
public class Chicken extends Animal implements Edible {
    //Định nghĩa lại makeSound() của Animal
    @Override
    public String makeSound() {
        return "Chicken: Cluck-Cluck!";
    }

    //Định nghĩa lại howtoeat() của Edible
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
