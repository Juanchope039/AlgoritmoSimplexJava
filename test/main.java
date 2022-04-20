
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
        String realizar = "Min";
        int
        /**
         * Luego introducimos la función objetivo [c]
         */
                C[] = {-3,-5},
        /**
         * Luego ingresamos la matriz [A]
         */
                A[][]= 
                        {
                            {1,0},
                            {0,2},
                            {3,2}
                        },
        /**
         * Por ultimo ingresamos el vector derecho
         */
                b[] = { 4,
                        12,
                        18};
        System.out.println(realizar);
        System.out.println(Arrays.toString(C));
        for (int[] A1 : A)
            System.out.println(Arrays.toString(A1));
        System.out.println(Arrays.toString(b));
        MetodoSimplex simplex = new MetodoSimplex(realizar,A,b,C);
        simplex.calcularResultado();
//        menu(simplex); 
    }

    private static void menu(MetodoSimplex simplex) {
        
    }
    
}
