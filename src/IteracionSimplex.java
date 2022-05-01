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
    private final double [] b, C; 
    private final double [][] A;
    
    private double[] Cb;
    private double [][] B;
    private String[] Xb;
    
    private boolean 
            esFactible, 
            esOptima,
            escalculado;
    
    public final static String 
            MAXIMIZAR = "Max",
            MINIMIZAR = "Min";

    public IteracionSimplex(String realizar, double[][] A, double[] b, double[] C) {
        this.realizar = realizar;
        this.A = A;
        this.b = b;
        this.C = C;
    }
    
    public double[] getCb(){

        return Cb;
    }

    public String getRealizar() {
        return realizar;
    }

    public double[][] getA() {
        return A;
    }
    
    public double[] getb() {
        return b;
    }

    public double[] getC() {
        return C;
    }
    
    public void setCb(double[] Cb) {
        this.Cb = Cb;
    }

    public String[] getXb() {
        return Xb;
    }    
    
    private double[][] MatrixIdentidad(double[][] m){        
        for (int i = 0; i < m.length; i++) 
            for (int j = 0; j < m[i].length; j++) {
                int res = 0;
                if(j==i)
                    res=1;
                m[i][j]=res;
            }
        
        return m;
    }
    
    private double[][] MatrizInversa(double[][] m){
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
    private double[][] MultiplicarMatriz(double[][] m1, double[][] m2){
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
    private double[] MultiplicarMatriz(double[] m1, double[][] m2){
        double[] res = new double[m1.length];

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
                for (int j = 0; j < m2.length; j++)
                    val+= m1[i] * m2[j][i];
                res[i] = val;
            }
        else
            return null;

        return res;
    }
    
    private double[] RestarVectores(double[] m1, double[] m2){
        double[] res = new double[m1.length];
        
        if (m1.length != m2.length)
            return null;
        
        for (int i = 0; i < m1.length; i++) 
            res[i]= m1[i] + m2[i];
        
        return res;
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
        
        double[] mmult = it.MultiplicarMatriz(new double[]
            {
                7,
                15,
                13
            }, new double[][]
            {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
            });
        
        System.out.println("Vecto b: \n" + Arrays.toString(mmult)+"\n");
        
        double[][] mmult2 = it.MultiplicarMatriz(new double[][]
            {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
            },new double[][]
            {
                {-1, 2, 0,  1, 1},
                {2, -1, 1, -2, 4},
                {3,  2, 3,  0, 2}

            });
        
        System.out.println("Matriz A:");
        if (mmult2 != null)
            for (double[] m : mmult2) 
                System.out.println(Arrays.toString(m));
        System.out.println("\n");
        
        double detA = it.calcularDeterminante(new double[][]
        {
            {2, -2, 2},
            {2,  1, 0},
            {3, -2, 2}  
        });
        
        double[][] transA = it.calcularTranspuesta(new double[][]
        {
            {2, -2, 2},
            {2,  1, 0},
            {3, -2, 2}  
        });        
        
        System.out.println("Determinante de A: " + detA);
        System.out.println("Transpuesta de A: ");
        
        if (transA != null)
            for (double[] v : transA) 
                System.out.println(Arrays.toString(v));
        
        double[][] MadjTransA = it.calcularMatrizAdjunta(transA);
        
        System.out.println("Matriz adjunta de A: ");
        
        if (MadjTransA != null)
            for (double[] v : MadjTransA) 
                System.out.println(Arrays.toString(v));//*/
        
        double[][] Minversa = it.dividirMatriz(MadjTransA, detA);
        
        System.out.println("Matriz inversa de A:");
        
        if(Minversa != null)
            for (double[] v : Minversa)
                System.out.println(Arrays.toString(v));
        
    }
    
    private double calcularDeterminante(double[][] m){
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
    
    private double[][] calcularTranspuesta(double[][] m){
        double[][] res = new double[m.length][m[0].length];
        
        int i = 0;
        for (double[] v : m){
            for (int j = 0; j < m.length; j++) 
                res[j][i] = m[i][j];             
            i++;
        }
            
        
        return res;
    }
    
    private double[][] calcularMatrizAdjunta(double[][] m){
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
    
    private double[][] calcularSignosMatrziAdjunta(double[][] m){
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
    
    private double[][] dividirMatriz(double[][] m, double dividendo){
        double[][] res = new double[m.length][m[0].length];
        
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length ; j++)
                res[i][j] = m[i][j] / dividendo;
        
        return res;
    }
}
