
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author JUANDI
 */
public class UsaMetodoSimplex extends javax.swing.JFrame {

    /**
     * Creates new form UsaMetodoSimplex
     */
    public UsaMetodoSimplex() {
        initComponents();
    }    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        btnIniciar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 800));

        jPanel1.setBackground(new java.awt.Color(24, 78, 119));
        jPanel1.setPreferredSize(new java.awt.Dimension(537, 100));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Método simplex");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setBorder(null);

        jPanel2.setBackground(new java.awt.Color(82, 182, 154));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(537, 200));
        jPanel4.setLayout(new java.awt.GridLayout(2, 2));

        jLabel2.setBackground(new java.awt.Color(82, 182, 154));
        jLabel2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cantidad de variables de decisión:");
        jLabel2.setOpaque(true);
        jPanel4.add(jLabel2);

        jTextField1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("2");
        jTextField1.setBorder(null);
        jTextField1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel4.add(jTextField1);

        jLabel3.setBackground(new java.awt.Color(82, 182, 154));
        jLabel3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cantidad de restricciones:");
        jLabel3.setOpaque(true);
        jPanel4.add(jLabel3);

        jTextField2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("3");
        jTextField2.setBorder(null);
        jTextField2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jPanel4.add(jTextField2);

        jPanel2.add(jPanel4, java.awt.BorderLayout.NORTH);

        btnIniciar.setBackground(new java.awt.Color(24, 78, 119));
        btnIniciar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIniciar.setText("Iniciar");
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciar.setOpaque(true);
        btnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarProceso(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                efectoHover(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                efectoHover(evt);
            }
        });
        jPanel2.add(btnIniciar, java.awt.BorderLayout.CENTER);

        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(82, 182, 154));
        jPanel3.setPreferredSize(new java.awt.Dimension(537, 50));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Método simplex implementado por Juan David Garzón y Juan Diego Cobo");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
//    Método para iniciar el proceso.
//    Se toman los valores de los inputBox para tomar la cantidad de variables
//    de decisión y la cantidad de restricciones
//    ------------------------------------------------------------------------
//    Se crea un JPanel y se ingresa en el JFrame
//    ------------------------------------------------------------------------
//    Abreviaturas.
//    
//    Vd --> Indica variable de decisión.
//    Rs --> Indica restricciones.
//    Bg --> Background.
//    Ly --> Layout.
    private void iniciarProceso(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarProceso
        int variablesDecision = Integer.parseInt(jTextField1.getText());
        int cantidadRestricciones = Integer.parseInt(jTextField2.getText());

//      A continuación, se crea un nuevo panel con nuevas etiquetas y campos dentro de él.
//      La personalización de los componentes se hace con las características
//      de los componentes anteriores y nuevas características.    
        Color bgTitulos = new Color(118, 200, 147);
        Color bgEtiquetas = new Color(153, 217, 140);
        
//      Se crea el panel
        JPanel panelCoeficientes = new JPanel();

//      Creamos un layout para el panel de coeficientes
        GridLayout gLyCoeficientes = new GridLayout(4, 1);
        
        panelCoeficientes.setLayout(gLyCoeficientes);
        
//      Etiquetas de título
//      1. Coeficientes de Variables de decisión
//      2. Coeficientes de restricciones
        JLabel etiquetaCoeficientesVd = new JLabel();
        JLabel etiquetaCoeficientesRs = new JLabel();
        
        etiquetaCoeficientesVd.setOpaque(true);
        etiquetaCoeficientesRs.setOpaque(true);
        
        etiquetaCoeficientesVd.setFont(jLabel2.getFont());
        etiquetaCoeficientesRs.setFont(jLabel2.getFont());
        
        etiquetaCoeficientesVd.setBackground(bgTitulos);
        etiquetaCoeficientesRs.setBackground(bgTitulos);
        
        etiquetaCoeficientesVd.setHorizontalAlignment(JLabel.CENTER);
        etiquetaCoeficientesVd.setVerticalAlignment(JLabel.CENTER);
        etiquetaCoeficientesRs.setHorizontalAlignment(JLabel.CENTER);
        etiquetaCoeficientesRs.setVerticalAlignment(JLabel.CENTER);
        
        etiquetaCoeficientesVd.setForeground(jLabel2.getForeground());
        etiquetaCoeficientesRs.setForeground(jLabel2.getForeground());
        
//      Asignación de textos
        etiquetaCoeficientesVd.setText("Coeficientes de función objetivo");
        etiquetaCoeficientesRs.setText("Coeficientes de restricciones");
        
//      Creamos un panel para almacenar los etiquetas y campos de la función objetivo
        JPanel panelCoeficientesVd = new JPanel();
    
//      Creamos un grid layout para el panel de coeficientes de la función objetivo
        GridLayout gLyCoeficientesVd = new GridLayout(1, variablesDecision*2);
        panelCoeficientesVd.setLayout(gLyCoeficientesVd);
        panelCoeficientesVd.setBackground(bgEtiquetas);

//      Por cada variable objetivo, se añade una etiqueta y un campo
        for (int i = 0; i < variablesDecision; i++) {
            JLabel etiquetaVd = new JLabel();
            JTextField campoVd = new JTextField();
            
            etiquetaVd.setBackground(jLabel2.getBackground());
            etiquetaVd.setForeground(jLabel2.getForeground());
            etiquetaVd.setFont(jLabel2.getFont());
            etiquetaVd.setHorizontalAlignment(JLabel.CENTER);
            etiquetaVd.setVerticalAlignment(JLabel.CENTER);
            
            campoVd.setBorder(jTextField1.getBorder());
            campoVd.setBackground(jTextField1.getBackground());
            campoVd.setForeground(jTextField1.getForeground());
            campoVd.setFont(jTextField1.getFont());
            campoVd.setHorizontalAlignment(JTextField.CENTER);
            
            etiquetaVd.setText("X" + (i+1));
            campoVd.setText(Integer.toString((i+1)));
            
            panelCoeficientesVd.add(etiquetaVd);
            panelCoeficientesVd.add(campoVd);
        }
        
//      Creamos un panel para almacenar las etiquetas y campos de las restricciones
        JPanel panelCoeficientesRs = new JPanel();
        
//      Creamos un grid layout para ubicar en cada una de las restricciones en el panel
        GridLayout gLyCoeficientesRs = new GridLayout(cantidadRestricciones, 1);
        panelCoeficientesRs.setLayout(gLyCoeficientesRs);
        
        for (int i = 0; i < cantidadRestricciones; i++) {
            JPanel panelCoeficienteRsAux = new JPanel();
            GridLayout gLyCoeficientesRsAux = new GridLayout(1, (variablesDecision*2 + 2));
            panelCoeficienteRsAux.setLayout(gLyCoeficientesRsAux);
            
            //      Creamos un comboBox para asignar las operaciones de menor igual, mayor igual o igual
            JComboBox comboRs = new JComboBox();
            comboRs.setFont(jLabel2.getFont());
            comboRs.setBackground(Color.WHITE);
            comboRs.setForeground(Color.BLACK);
            comboRs.addItem("≥");
            comboRs.addItem("≤");
            comboRs.addItem("=");
            
            for (int j = 0; j < variablesDecision; j++) {
                JLabel etiquetaRs = new JLabel();
                JTextField campoRs = new JTextField();
                
                etiquetaRs.setBackground(jLabel2.getBackground());
                etiquetaRs.setForeground(jLabel2.getForeground());
                etiquetaRs.setFont(jLabel2.getFont());
                etiquetaRs.setHorizontalAlignment(JLabel.CENTER);
                etiquetaRs.setVerticalAlignment(JLabel.CENTER);
                
                campoRs.setBorder(jTextField1.getBorder());
                campoRs.setBackground(jTextField1.getBackground());
                campoRs.setForeground(jTextField1.getForeground());
                campoRs.setFont(jTextField1.getFont());
                campoRs.setHorizontalAlignment(JTextField.CENTER);
                
                etiquetaRs.setText("X" + (j+1));
                campoRs.setText(Integer.toString((j+1)));
                
                panelCoeficienteRsAux.add(etiquetaRs);
                panelCoeficienteRsAux.add(campoRs);
            }
            
            JTextField campoRsB = new JTextField();
            
            campoRsB.setBorder(jTextField1.getBorder());
            campoRsB.setBackground(jTextField1.getBackground());
            campoRsB.setForeground(jTextField1.getForeground());
            campoRsB.setFont(jTextField1.getFont());
            campoRsB.setHorizontalAlignment(JTextField.CENTER);
            campoRsB.setText(Integer.toString((i+1)));
            
            panelCoeficienteRsAux.add(comboRs);
            panelCoeficienteRsAux.add(campoRsB);
            
            panelCoeficienteRsAux.setBackground(bgEtiquetas);
            
            panelCoeficientesRs.add(panelCoeficienteRsAux);
        }
        
//      Agregamos todo lo creado y personalizado anteriormente
        panelCoeficientes.add(etiquetaCoeficientesVd);
        panelCoeficientes.add(panelCoeficientesVd);
        panelCoeficientes.add(etiquetaCoeficientesRs);
        panelCoeficientes.add(panelCoeficientesRs);
        
//      Se crea un jScroll
        JScrollPane scrollPanel = new JScrollPane(panelCoeficientes);
        
        scrollPanel.setPreferredSize(new Dimension(400, 400));
        
        scrollPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        
        jPanel2.add(scrollPanel, BorderLayout.SOUTH);
        
        this.validate();
        
        for (int i = 0; i < jPanel2.getComponentCount(); i++) {
            System.out.println("Componente #" + i + " " + jPanel2.getComponent(i));
            
            if (i == 2) {
                for (int j = 0; j < panelCoeficientes.getComponentCount(); j++) {
                    System.out.println("Componente interior #" + j + " " + panelCoeficientes.getComponent(j));
                }
            }
        }
    }//GEN-LAST:event_iniciarProceso
    
//    Método para realizar el efecto 'Hover'.
//    El efecto Hover es cuando el mouse pasa por encima 
//    de un componente y este cambia de color inidicando que dicho
//    componente está activo.
    private void efectoHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_efectoHover
        Color bg = btnIniciar.getBackground();
        Color azulClaro = new Color(30, 96, 145);
        Color azulOscuro = new Color(24, 78, 119);
        
        if (bg == azulOscuro) {
        btnIniciar.setBackground(azulClaro);
        } else {
            btnIniciar.setBackground(azulOscuro);
        }
    }//GEN-LAST:event_efectoHover

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UsaMetodoSimplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsaMetodoSimplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsaMetodoSimplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsaMetodoSimplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsaMetodoSimplex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
