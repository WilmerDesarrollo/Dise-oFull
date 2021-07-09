/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SAICoop.Vista.Clients;



import SAICoop.Util.*;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;


/**
 *
 * @author root
 */
public class Login extends javax.swing.JFrame {
Run runn=new Run();
    /**
     * Creates new form Login
     */
    Guardar_datos datosTxt=new Guardar_datos();
    public Login() {
        initComponents();
        datosTxt.LlenarCombo(jComboBox1);
        desabilitarC();
        this.setLocationRelativeTo(null);
    }
    
    private void desabilitarC(){
        nouser.setEnabled(false);
        nameuser.setEnabled(false);
        passuser.setEnabled(false);
        datework.setEnabled(false);
        inicio.setEnabled(false);
    }
    
    private void habilitarC(){
        nouser.setEnabled(true);
        nameuser.setEnabled(true);
        passuser.setEnabled(true);
        datework.setEnabled(true);
        inicio.setEnabled(true);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        nouser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nameuser = new javax.swing.JTextField();
        passuser = new javax.swing.JTextField();
        datework = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        inicio = new javax.swing.JButton();
        estconexion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("img");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Usuario"));

        jLabel2.setText("Conectar con : ");

        jLabel3.setText("Usuario :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---SELECCIONA---" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        nouser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nouserKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nouserKeyReleased(evt);
            }
        });

        jLabel4.setText("Contraseña :");

        nameuser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameuserFocusGained(evt);
            }
        });
        nameuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameuserKeyReleased(evt);
            }
        });

        passuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passuserKeyReleased(evt);
            }
        });

        datework.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dateworkFocusGained(evt);
            }
        });
        datework.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dateworkKeyReleased(evt);
            }
        });

        jLabel5.setText("Fecha de trabajo : ");

        inicio.setText("Acceder");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });

        estconexion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estconexion.setText("ghf");
        estconexion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inicio)
                .addGap(159, 159, 159))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(estconexion, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jComboBox1, 0, 241, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(nouser, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameuser))
                    .addComponent(passuser)
                    .addComponent(datework)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nouser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datework, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(estconexion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inicio))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
      guarda_con();
      runn.setVisible(true);
      dispose();
    }//GEN-LAST:event_inicioActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
     
        if(jComboBox1.getSelectedIndex()>0){
          String []datos=datosTxt.lista(jComboBox1.getSelectedItem().toString());
           String ip=datos[0];
           String base=datos[1];
           System.out.println("Ip:"+ip+", base:"+base);
           EntityManager em= AbstractFacade.conexion(ip,base);
           em.getTransaction().begin();
           Query q=em.createNativeQuery("DROP TABLE IF EXISTS base_trabajando");
           int ejecuciones=q.executeUpdate();
           System.out.println("Ejecuciones:"+ejecuciones);
           Query q1=em.createNativeQuery("CREATE TABLE base_trabajando(id numeric,ip text,base text)");
           int ej1=q1.executeUpdate();
           System.out.println("Ej:"+ej1);
           Query insert=em.createNativeQuery("INSERT INTO base_trabajando VALUES(1,'"+ip+"','"+base+"')");
           int inserts=insert.executeUpdate();
           System.out.println("Registros insertados:"+inserts);
           em.getTransaction().commit();           
           if(em != null){
               habilitarC();
               jComboBox1.transferFocus();
               runn.ip.setText(ip);
               runn.base.setText(base);
               estconexion.setText("Conectado");
           }else{
               jComboBox1.transferFocus();
               JOptionPane.showMessageDialog(null,"Error de conexion");
             //estconexion.setText("Error de conexion");
           }
           em.close();
       }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    
    
    private void nouserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nouserKeyTyped
        int code = evt.getKeyCode();
       char caracter = evt.getKeyChar();
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           System.out.println("yes");
       }

    }//GEN-LAST:event_nouserKeyTyped

    
  /*  
    var res='';
    function condicion(){
        var num=¡n!15¡;
        if(num>8){
            res='Muy ALto';
       }else{ if(num>6){
           res='Alto';
       }else{ if(num==5){
           res='Medio';
       }else{
           res='Bajo';
       }}}};
   
      var res='';function condicion(){var num=¡n!15¡;if(num>8){res='Muy ALto';}else{ if(num>6){           res='Alto';       }else{ if(num==5){           res='Medio';       }else{           res='Bajo';       }}}};
    
    
                                                                                    var res=''; function condicion(){var num=¡n!15¡;if(num>8){res='Muy ALto';}else if(num>6){res='Alto';}else if(num==5){res='Medio';}else{res='Bajo';}};     */       


    private void nouserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nouserKeyReleased
      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          String[]datos=new Guardar_datos().lista(jComboBox1.getSelectedItem().toString());          
          EntityManager em= AbstractFacade.conexion(datos[0],datos[1]);                  
          Query query=em.createNativeQuery("SELECT nombre FROM usuarios WHERE idusuario="+Integer.parseInt(nouser.getText().trim()));
          String nombre=(String) query.getSingleResult();
          em.close();
          nameuser.setText(nombre);
          nameuser.transferFocus();
          nouser.transferFocus();
          //nameuser.transferFocus();
    }//GEN-LAST:event_nouserKeyReleased
    }
    private void nameuserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameuserKeyReleased
       
       
    }//GEN-LAST:event_nameuserKeyReleased

 
 public static String getMD5(String input) {
 try {
 MessageDigest md = MessageDigest.getInstance("MD5");
 byte[] messageDigest = md.digest(input.getBytes());
 BigInteger number = new BigInteger(1, messageDigest);
 String hashtext = number.toString(16);

 while (hashtext.length() < 32) {
 hashtext = "0" + hashtext;
  }
 return hashtext;
 }
  catch (NoSuchAlgorithmException e) {
    throw new RuntimeException(e);
 }
 }
    
    
    private void passuserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passuserKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          String[]datos=new Guardar_datos().lista(jComboBox1.getSelectedItem().toString());   
          EntityManager em= AbstractFacade.conexion(datos[0],datos[1]);
         
          Query query=em.createNativeQuery("SELECT passwd FROM usuarios WHERE idusuario="+Integer.parseInt(nouser.getText().trim()));
          String passwd=(String) query.getSingleResult();
          String encriptado=getMD5(nouser.getText().trim()+passuser.getText().trim());
           
           Query fecha=em.createNativeQuery("SELECT date(fechatrabajo) from origenes limit 1");
           Date fechas=(Date)fecha.getSingleResult();
           em.close();
          if(encriptado.equals(passwd)){
               passuser.transferFocus();
               datework.setText(""+fechas);
          }else{
              System.out.println(" desigual");
          }
          
        }
    }//GEN-LAST:event_passuserKeyReleased

    private void dateworkKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateworkKeyReleased
     if(evt.getKeyCode()==KeyEvent.VK_ENTER){
         datework.transferFocus();
     }
    }//GEN-LAST:event_dateworkKeyReleased

    private void nameuserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameuserFocusGained
        nameuser.transferFocus();
    }//GEN-LAST:event_nameuserFocusGained

    private void dateworkFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dateworkFocusGained
       datework.transferFocus();
    }//GEN-LAST:event_dateworkFocusGained
     
   public void guarda_con(){    
        try {
            String user=System.getProperty("user.home");
            System.out.println("User:"+user);
            String ruta = user+"/Conexion.txt";
            String ip="";
            String base="";
            String []arr=new Guardar_datos().lista(jComboBox1.getSelectedItem().toString());
            ip=arr[0];
            base=arr[1];
            System.out.println("Ip guardada:"+ip+", Base Guardada:"+base);
            String contenido ="ip_conexion="+ip+"\nbase_conexion="+base;
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
   }   
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField datework;
    private javax.swing.JLabel estconexion;
    private javax.swing.JButton inicio;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nameuser;
    private javax.swing.JTextField nouser;
    private javax.swing.JTextField passuser;
    // End of variables declaration//GEN-END:variables
}