import java.util.Scanner;

public class BeautifulMatrix {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int minSteps=0;
        for(int i= 0 ; i <5; i++){
            for(int j=0 ;j<5; j++){
                int temp = sc.nextInt();
                if(temp>0){
                    minSteps=Math.abs(i - 3) + Math.abs(j - 3);
                }
                arr[i][j]=temp;
            }
        }
        System.out.println(minSteps);
    }
}
