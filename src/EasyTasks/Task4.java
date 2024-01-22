package EasyTasks;

public class Task4 {
    public static void main(String[] args) {
    Dog dog = new Dog("Rich", 4);

    System.out.println(dog.bark());
    }
}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String bark(){
        return "woof";
    }
}
