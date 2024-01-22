package EasyTasks;

public class Task3 {
    public static void main(String[] args) {
        Payer payer = new Payer("Durov", "Vlad", "Moscow", "VLAD DUROV");

        System.out.println(payer);
    }
}

class Payer{
    String surname;
    String name;
    String address;
    String cardName;

    public Payer(String surname, String name, String address, String cardName) {
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.cardName = cardName;
    }

    @Override
    public String toString() {
        return "Payer{" +
                "surname ='" + surname + '\'' +
                ", name ='" + name + '\'' +
                ", address ='" + address + '\'' +
                ", cardName ='" + cardName + '\'' +
                '}';
    }
}