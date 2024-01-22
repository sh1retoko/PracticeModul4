package EasyTasks;

public class Task1 {
    public static void main(String[] args) {
        int R = 100; int L = 100;

        Balance balance =  new Balance();

        balance.addLeft(L);
        balance.addRight(R);

        System.out.println(balance.getSituation());
    }
}
class Balance {
    int R = 0; int L = 0;
    void addRight(int n){
       R += n;
    }

    void addLeft(int n){
       L += n;
    }

    String getSituation(){
        if (R == L){
            return "=";
        } else if (R > L) {
            return "R";
        }else {
            return "L";
        }
    }
}

