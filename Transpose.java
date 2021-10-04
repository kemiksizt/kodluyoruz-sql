import java.util.Arrays;

public class Transpose {
    
    public static void main(String[] args) {
        
        int[][] matris = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12 }};
        int[][] transpose = new int[matris[0].length][matris.length];

        for (int row = 0; row < transpose.length; row++) {
            for (int col = 0; col < transpose[row].length; col++) {
                transpose[row][col] = matris[col][row];
            }
        }

        System.out.println("Matris :");
        for (int[] row : matris) {
            for (int col : row) {
                System.out.print(col + "    ");
            }
            System.out.println();
        }
        System.out.println("Transpoze :");
        for (int[] row : transpose) {
            for (int col : row) {
                System.out.print(col + "    ");
            }
            System.out.println();
        }
        
        
    }
    
}
