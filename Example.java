import java.util.*;
public class Example {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);
        System.out.print("Ascii of "+c + "is "+(int)c);
        int m1[][] = {{1,2},{2,2}};
        int m2[][] = {{1,2},{2,2}};
        int sum[][] = addition(m1,m2);
        for(int i[] : sum){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
    public static int[][] addition(int m1[][],int m2[][]){
        int sum[][] = new int[m1.length][m1[0].length];
        if(m1.length != m2.length){
            System.out.println("Addition not possible");
            return null;
        }
        for(int i = 0;i<m1.length;i++){
            for(int j = 0;j<m1[0].length;j++){
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return sum;
    }
}
// to perform additon of 2 matrices

