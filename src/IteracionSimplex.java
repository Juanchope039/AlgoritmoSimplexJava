
import java.util.Arrays;

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
    private final int[] b, C; 
    private final int[][] A;
    
    private int[] Cb;
    private int[][] B;
    private String[] Xb;
    
    private boolean 
            esFactible, 
            esOptima,
            escalculado;
    
    public final static String 
            MAXIMIZAR = "Max",
            MINIMIZAR = "Min";

    public IteracionSimplex(String realizar, int[][] A, int[] b, int[] C) {
        this.realizar = realizar;
        this.A = A;
        this.b = b;
        this.C = C;
    }
    
    public int[] getCb(){

        return Cb;
    }

    public String getRealizar() {
        return realizar;
    }

    public int[][] getA() {
        return A;
    }
    
    public int[] getb() {
        return b;
    }

    public int[] getC() {
        return C;
    }
    
    public void setCb(int[] Cb) {
        this.Cb = Cb;
    }

    public String[] getXb() {
        return Xb;
    }    
    
    private int[][] MatrizInversa(int[][] m){
        return null;
    }
    
    /**
     * 
     * @param m1 La matriz mas pequeña
     * @param m2 La matriz mas grande
     * @return la multiplicación de las matrizces en el caso que sea
     */    
    private int[][] MultiplicarMatriz(int[][] m1, int[][] m2){
        int n1,n2;
        boolean esCuadrada = false;
        
        if (m1.length == m2[0].length ){// Matriz cuadrada
            n1 = m1.length;
            n2 = m1.length;
            esCuadrada = true;
        }else if (m1.length == m2.length && m1.length == m1[0].length){//matriz m*k x k*n
            n1 = m2.length;
            n2 = m2[0].length;
        }else
            return null;       
        
        int[][] res = new int[n1][n2];
        
        for (int i = 0; i < res.length; i++) 
            for (int j = 0; j < res[i].length; j++) {
                int val = 0;
                
                if (esCuadrada){
                    for (int k = 0; k < m2.length; k++) 
                        val+= m1[i][k] * m2[k][j];
                }else{
                    for (int k = 0; k < m1.length; k++) 
                       val += m1[i][k] * m2[k][j];
                }                
                
                res[i][j] = val;
            }
        
        return res;
    }
    
    /**
     * 
     * @param m1 vector de matriz
     * @param m2 matriz con igual numero de filas que el vector
     * @return la multiplicación de las matrizces en el caso que sea
     */
    private int[] MultiplicarMatriz(int[] m1, int[][] m2){
        int[] res = new int[m1.length];

        if (m1.length == m2.length)
            for (int i = 0; i < m2.length; i++){
                int val = 0;
                for (int j = 0; j < m2[0].length; j++)
                    val+= m1[i] * m2[i][j];
                res[i] = val;
            }
        else if (m1.length == m2[0].length)
            for (int i = 0; i < m2[0].length; i++){
                int val = 0;
                for (int j = 0; j < m2.length; j++)
                    val+= m1[i] * m2[j][i];
                res[i] = val;
            }
        else
            return null;

        return res;
    }
    
    private int[][] RestarMatrices(int[][] m1, int[] m2){
        return null;
    }
    
    public void setXb(String[] Xb) {
        this.Xb = Xb;
    }

    public boolean esFactible() {
        if (!escalculado)
            calcularIteración();
        return esFactible;
    }
    
    public boolean esSolucionOptima(){
        if (!escalculado)
            calcularIteración();
        return esOptima;
    }
    
    public String calcularIteración(){
        String res = "";
        /**
        * A
        * B
        * C
        * <Cb> --
        * <Xb> --
        * ********************************* *
        * Calculos a realizar
        * 
        * B-1 <BInver>
        * Cb*B-1 <CbPorBInver>
        * B-1*b  <BInverPorb>
        * B-1*A  <BInverPorA>
        * Cb*B-1*b  <CbPorBInverPorb>
        * Cb*B-1*A-C <CbPorBInverPorAMenosC>
        */
        /*
        int[][] 
                BInver = MatrizInversa(B),
                CbPorBInver = MultiplicarMatriz(Cb,BInver),
                BInverPorb = MultiplicarMatriz(BInver, b),
                BInverPorA = MultiplicarMatriz(BInver, A),
                CbPorBInverPorb = MultiplicarMatriz(CbPorBInver, b),
                CbPorBInverPorA = MultiplicarMatriz(CbPorBInver, A),
                CbPorBInverPorAMenosC = RestarMatrices(CbPorBInverPorA, C);
        esFactible = esFactible(b);
        esOptima = esOptimo(CbPorBInverPorAMenosC);//*/
        return res;
    }

    private boolean esFactible(int[] b) {
        return true;
    }

    private boolean esOptimo(int[][] CbPorBInverPorAMenosC) {
        return true;
    }
    
    public static void main(String[] args) {
        IteracionSimplex it = new IteracionSimplex(MAXIMIZAR, null, null, null);
        
        int[] mmult = it.MultiplicarMatriz(new int[]
            {
                7,
                15,
                13
            }, new int[][]
            {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
            });
        
        System.out.println(Arrays.toString(mmult)+"\n\n\n");
        
        int[][] mmult2 = it.MultiplicarMatriz(new int[][]
            {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
            },new int[][]
            {
                {-1, 2, 0,  1, 1},
                {2, -1, 1, -2, 4},
                {3,  2, 3,  0, 2}

            });
        if (mmult2 != null)
            for (int[] m : mmult2) 
                System.out.println(Arrays.toString(m));
        
    }
    
}
