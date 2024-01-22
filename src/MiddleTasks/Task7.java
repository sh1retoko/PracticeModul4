package MiddleTasks;

public class Task7 {
    public static void main(String[] args) {
        LimitingRectangle r = new LimitingRectangle(new int[][] {{-1, -2}, {3, 4}});
        System.out.println("Ширина: " + r.getWidth()+ " " + "Высота: " + r.getHeight());
        System.out.println(r.getBorders());
    }
}
class LimitingRectangle {
    int[][] point;

    int min(int ind){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < point.length; i++) {
            if (point[i][ind] <= min){
                min = point[i][ind];
            }
        }
        return min;
    }

    int max(int ind){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < point.length; i++) {
            if (point[i][ind] >= max) {
                max = point[i][ind];
            }
        }
        return max;
    }
    public LimitingRectangle(int[][] point) {
        this.point = point;
    }

    int getWidth(){
        return this.max(0) - this.min(0);
    }

    int getHeight(){
        return this.max(1) - this.min(1);
    }

    String getBorders(){
         return this.min(1) + ", " + this.max(1) + ", " + this.min(0) + ", " + this.max(0);
    }
}
