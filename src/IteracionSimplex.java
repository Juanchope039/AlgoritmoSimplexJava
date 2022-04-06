/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class IteracionSimplex {
    
    private final String realizar;
    private final int[] B, C; 
    private final int[][] A;

    IteracionSimplex(String realizar, int[] B, int[][] A, int[] C) {
        this.realizar = realizar;
        this.A = A;
        this.B = B;
        this.C = C;
    }
    
    public boolean esSolucionOptima(){
        return true;
    }
    
}
