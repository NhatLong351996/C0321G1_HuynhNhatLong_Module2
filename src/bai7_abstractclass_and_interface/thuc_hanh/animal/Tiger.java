package bai7_abstractclass_and_interface.thuc_hanh.animal;
//Tạo lớp Tiger kế thừa Abstract Animal dùng extends

public class Tiger extends Animal {
    //implement lại phương thức makeSound của lớp cha là Abstract Animal
    @Override
    public String makeSound() {
        return "tiger: roarrrrr!";
    }
}
