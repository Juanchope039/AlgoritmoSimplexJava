
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class main {
    
    
    public static void main(String[] args) {
        /**
         * Primero describimos que vamos a realizar minimizar,
         * o maximizar
         */
        String realizar = MetodoSimplex.MINIMIZAR;
        double
        /**
         * Luego introducimos la función objetivo [c]
         */
                C[] = {1, 3, 2, 1, 2},
        /**
         * Luego ingresamos la matriz [A]
         */
                A[][]= 
                        {
                            {-1,  2, 0,  1, 1},
                            { 2, -1, 1, -2, 4},
                            { 3,  2, 3,  0, 2}
                        },
        /**
         * Por ultimo ingresamos el vector derecho
         */
                b[] = { 7,
                        15,
                        13};
        System.out.println(realizar);
        System.out.println(Arrays.toString(C));
        for (double[] A1 : A)
            System.out.println(Arrays.toString(A1));
        System.out.println(Arrays.toString(b));
        MetodoSimplex simplex = new MetodoSimplex(realizar, C, b, A);
        simplex.calcularResultado();
//        menu(simplex); 
    }

    private static void menu(MetodoSimplex simplex) {
        
    }
    
}
