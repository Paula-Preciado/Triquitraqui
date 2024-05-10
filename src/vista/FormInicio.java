
package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import modelo.Jugador;
import modelo.TipoImagen;
import static modelo.TipoImagen.EQUIS;



public class FormInicio extends javax.swing.JFrame {


    public FormInicio() {
        init();
    }
    
    public void init(){
        initComponents();
        setBackground(new Color (0,0,0,0));
        panelFondo.requestFocus();
        panelFondo.setOpaque(false);
        Border borde = BorderFactory.createLineBorder(new Color(0,102,102),2);
        btn3x3.setBorder(borde);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new modelo.PanelRedondeado();
        lblCierre = new javax.swing.JLabel();
        txtJugador2 = new javax.swing.JTextField();
        txtJugador1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn3x3 = new javax.swing.JButton();
        imagen1 = new modelo.Imagen();
        imagen2 = new modelo.Imagen();
        imagen3 = new modelo.Imagen();
        imagen4 = new modelo.Imagen();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));
        panelFondo.setPreferredSize(new java.awt.Dimension(416, 315));
        panelFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelFondoMousePressed(evt);
            }
        });
        panelFondo.setLayout(null);

        lblCierre.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        lblCierre.setForeground(new java.awt.Color(255, 255, 255));
        lblCierre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCierre.setText("X");
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCierreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCierreMouseExited(evt);
            }
        });
        panelFondo.add(lblCierre);
        lblCierre.setBounds(380, 10, 20, 32);

        txtJugador2.setBackground(new java.awt.Color(249, 230, 254));
        txtJugador2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 28)); // NOI18N
        txtJugador2.setForeground(new java.awt.Color(205, 105, 220));
        txtJugador2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJugador2.setText("Jugador2");
        txtJugador2.setToolTipText("");
        txtJugador2.setBorder(null);
        txtJugador2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtJugador2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJugador2FocusLost(evt);
            }
        });
        txtJugador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtJugador2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtJugador2MouseExited(evt);
            }
        });
        txtJugador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJugador2KeyTyped(evt);
            }
        });
        panelFondo.add(txtJugador2);
        txtJugador2.setBounds(100, 160, 230, 40);

        txtJugador1.setBackground(new java.awt.Color(214, 252, 249));
        txtJugador1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 28)); // NOI18N
        txtJugador1.setForeground(new java.awt.Color(101, 175, 245));
        txtJugador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJugador1.setText("Jugador1");
        txtJugador1.setToolTipText("");
        txtJugador1.setBorder(null);
        txtJugador1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtJugador1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJugador1FocusLost(evt);
            }
        });
        txtJugador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtJugador1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtJugador1MouseExited(evt);
            }
        });
        txtJugador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJugador1KeyTyped(evt);
            }
        });
        panelFondo.add(txtJugador1);
        txtJugador1.setBounds(100, 100, 230, 40);

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Triquitraqui");
        panelFondo.add(jLabel2);
        jLabel2.setBounds(0, 30, 420, 40);

        btn3x3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        btn3x3.setForeground(new java.awt.Color(0, 102, 102));
        btn3x3.setText("Iniciar");
        btn3x3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn3x3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3x3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn3x3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3x3MouseExited(evt);
            }
        });
        btn3x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3x3ActionPerformed(evt);
            }
        });
        panelFondo.add(btn3x3);
        btn3x3.setBounds(170, 230, 90, 40);

        imagen1.setText("imagen1");
        imagen1.setRuta("/resources/JugadorCirculo.png");
        panelFondo.add(imagen1);
        imagen1.setBounds(40, 160, 40, 40);

        imagen2.setText("imagen1");
        imagen2.setRuta("/resources/Circulo.png");
        panelFondo.add(imagen2);
        imagen2.setBounds(340, 160, 40, 40);

        imagen3.setText("imagen1");
        imagen3.setRuta("/resources/JugadorEquis.png");
        panelFondo.add(imagen3);
        imagen3.setBounds(40, 100, 40, 40);

        imagen4.setText("imagen1");
        imagen4.setRuta("/resources/Equis.png");
        panelFondo.add(imagen4);
        imagen4.setBounds(340, 100, 40, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCierreMouseClicked

    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
        lblCierre.setForeground(Color.red);
    }//GEN-LAST:event_lblCierreMouseEntered

    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
        lblCierre.setForeground(Color.white);
    }//GEN-LAST:event_lblCierreMouseExited

    private void txtJugador1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador1MouseEntered
        Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
        txtJugador1.setBorder(borde);
    }//GEN-LAST:event_txtJugador1MouseEntered

    private void txtJugador1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador1MouseExited
        txtJugador1.setBorder(null);
    }//GEN-LAST:event_txtJugador1MouseExited

    private void txtJugador2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador2MouseEntered
        Border borde = BorderFactory.createLineBorder(new Color(165,40,174),2);
        txtJugador1.setBorder(borde);
    }//GEN-LAST:event_txtJugador2MouseEntered

    private void txtJugador2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador2MouseExited
        txtJugador1.setBorder(null);
    }//GEN-LAST:event_txtJugador2MouseExited

    private void txtJugador1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador1FocusGained
        if(txtJugador1.getText().equals("Jugador1"))
            txtJugador1.setText("");
    }//GEN-LAST:event_txtJugador1FocusGained

    private void txtJugador2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador2FocusGained
        if(txtJugador2.getText().equals("Jugador2"))
            txtJugador2.setText("");
    }//GEN-LAST:event_txtJugador2FocusGained

    private void txtJugador1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador1FocusLost
        if(txtJugador1.getText().equals(""))
            txtJugador1.setText("Jugador1");
    }//GEN-LAST:event_txtJugador1FocusLost

    private void txtJugador2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador2FocusLost
        if(txtJugador2.getText().equals(""))
            txtJugador2.setText("Jugador2");
    }//GEN-LAST:event_txtJugador2FocusLost

    private void panelFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMousePressed
        panelFondo.requestFocus();
    }//GEN-LAST:event_panelFondoMousePressed

    private void txtJugador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJugador1KeyTyped
        char caracter = Character.toUpperCase(evt.getKeyChar());
        evt.setKeyChar(caracter);
        if(txtJugador1.getText().length()>=8)
            evt.consume();
    }//GEN-LAST:event_txtJugador1KeyTyped

    private void txtJugador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJugador2KeyTyped
        char caracter = Character.toUpperCase(evt.getKeyChar());
        evt.setKeyChar(caracter);
        if(txtJugador2.getText().length()>=8)
            evt.consume();
    }//GEN-LAST:event_txtJugador2KeyTyped

    private void btn3x3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3x3MouseEntered
        btn3x3.setBackground(new Color(214,252,249));
    }//GEN-LAST:event_btn3x3MouseEntered

    private void btn3x3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3x3MouseExited
        btn3x3.setBackground(Color.white);
    }//GEN-LAST:event_btn3x3MouseExited

    private void btn3x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3x3ActionPerformed
        this.dispose();
        
        Jugador jugador1 = new Jugador(TipoImagen.EQUIS);
        if(txtJugador1.getText().equals(""))
            jugador1.setNombre("Jugador1");
        else
            jugador1.setNombre(txtJugador1.getText());
        
        Jugador jugador2 = new Jugador(TipoImagen.CIRCULO);
        if(txtJugador2.getText().equals(""))
            jugador2.setNombre("Jugador2");
        else
            jugador2.setNombre(txtJugador2.getText());
        
        FormTriqui3x3 triqui3x3 = new FormTriqui3x3(jugador1, jugador2);
        triqui3x3.setVisible(true);
    }//GEN-LAST:event_btn3x3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn3x3;
    private modelo.Imagen imagen1;
    private modelo.Imagen imagen2;
    private modelo.Imagen imagen3;
    private modelo.Imagen imagen4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTextField txtJugador1;
    private javax.swing.JTextField txtJugador2;
    // End of variables declaration//GEN-END:variables
}
