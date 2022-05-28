public class iterativeMath {

    private int num = 0;
    private double squared = 0;

    public void squaredMath(int number){
        for (int x = 0; x < number; x++){
            squared = Math.pow(2, num);
            System.out.printf("%.0f\n", squared);
            num++;
        }
    }
}
