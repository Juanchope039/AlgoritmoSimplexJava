import java.util.Arrays;
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
    
    public final static String 
            MAXIMIZAR = "Max",
            MINIMIZAR = "Min";
    
    protected final String realizar;
    protected String[] c, cb, Xb;
    protected double[] C, Cb, b;
    protected double[][] A, B;
    protected LinkedList<IteracionSimplex> It = new LinkedList<>();

    public MetodoSimplex(String realizar, String[] c, String[] cb, String[] xb, double[] C, double[] Cb, double[] b, double[][] A, double[][] B) {
        this.realizar = realizar;
        this.c = c;
        this.cb = cb;
        this.Xb = xb;
        this.C = C;
        this.Cb = Cb;
        this.b = b;
        this.A = A;
        this.B = B;
    }

    public MetodoSimplex(String realizar, double[] C, double[] b, double[][] A) {
        this.realizar = realizar;
        this.C = C;
        this.b = b;
        this.A = A;
        
        this.B = MatrixIdentidad(new double[A.length][A.length]);
        this.cb = new String[A.length];
        this.Cb = new double[A.length];
        this.Xb = new String[A.length];
        this.c  = new String[A[0].length];
        
        for (int i = 0; i < Cb.length; i++){
            cb[i] = "S" + (i+1);
            Xb[i] = "S" + (i+1);
            Cb[i] = 0;
        }
        
        for (int i = 0; i < c.length; i++)
            c[i] = "X" + (i + 1);
    }

    public boolean calcularResultado() {
        do{
            IteracionSimplex iteracion = new IteracionSimplex(realizar, c, cb, Xb, C, Cb, b, A, B);
            It.add(iteracion);
        }while(It.getLast().esSolucionOptima());
        return false;
    }
    
    protected double[][] MatrixIdentidad(double[][] m){  
        
        for (int i = 0; i < m.length; i++) 
            for (int j = 0; j < m[i].length; j++) {
                int res = 0;
                if(j==i)
                    res=1;
                m[i][j]=res;
            }
        
        return m;
    }
    
    protected double[][] MatrizInversa(double[][] m){
        //int[][] res = m.clone();
        
        double detA = calcularDeterminante(m);
        
        if (detA == 0)//No tiene solución
            return null;
                
        double[][]  traA = calcularTranspuesta(m);
        double[][]  mAdj = calcularMatrizAdjunta(traA);
        
        //res = dividirMatriz(mAdj, detA);
        
        return dividirMatriz(mAdj, detA);//*/return null;
    }
    
    /**
     * 
     * @param m1 La matriz mas pequeña
     * @param m2 La matriz mas grande
     * @return la multiplicación de las matrizces en el caso que sea
     */    
    protected double[][] MultiplicarMatriz(double[][] m1, double[][] m2){
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
        
        double[][] res = new double[n1][n2];
        
        for (int i = 0; i < res.length; i++) 
            for (int j = 0; j < res[i].length; j++) {
                double val = 0;
                
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
    protected double[] MultiplicarMatriz(double[] m1, double[][] m2){
        double[] res;
        if (m2.length > m2[0].length)
            res =  new double[m2.length];
        else
            res  = new double[m2[0].length];
        
        if (m1.length == m2.length)
            for (int i = 0; i < m2.length; i++){
                double val = 0;
                for (int j = 0; j < m2[0].length; j++)
                    val+= m1[i] * m2[i][j];
                res[i] = val;
            }
        else if (m1.length == m2[0].length)
            for (int i = 0; i < m2[0].length; i++){
                double val = 0;
                for (int j = 0; j < m2.length; j++){
                    val+= m1[i] * m2[j][i];
                    //System.out.println("i: " + i + ", Cb*B-1: " + m1[i] + " * A: " + m2[j][i] + " = " + (m1[i] * m2[j][i]));
                }
                res[i] = val;
            }
        else
            return null;

        return res;
    }
    
    protected double[] RestarVectores(double[] m1, double[] m2){
        double[] res = new double[m1.length];
        
        if (m1.length != m2.length)
            return null;
        
        for (int i = 0; i < m1.length; i++) 
            res[i]= m1[i] - m2[i];
        
        return res;
    }
    
    protected double calcularDeterminante(double[][] m){
        double res = 0;
        int compensacion = 0;
        
        if (m.length ==2 && m[0].length == 2)
            compensacion = -1;
        
        for (int i = 0; i < m.length + compensacion; i++) {//fila
            double val = 1;
            int fila = i;
            
            //System.out.print("*[\t");
            
            for (int j = 0; j < m[i].length; j++) {//columna
                //System.out.print("val: " + m[fila][j] + ", #fila: " + fila + ", columna: " + j + "\t\t");
                val*= m[fila][j];
                fila++;
                if (fila >= m.length)
                    fila = 0;
            }
            
            //System.out.print("]suma : " + val+ "\n[\t");
            res += val;
            val = 1;
            
            for (int j = m[i].length - 1; j >=0; j--) {//columna
                //System.out.print("val: " + m[fila][j] + ", #fila: " + fila + ", columna: " + j + "\t\t");
                val*= m[fila][j];
                fila++;
                if (fila >= m.length)
                    fila = 0;
            }
            
            //System.out.println("]resta : " + val);
            res -= val;
        }
        
        //System.out.println("res: " + res);
        
        return res;
    }
    
    protected double[][] calcularTranspuesta(double[][] m){
        double[][] res = new double[m.length][m[0].length];
        
        int i = 0;
        for (double[] v : m){
            for (int j = 0; j < m.length; j++) 
                res[j][i] = m[i][j];             
            i++;
        }
            
        
        return res;
    }
    
    protected double[][] calcularMatrizAdjunta(double[][] m){
        double[][] res = calcularSignosMatrziAdjunta(m);
        
        for (int i = 0; i < res.length; i++) 
            for (int j = 0; j < res[i].length; j++) {
                double[][] aux = new double[res.length-1][res[i].length-1];
                
                int x = 0;
                
                for (int k = 0; k < res.length; k++) {
                    if (k==i)
                        continue;
                    
                    int y=0;
                    
                    for (int l = 0; l < res[i].length; l++) {
                        if ( l==j)
                            continue;
                        
                        aux[x][y] = m[k][l];
                        
                        y++;                  
                    }
                    
                    x++;
                }/*
                
                System.out.println("\n\n");
                
                if(aux != null)
                    for (int[] v : aux) 
                        System.out.println(Arrays.toString(v));
                
                System.out.println("\n\n");//*/
                
                res[i][j] *= calcularDeterminante(aux);
            }   
        
        return res;
    }
    
    protected double[][] calcularSignosMatrziAdjunta(double[][] m){
        double[][] res = new double[m.length][m[0].length];
        
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++){
                if (Math.floorMod(i, 2) == Math.floorMod(j, 2))
                    res[i][j] = 1;
                else
                    res[i][j] =-1;
            }
        
        return res;
    }
    
    protected double[][] dividirMatriz(double[][] m, double dividendo){
        double[][] res = new double[m.length][m[0].length];
        
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length ; j++)
                res[i][j] = m[i][j] / dividendo;
        
        return res;
    }
    
    protected double multiplicarVectores(double[] v1, double [] v2){
        double res = 0;
        
        if (v1.length != v2.length)
            return Double.MIN_VALUE;
        
        for (int i = 0; i < v1.length; i++)
            res+= v1[i] * v2[i];        
        
        return res;
    }
    
}
