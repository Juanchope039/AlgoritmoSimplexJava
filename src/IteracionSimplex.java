import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class IteracionSimplex extends MetodoSimplex{
    
    private boolean 
            esFactible, 
            esOptima,
            escalculado;

    public IteracionSimplex(String realizar, String[] c, String[] cb, String[] xb, double[] C, double[] Cb, double[] b, double[][] A, double[][] B) {
        super(realizar, c, cb, xb, C, Cb, b, A, B);
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
        String realizar = MetodoSimplex.MAXIMIZAR;
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
        
        MetodoSimplex it = new MetodoSimplex(realizar,C,b,A);
        it.It.add(new IteracionSimplex(it.realizar, it.c, it.cb, it.Xb, it.C, it.Cb, it.b, it.A, it.B));
        
        System.out.println("Matriz A: ");
        if (it.It.get(0).getA() != null)
            for (double[] m : it.It.get(0).getA()) 
                System.out.println(Arrays.toString(m));
        
        System.out.println("Matriz B: ");
        if (it.It.get(0).getB() != null)
            for (double[] v : it.It.get(0).getB()) 
                System.out.println(Arrays.toString(v));
        
        System.out.println("Matriz b: \n" + Arrays.toString(it.It.get(0).getb()));
        
        System.out.println("Matriz C: \n" + Arrays.toString(it.It.get(0).getC()));
        
        System.out.println("*****************************");
        
        double detB = it.calcularDeterminante(it.It.get(0).getB());
        System.out.println("Determinante de B: " + detB);
        
        double[][] transB = it.calcularTranspuesta(it.It.get(0).getB());      
        System.out.println("Transpuesta de B: ");
        if (transB != null)
            for (double[] v : transB) 
                System.out.println(Arrays.toString(v));
        
        double[][] MdjTransB = it.calcularMatrizAdjunta(transB);        
        System.out.println("Matriz adjunta de B: ");        
        if (MdjTransB != null)
            for (double[] v : MdjTransB) 
                System.out.println(Arrays.toString(v));//*/
        
        System.out.println("*****************************");
        double[][] Binversa = it.dividirMatriz(MdjTransB, detB);        
        System.out.println("Matriz inversa de B:");        
        if(Binversa != null)
            for (double[] v : Binversa)
                System.out.println(Arrays.toString(v));   
        System.out.println("*****************************");
        double[] CbXBinver = it.MultiplicarMatriz(it.It.get(0).getCb(), Binversa);
        System.out.println("Cb * B-1:" + Arrays.toString(CbXBinver)); 
        IteracionSimplex iteracion0 = it.It.get(0);
        System.out.println("*****************************");
        double CbXBinverXb = it.multiplicarVectores(CbXBinver, iteracion0.getb());
        System.out.println("Cb * B-1 * b :" + CbXBinverXb); 
        System.out.println("*****************************");
        double[] BinversaXb = it.MultiplicarMatriz(iteracion0.getb(), Binversa);
        System.out.println("B-1 * b :" + Arrays.toString(BinversaXb)); 
        System.out.println("*****************************");
        double[][] BinversaXA = it.MultiplicarMatriz(Binversa, iteracion0.getA());
        System.out.println("B-1 * A :"); 
        if (BinversaXA != null)
            for (double[] v : BinversaXA) 
                System.out.println(Arrays.toString(v));
        System.out.println("*****************************");
        double[] CbXBinverXA = it.MultiplicarMatriz(CbXBinver, iteracion0.getA());
        System.out.println("Cb * B-1 * A :" + Arrays.toString(CbXBinverXA)); 
        System.out.println("*****************************");
        double[] CbXBinverXAMenosc = it.RestarVectores(CbXBinverXA, iteracion0.getC());
        System.out.println("Cb * B-1 * A - c:" + Arrays.toString(CbXBinverXAMenosc)); 
        System.out.println("*****************************");
        System.out.println("Texto c: " + Arrays.toString(iteracion0.getCText()));
        System.out.println("Texto CB: " + Arrays.toString(iteracion0.getCbText()));
        System.out.println("Texto Xb: " + Arrays.toString(iteracion0.getXbText()));
        System.out.println("Es factible?: " + iteracion0.esFactible());
        System.out.println("Es Optima?: " + iteracion0.esOptima());
        System.out.println("*****************************");
        System.out.println("Aqui deberia calcular correctamente cuando es factible\n"
                + "cuando es optima\n"
                + "cuando deberia seguir y cuales variables deberian tomarse en cuenta");
        
        
    }    //c, cb, Xb;
    
    public double[][] getB(){
        return this.B;
    }
    
    public String[] getCText(){
        return c;
    }
    
    public String[] getCbText(){
        return cb;
    }
    
    public String[] getXbText(){
        return Xb;
    }

    public boolean esOptima() {
        return esOptima;
    }
}
