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
    
    /***
     * las tres hacen lo mismo de diferente manera 
     * se podria usar recursividad si hay oportunidad
     */
    
    private int[][] MultiplicarMatriz(int[][] m1, int[][] m2){
        return null;
    }
    
    private int[][] MultiplicarMatriz(int[] m1, int[][] m2){
        return null;
    }
    
    private int[][] MultiplicarMatriz(int[][] m1, int[] m2){
        return null;
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
        int[][] 
                BInver = MatrizInversa(B),
                CbPorBInver = MultiplicarMatriz(Cb,BInver),
                BInverPorb = MultiplicarMatriz(BInver, b),
                BInverPorA = MultiplicarMatriz(BInver, A),
                CbPorBInverPorb = MultiplicarMatriz(CbPorBInver, b),
                CbPorBInverPorA = MultiplicarMatriz(CbPorBInver, A),
                CbPorBInverPorAMenosC = RestarMatrices(CbPorBInverPorA, C);
        esFactible = esFactible(b);
        esOptima = esOptimo(CbPorBInverPorAMenosC);
        return res;
    }

    private boolean esFactible(int[] b) {
        return true;
    }

    private boolean esOptimo(int[][] CbPorBInverPorAMenosC) {
        return true;
    }
    
}
