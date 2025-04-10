package proyecto_dos;
import java.util.Scanner;
import java.util.Stack;
import java.awt.event.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.Timer;
import javax.swing.JTextArea;


public class Ventana extends javax.swing.JFrame {
    
    private Stack<String> deshacer;
    private Stack<String> rehacer;
    private Nodo raizABB;
    private Timer timer;    
    


        public Ventana(){
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Icono.png")).getImage());
        
        //Inicialización de las pilas Deshacer y Rehacer
        deshacer = new Stack<>();
        rehacer = new Stack<>();
    }
        
          
        public void visualizarVentana(){
            
            setTitle("Proyecto 2 ---- Programación III ---- Editor de Texto V 1.0");
            setLocationRelativeTo(null);
            setResizable(false);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
        }
        
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuSalir = new javax.swing.JMenu();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemDeshacer = new javax.swing.JMenuItem();
        jMenuItemRehacer = new javax.swing.JMenuItem();
        jMenuItemReemplazar = new javax.swing.JMenuItem();
        jMenuItemBuscar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        JMenuAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuSalir.setText("Archivo");

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuSalir.add(jMenuItemSalir);

        jMenuBar1.add(jMenuSalir);

        jMenu2.setText("Edición");

        jMenuItemDeshacer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemDeshacer.setText("Deshacer");
        jMenuItemDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDeshacerActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemDeshacer);

        jMenuItemRehacer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemRehacer.setText("Rehacer");
        jMenuItemRehacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRehacerActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemRehacer);

        jMenuItemReemplazar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemReemplazar.setText("Reemplazar");
        jMenuItemReemplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReemplazarActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemReemplazar);

        jMenuItemBuscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemBuscar.setText("Buscar");
        jMenuItemBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBuscarActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemBuscar);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Información");

        JMenuAcercaDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        JMenuAcercaDe.setText("Acerca de");
        JMenuAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuAcercaDeActionPerformed(evt);
            }
        });
        jMenu3.add(JMenuAcercaDe);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

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

    private void jMenuItemBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBuscarActionPerformed
        //Icon icono = new ImageIcon(getClass().getResource("/Buscar.png"));
        
        guardarEstado();
        String palabra = JOptionPane.showInputDialog("Ingrese palabra a Buscar: ");
        buscarEnABB(raizABB, palabra);
        
        
        String text = jTextArea1.getText();
        int ubicacion = text.indexOf(palabra);
        
        resaltarPalabra(ubicacion, palabra);
      
    }//GEN-LAST:event_jMenuItemBuscarActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
       
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemReemplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReemplazarActionPerformed
        // TODO add your handling code here:
        
        String palabraBuscar = JOptionPane.showInputDialog("Ingrese la palabra a reemplazar:");
        String palabraReemplazar = JOptionPane.showInputDialog("Ingrese la palabra de reemplazo:");
        reemplazar(palabraBuscar, palabraReemplazar);
    }//GEN-LAST:event_jMenuItemReemplazarActionPerformed

    private void jTextArea1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyPressed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_jTextArea1KeyPressed

    private void jMenuItemDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDeshacerActionPerformed
        // TODO add your handling code here:
        deshacer();
    }//GEN-LAST:event_jMenuItemDeshacerActionPerformed

    private void jMenuItemRehacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRehacerActionPerformed
        // TODO add your handling code here:
        rehacer();
    }//GEN-LAST:event_jMenuItemRehacerActionPerformed

    private void JMenuAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuAcercaDeActionPerformed
        
        JOptionPane.showMessageDialog(null, "Esta es una aplicación aún en desarrollo por los estudiantes de la carrera de \nIngenieria en Sistemas de Información"
                + " y Ciencias de la Computación de la \nUniversidad Mariano Gálvez de Guatemala, Sede Boca del Monte, \nEmerson Alvizures y Sergio Santos, del "
                + "Curso de Programación III, Sección B");
        
        
    }//GEN-LAST:event_JMenuAcercaDeActionPerformed

    
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Ventana().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMenuAcercaDe;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemBuscar;
    private javax.swing.JMenuItem jMenuItemDeshacer;
    private javax.swing.JMenuItem jMenuItemReemplazar;
    private javax.swing.JMenuItem jMenuItemRehacer;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
    
private Nodo insertarEnABB(Nodo nodo, String palabra, int posicion) {
        if (nodo == null) {
            return new Nodo(palabra, posicion);
        }
        if (palabra.compareTo(nodo.palabra) < 0) {
            nodo.izquierda = insertarEnABB(nodo.izquierda, palabra, posicion);
        } else if (palabra.compareTo(nodo.palabra) > 0) {
            nodo.derecha = insertarEnABB(nodo.derecha, palabra, posicion);
        }
        return nodo;
    }    

// Función para actualizar el Árbol Binario de Búsqueda con el texto actual
    private void actualizarABB() {
        raizABB = null;
        String texto = jTextArea1.getText();
        String[] palabras = texto.split("\\s+");
        int posicion = 0;

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                raizABB = insertarEnABB(raizABB, palabra, posicion++);
            }
        }
    } 
    
    private void deshacer() {
        if (!deshacer.isEmpty()) {
            rehacer.push(jTextArea1.getText());  // Guardar el estado actual en rehacer
            String estadoAnterior = deshacer.pop();  // Obtener el estado previo
            jTextArea1.setText(estadoAnterior);  // Restaurar el estado previo
            actualizarABB();  // Actualizar el ABB con el texto deshecho
        } else {
            JOptionPane.showMessageDialog(this, "No hay más cambios para deshacer.");
        }
    }
//Creación de los setters y getters
    public JMenu getjMenu2() {
        return jMenu2;
    }

    public JMenu getjMenu3() {
        return jMenu3;
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public JMenuItem getjMenuItemBuscar() {
        return jMenuItemBuscar;
    }

    public JMenuItem getjMenuItemDeshacer() {
        return jMenuItemDeshacer;
    }

    public JMenuItem getjMenuItemReemplazar() {
        return jMenuItemReemplazar;
    }

    public JMenuItem getjMenuItemRehacer() {
        return jMenuItemRehacer;
    }

    public JMenuItem getjMenuItemSalir() {
        return jMenuItemSalir;
    }

    public JMenu getjMenuSalir() {
        return jMenuSalir;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JTextArea getjTextArea1() {
        return jTextArea1;
    }

    //Función para reemplazar una palabra por otra palabra
    private void reemplazar(String palabraBuscar, String palabraReemplazar) {
        String texto = jTextArea1.getText();
        if (texto.contains(palabraBuscar)) {
            deshacer.push(jTextArea1.getText());  // Guardar el estado previo
            rehacer.clear();  // Limpiar la pila de rehacer
            jTextArea1.setText(texto.replace(palabraBuscar, palabraReemplazar));  // Reemplazar la palabra
            actualizarABB();  // Actualizar el ABB con el nuevo texto
        } else {
            JOptionPane.showMessageDialog(this, "La palabra a reemplazar no se encuentra en el texto.");
        }
    }

    
    //Función para resaltar una palabra en el JTextArea
    private void resaltarPalabra(int posicion, String palabra) {
        String texto = jTextArea1.getText();
        int indiceInicio = texto.indexOf(palabra, posicion);
        int indiceFinal = indiceInicio + palabra.length();

        jTextArea1.setCaretPosition(posicion);  // Seleccionar la palabra
        jTextArea1.moveCaretPosition(posicion + palabra.length());  // Cambiar color de la palabra
    }
    
    // Función para agregar texto y guardar el estado para deshacer
    public void agregarTexto(String nuevoTexto) {
        deshacer.push(jTextArea1.getText());  // Guardar el estado previo
        rehacer.clear();  // Limpiar la pila de rehacer
        jTextArea1.append(nuevoTexto);  // Agregar el nuevo texto al JTextArea
        actualizarABB();  // Actualizar el ABB con el nuevo texto
    }

        // Función de Rehacer
    private void rehacer() {
        if (!rehacer.isEmpty()) {
            deshacer.push(jTextArea1.getText());  // Guardar el estado actual en deshacer
            String estadoRehecho = rehacer.pop();  // Obtener el estado rehecho
            jTextArea1.setText(estadoRehecho);  // Restaurar el estado rehecho
            actualizarABB();  // Actualizar el ABB con el texto rehecho
        } else {
            JOptionPane.showMessageDialog(this, "No hay más cambios para rehacer.");
        }
    }
    
    
    private void buscar(String palabra) {
        Nodo encontrado = buscarEnABB(raizABB, palabra);
        if (encontrado != null) {
            resaltarPalabra(encontrado.posicion, palabra);
        } else {
            JOptionPane.showMessageDialog(this, "La palabra '" + palabra + "' no fue encontrada.");
        }
    }

    // Función para buscar una palabra en el ABB
    private Nodo buscarEnABB(Nodo nodo, String palabra) {
        if (nodo == null) {
            
            JOptionPane.showMessageDialog(null, "No existe la palabra buscada");
            
            return null;
            
        }
        
        if (palabra.equals(nodo.palabra)) {
            JOptionPane.showMessageDialog(null, "La palabra " + nodo.palabra + " si existe en el texto!");
            
            return nodo;
        }
        if (palabra.compareTo(nodo.palabra) < 0) {
            
            return buscarEnABB(nodo.izquierda, palabra);
        } else {
            
            return buscarEnABB(nodo.derecha, palabra);
            
        }
        
    }

    // Función para guardar el estado del texto
    private void guardarEstado() {
        deshacer.push(jTextArea1.getText());  // Guardar el estado actual
        rehacer.clear();  // Limpiar la pila de rehacer
        System.out.println("Cambios guardados automáticamente.");
    }

}


