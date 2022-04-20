
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lab.informatica
 */
public class ItSimplex extends IteracionSimplex {
    
    public ItSimplex(String realizar, int[][] A, int[] b, int[] C) {
        super(realizar, A, b, C);
    }
    
    public static void main(String[] args) {
        ItSimplex it = new ItSimplex(
                MAXIMIZAR, 
                new int[][]
                        {   {2,0,-1},
                            {3,1,-1},
                            {2,-1,-1}
                        }, 
                new int[]
                    {0,0,0}, 
                new int[]
                    {0,0,0}
        );
        int[][] I = it.getA();
        it.calcularMatrizIdentidad(I);
        for (int[] A1 : I)
            System.out.println(Arrays.toString(A1));
        
        it.calcularMatrizIdentidad(I);
    }
    
}
