package EasyTasks;

public class Task2 {
    public static void main(String[] args) {
        Bell bell = new Bell();
        bell.sound();
        bell.sound();
    }
}

class Bell{
    boolean ding = true;
    void sound(){
        if(ding){
            System.out.println("ding");
        }else {
            System.out.println("dong");
        }
        ding = !ding;
    }
}
