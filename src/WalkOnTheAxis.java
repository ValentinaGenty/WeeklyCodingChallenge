import java.util.ArrayList;
import java.util.Scanner;

public class WalkOnTheAxis {
    private int T; //denotes number of test cases
    private ArrayList<Integer> N = new ArrayList<Integer>();

    WalkOnTheAxis(){
        UserInput();
        Calculation();
    }
    public void UserInput(){
        Scanner scanner = new Scanner(System.in);
        this.T=scanner.nextInt();
        for(int i=0;i<this.T;i++){
            this.N.add(scanner.nextInt());
        }
    }

    public void Calculation(){
        int sum;
        for(int i=0;i<this.T;i++){
            sum=0;
            for(int j=1;j<=this.N.get(i);j++){
                sum+=j;
            }
            sum+=this.N.get(i);
            System.out.println(sum);
        }
    }
}
