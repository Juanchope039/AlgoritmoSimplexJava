
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class MetodoSimplex {
    
    protected final String realizar;
    protected int[] B, C;
    protected int[][] A;
    protected LinkedList<IteracionSimplex> It;
    

    MetodoSimplex(String realizar, int[] B, int[][] A, int[] C) {
        this.realizar = realizar;
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public boolean calcularResultado() {
        do{
            IteracionSimplex iteracion = new IteracionSimplex(realizar, B, A, C);
            It.add(iteracion);
        }while(It.getLast().esSolucionOptima());
        return false;
    }
    
}
