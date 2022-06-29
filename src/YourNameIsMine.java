import java.util.ArrayList;
import java.util.Scanner;

public class YourNameIsMine {
    private int T;
    private ArrayList<String> N = new ArrayList<String>();

    YourNameIsMine(){
        UserInput();
        Algorithm();
    }
    public void UserInput(){
        Scanner scanner = new Scanner(System.in);
        this.T=scanner.nextInt();

        scanner = new Scanner(System.in);

        for(int i=0;i<this.T;i++){
            this.N.add(scanner.nextLine());
        }
    }

    public void Algorithm(){
        String s1,s2;
        String split[];
        String match;
        int match_count;
        for(int i=0;i<this.T;i++){
            match_count=0;
            split=this.N.get(i).split(" ");
            s1=split[0];
            s2=split[1];

            for(int j=0;j<s1.length();j++){
                for(int k=j;k<s2.length();k++){
                    if(s1.charAt(j)==s2.charAt(k)){
                        match_count++;
                        k=s2.length();
                    }
                }
            }

            if(match_count==s1.length()){
                match="YES";
            }
            else{
                match="NO";
            }

            System.out.println(match);

        }
    }

}
