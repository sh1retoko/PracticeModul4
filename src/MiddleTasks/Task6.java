package MiddleTasks;

public class Task6 {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Roman", "Java");

        programmer.work();
        System.out.println(programmer.getPosition());
        programmer.work();
        System.out.println(programmer.getPosition());
        programmer.work();
        System.out.println(programmer.getPosition());
        programmer.work();
        System.out.println(programmer.getPosition());
    }
}
class Programmer{
    String name;
    String company;
    String position;

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = "intern";
    }

    String getPosition(){
        return position;
    }

    void work(){
        switch(position){
            case "intern" -> position = "junior";
            case "junior" -> position = "middle";
            case "middle" -> position = "senior";
            case "senior" -> position = "lead";
        }
    }
}
