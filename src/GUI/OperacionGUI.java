/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import interfaces.Methods;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import utils.Funtions;
import utils.Inlet;

/**
 *
 * @author Roger - Rp
 * @author Daniela - danielam
 * 
 */
public class OperacionGUI extends javax.swing.JFrame implements Methods{

    //var contructor
    String title = "";
    int option = 0;
    
    boolean [] aux_U;
    boolean [] aux_A;
    boolean [] aux_B;    
    
    /**
     * Creates new form OprecionGUI
     */
    public OperacionGUI() {
        initComponents();        
    }

    public OperacionGUI(String title, int option){
        initComponents(); 
        //init
        this.title = title;
        this.option = option;
        mTitle.setText(title);    
              
        //convertir a binarios
        this.aux_A = Funtions.convertirConjuntoABits(Inlet.CONJUNTO_A, Inlet.UNIVERSAL);           
        this.aux_B = Funtions.convertirConjuntoABits(Inlet.CONJUNTO_B, Inlet.UNIVERSAL);        

        showOperation(this.option);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mTitle = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_operacion = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_numero = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conjuntos");

        mTitle.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        mTitle.setText("Operacion");

        atras.setText("Atras");
        atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasMouseClicked(evt);
            }
        });
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        list_operacion.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(list_operacion);

        list_numero.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(list_numero);

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jLabel1.setText("Bits");

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 0, 12)); // NOI18N
        jLabel2.setText("Numeros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(atras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(atras)
                            .addComponent(mTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atrasActionPerformed

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        // TODO add your handling code here:
        //WindowEvent wev = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        //Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wev);
        setVisible(false);
        //dispose();   
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_atrasMouseClicked

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
            java.util.logging.Logger.getLogger(OperacionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperacionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperacionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperacionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperacionGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList list_numero;
    private javax.swing.JList list_operacion;
    private javax.swing.JLabel mTitle;
    // End of variables declaration//GEN-END:variables

    private void showOperation(int operacion) {//operaciones
        switch(operacion){
            case 1:                
                Or(this.aux_A, this.aux_B);                
            break;
            case 2:
                And(this.aux_A, this.aux_B);   
            break;
            case 3:
                Not(this.aux_A);  
            break;
            case 4:
                Xor(this.aux_A, this.aux_B);
            break;                
            case 5:
                Diferencia(this.aux_A, this.aux_B);
            break;
            case 6:
                Potencia(Inlet.AUX_CONJUNTO_A);
            break;                
        }
    }

    @Override //Union
    public void Or(boolean [] A, boolean [] B) {
        
        boolean [] resultado = new boolean[Inlet.UNIVERSAL.length];
        for (int i = 0; i < Inlet.UNIVERSAL.length; i++){
            resultado[i] = A[i] || B[i];
        }
                        
        DefaultListModel model = new DefaultListModel();//Insertar elementos en una JList Binario
        DefaultListModel model2 = new DefaultListModel();//Insertar elementos en una JList Numero
        
        for (int i = 0; i < resultado.length; i++){//mostrar binario
            if(resultado[i]){
                System.out.println("1"); 
                model.addElement("1");
            }else{
                model.addElement("0");
            }
        }  
        
        for (int i = 0; i < resultado.length; i++){//mostrar numeros
            System.out.println("{"+Inlet.UNIVERSAL[i]+"}"); 
            model2.addElement("{"+Inlet.UNIVERSAL[i]+"}");
        }  

        list_operacion.setModel(model);//mostrar lista binaria
        list_operacion.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list_operacion.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        list_operacion.setSelectedIndex(0);
        list_operacion.setVisibleRowCount(8);
        
        list_numero.setModel(model2);//mostrar lista de numero
        list_numero.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list_numero.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        list_numero.setSelectedIndex(3);
        list_numero.setVisibleRowCount(3);          
        
        
    }

    @Override //Interseccion
    public void And(boolean [] A, boolean [] B) {
        boolean [] resultado = new boolean[Inlet.UNIVERSAL.length];
        for (int i = 0; i < Inlet.UNIVERSAL.length; i++){
            resultado[i] = A[i] && B[i];
        }
                        
        DefaultListModel model = new DefaultListModel();//Insertar elementos en una JList Binario
        DefaultListModel model2 = new DefaultListModel();//Insertar elementos en una JList Numero
        
        for (int i = 0; i < resultado.length; i++){
            if(resultado[i]){
                System.out.println("1"); 
                model.addElement("1");
            }else{
                model.addElement("0");
            }
        }  
        
        int k = 0;
        for (int i = 0; i < resultado.length; i++){
            if(resultado[i] == true){
                System.out.println("1"); 
                model2.addElement("{"+Inlet.UNIVERSAL[i]+"}");
            }else{
                k++;
            }
        }
        if(k == resultado.length){
            model2.addElement("{}");
        }
  
        list_operacion.setModel(model);
        list_operacion.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list_operacion.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        list_operacion.setSelectedIndex(0);
        list_operacion.setVisibleRowCount(8);
        
        list_numero.setModel(model2);
        list_numero.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list_numero.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        list_numero.setSelectedIndex(3);
        list_numero.setVisibleRowCount(3);            
        
    }

    @Override //Complemento
    public void Not(boolean [] A) {
        boolean [] resultado = new boolean[Inlet.UNIVERSAL.length];
        for (int i = 0; i < Inlet.UNIVERSAL.length; i++){
            resultado[i] = !A[i];
        }
                        
        DefaultListModel model = new DefaultListModel();//Insertar elementos en una JList Binario
        DefaultListModel model2 = new DefaultListModel();//Insertar elementos en una JList Numero
        
        for (int i = 0; i < resultado.length; i++){
            if(resultado[i]){
                System.out.println("1"); 
                model.addElement("1");
            }else{
                model.addElement("0");
            }
        }  
        
        for (int i = 0; i < resultado.length; i++){
            if(resultado[i]){
                System.out.println("1"); 
                model2.addElement("{"+Inlet.UNIVERSAL[i]+"}");
            }
        }          
  
        list_operacion.setModel(model);
        list_operacion.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list_operacion.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        list_operacion.setSelectedIndex(0);
        list_operacion.setVisibleRowCount(8);
        
        list_numero.setModel(model2);
        list_numero.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list_numero.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        list_numero.setSelectedIndex(3);
        list_numero.setVisibleRowCount(3);         
    }

    @Override //Diferencia simetrica
    public void Xor(boolean [] A, boolean [] B) {
        boolean [] resultado = new boolean[Inlet.UNIVERSAL.length];
        for (int i = 0; i < Inlet.UNIVERSAL.length; i++){
            resultado[i] = A[i] ^ B[i];
        }
                        
        DefaultListModel model = new DefaultListModel();//Insertar elementos en una JList Binario
        DefaultListModel model2 = new DefaultListModel();//Insertar elementos en una JList Numero
        
        for (int i = 0; i < resultado.length; i++){
            if(resultado[i]){
                System.out.println("1"); 
                model.addElement("1");
            }else{
                model.addElement("0");
            }
        }  
        
        for (int i = 0; i < resultado.length; i++){
            if(resultado[i]){
                System.out.println("1"); 
                model2.addElement("{"+Inlet.UNIVERSAL[i]+"}");
            }
        }          
  
        list_operacion.setModel(model);
        list_operacion.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list_operacion.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        list_operacion.setSelectedIndex(0);
        list_operacion.setVisibleRowCount(8);
        
        list_numero.setModel(model2);
        list_numero.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list_numero.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        list_numero.setSelectedIndex(3);
        list_numero.setVisibleRowCount(3);         
    }

    @Override //Diferencia
    public void Diferencia(boolean [] A, boolean [] B) {
        boolean [] resultado = new boolean[Inlet.UNIVERSAL.length];
        for (int i = 0; i < Inlet.UNIVERSAL.length; i++){
            if (A[i]){
                resultado[i] = (A[i]!=B[i]);
            }
        }
                        
        DefaultListModel model = new DefaultListModel();//Insertar elementos en una JList Binario
        DefaultListModel model2 = new DefaultListModel();//Insertar elementos en una JList Numero
        
        for (int i = 0; i < resultado.length; i++){
            if(resultado[i]){
                System.out.println("1"); 
                model.addElement("1");
            }else{
                model.addElement("0");
            }
        }  
        
        for (int i = 0; i < resultado.length; i++){
            if(resultado[i]){
                System.out.println("1"); 
                model2.addElement("{"+Inlet.UNIVERSAL[i]+"}");
            }
        }          
  
        list_operacion.setModel(model);
        list_operacion.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list_operacion.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        list_operacion.setSelectedIndex(0);
        list_operacion.setVisibleRowCount(8);
        
        list_numero.setModel(model2);
        list_numero.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list_numero.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        list_numero.setSelectedIndex(3);
        list_numero.setVisibleRowCount(3);           
    }

    @Override //Potencia
    public void Potencia(int CONJUNTO[]) {
        int tam_conjunto = 0;
        int num_iter = 0;
        int aux = 0;
        int index = 0;
        int exponente = 0;
        exponente = Funtions.potencia(CONJUNTO.length);
        System.out.println(exponente); 
        
        int matriz[][] = new int [exponente][CONJUNTO.length];         
        num_iter = exponente / 2;//número de iteraciones que se realizarán que es igual al exponente proporcionado entre dos
        for(int j = 0; j < CONJUNTO.length; j++){//ciclo for que va desde 0 hasta CONJUNTO-1
            for(int i = 0; i < exponente; i++){//otro ciclo for desde 0 hasta exponente-1
                if(aux == 0){//si aux es igual a 0 ingresaremos a la matriz un 0
                    matriz[i][j] = 0;
                    index++;        
                }else{
                    if(aux ==  1){ 
                        matriz[i][j] = 1;//a la matriz le ingresamos un 1
                        index--;  
                    }
                }
                if(index == num_iter){//si t es igual a las iteraciones
                    aux = 1;//aux la ponemos en 1
                }
                if(index == 0){//si t es igual a 0
                    aux = 0;//aux la ponemos en 0
                }                
            }
            num_iter = num_iter / 2;//cada vez que termine un ciclo, iter lo dividimos en 2 y así hasta que se termine el ciclo externo         
        } 
        System.out.println("Binario");
	for(int i = 0; i < exponente; i++){//ciclo for que va desde 0 hasta exp-1
		for(int j = 0; j < CONJUNTO.length; j++){//ciclo for anidado que va desde 0 hasta n-1
                   System.out.println(matriz[i][j]);                  
		}
		System.out.println("\n");//salto de línea, retorno de carro
	}         
    
        int y = 0;
        System.out.println("\n Conjunto");
            for(int i = 0; i < exponente; i++){//ciclo for que va desde 0 hasta exp-1
		for(int j = 0; j < CONJUNTO.length; j++){//ciclo for anidado que va desde 0 hasta n-1
                    if(matriz[i][j] != 0){
                        System.out.println("{" + CONJUNTO[j]+ "}");
                    }else{
                         y++;
                         if(y == CONJUNTO.length){
                           System.out.println("{}");  
                         }
                    }                    
                    //System.out.println(matriz[i][j]);//imprime los elementos                     
		}
		System.out.println("\n");//salto de línea, retorno de carro
	}        
            
        DefaultListModel model = new DefaultListModel();
        DefaultListModel model2 = new DefaultListModel();
        
            for(int i = 0; i < exponente; i++){//ciclo for que va desde 0 hasta exp-1
		for(int j = 0; j < CONJUNTO.length; j++){//ciclo for anidado que va desde 0 hasta n-1
                    model.addElement(Integer.toString(matriz[i][j]).toString());
		}
	}  
            
        int z = 0;
        for(int i = 0; i < exponente; i++){//ciclo for que va desde 0 hasta exp-1
            for(int j = 0; j < CONJUNTO.length; j++){//ciclo for anidado que va desde 0 hasta n-1
                if(matriz[i][j] != 0){
                    model2.addElement("{" + CONJUNTO[j]+ "}");
                }else{
                    z++;
                    if(z == CONJUNTO.length){
                       model2.addElement("{}");
                    }
               } 
            }
	}              
            
        list_operacion.setModel(model);
        list_operacion.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list_operacion.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        list_operacion.setSelectedIndex(0);
        list_operacion.setVisibleRowCount(8);
        
        list_numero.setModel(model2);
        list_numero.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list_numero.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        list_numero.setSelectedIndex(3);
        list_numero.setVisibleRowCount(3);        
    }//end
}
