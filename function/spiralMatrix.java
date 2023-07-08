package function;
import java.util.Scanner;

public class spiralMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for(int i = 0; i<n ;i++){
            for(int j = 0 ; j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Spiral order matrix is : ");
        int rowstart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;
        while(rowstart<=rowEnd && colStart<=colEnd){
            for(int col = colStart;col<=colEnd;col++){
                System.out.print(matrix[rowstart][col] + " ");
            }
            rowstart++;

            for(int row = rowstart; row <= rowEnd; row++){
                System.out.print(matrix[row][colEnd] + " ");
            }
            for(int col = colEnd; col>=colStart;col--){
                System.out.print(matrix[rowEnd][col] + " ");

            }
            rowEnd--;
            for(int row = rowEnd; row>=rowstart; row--){
                System.out.print(matrix[row][colStart] + "  ");
            }
            colStart++;
            System.out.println();
        }
sc.close();

    }
}
