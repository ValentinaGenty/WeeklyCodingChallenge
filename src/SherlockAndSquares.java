import java.util.ArrayList;
import java.util.Scanner;

public class SherlockAndSquares {
    private double start;
    private double end;
    private int NumOfSquares;

    SherlockAndSquares(){
        UserInput();
        Calculation();
    }
    public void UserInput(){
        Scanner scanner = new Scanner(System.in);
        this.start = scanner.nextDouble();
        this.end = scanner.nextDouble();
    }

    public void Calculation(){
        this.NumOfSquares=0;
        double squareRoot;
        for (double i=this.start;i<=this.end;i++) {
            squareRoot=Math.pow(i,0.5);
            if(Math.round(squareRoot)==squareRoot){
                this.NumOfSquares++;
            }
        }
        System.out.println(this.NumOfSquares);
    }

}
