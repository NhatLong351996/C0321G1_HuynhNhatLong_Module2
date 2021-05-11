package bai7_abstractclass_and_interface.thuc_hanh.animal;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        //Tạo đối tượng animals thuộc kiểu Animal tham chiếu đến mảng
        //Đối tượng animals sẽ có kiểu mẩng
        Animal[] animals = new Animal[2];
        //Gán từng giá trị cho đối tượng animals tham chiếu đến lớp con ép kiểu ngầm định
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        //Duyệt từng giá trị trong mảng bằng vòng lặp
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
