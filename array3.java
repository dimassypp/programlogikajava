/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DYPe
 */
public class array3 {
      public static void main(String[] args) {
        int matrixA[][] = {{1, 2}, {6, 3}, {1, 2}, {9, 0}, {9, 8}};
        int matrixB[][] = {{1, 2, 3, 5, 6}, {2, 3, 6, 9, 7}};

        int hasil[][] = new int[matrixA.length][matrixB[0].length];
        for (int x = 0; x < matrixA.length; x++) {
            for (int y = 0; y < matrixB[0].length; y++) {
                for (int z = 0; z < matrixB.length; z++) {
                    hasil[x][y] += matrixA[x][z] * matrixB[z][y];

                }
                System.out.print(hasil[x][y] + "\t");
            }
            System.out.println(" ");
        }
    }
}

