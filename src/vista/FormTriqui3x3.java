
package vista;

import java.awt.Color;
import javax.swing.JLabel;
import modelo.Imagen;
import modelo.Jugador;
import modelo.Ruta;
import modelo.Tablero;
import modelo.TipoImagen;


public class FormTriqui3x3 extends javax.swing.JFrame {
    
    public static Imagen imgJugadorEquis;
    public static Imagen imgJugadorCirculo;
    public static JLabel nombreJugadorEquis;
    public static JLabel nombreJugadorCirculo;
    public static JLabel puntajeEquis;
    public static JLabel puntajeCirculo;

    private Jugador jugador1;
    private Jugador jugador2;
    private Tablero tablero;
    
    public FormTriqui3x3(Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        init();
        imgJugadorEquis = jugadorEquis;
        imgJugadorCirculo = jugadorCirculo;
        nombreJugadorEquis = lblNombre1;
        nombreJugadorCirculo = lblNombre2;
        puntajeEquis = lblPuntaje1;
        puntajeCirculo = lblPuntaje2;
        tablero.cambiarEstilos(TipoImagen.EQUIS);
    }
    
    public void init(){
        initComponents();
        panelFondo.setOpaque(false);
        setBackground(new Color(0,0,0,0));
        
        lblNombre1.setText(jugador1.getNombre());
        lblNombre2.setText(jugador2.getNombre());
        
        tablero = new Tablero();
        tablero.setJugador1(jugador1);
        tablero.setJugador2(jugador2);
        tablero.setAlturaCI(100);
        tablero.setAnchoCI(100);
        tablero.setMargen(5);
        tablero.setColorCI(Color.black);
        tablero.setColorTablero(new Color(239,180,255));
        tablero.setLocation(40,150);
        tablero.crearTablero();
        tablero.setVisible(true);
        
        panelFondo.add(tablero);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new modelo.PanelRedondeado();
        lblCierre = new javax.swing.JLabel();
        jugadorCirculo = new modelo.Imagen();
        jugadorEquis = new modelo.Imagen();
        lblNombre2 = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblPuntaje1 = new javax.swing.JLabel();
        lblPuntaje2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));
        panelFondo.setPreferredSize(new java.awt.Dimension(400, 500));
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
        lblCierre.setBounds(360, 10, 20, 32);

        jugadorCirculo.setText("imagen2");
        jugadorCirculo.setRuta("/resources/JugadorCirculo.png");
        panelFondo.add(jugadorCirculo);
        jugadorCirculo.setBounds(275, 50, 50, 50);

        jugadorEquis.setText("imagen2");
        jugadorEquis.setRuta("/resources/JugadorEquis.png");
        panelFondo.add(jugadorEquis);
        jugadorEquis.setBounds(75, 50, 50, 50);

        lblNombre2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        lblNombre2.setForeground(new java.awt.Color(255, 200, 255));
        lblNombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre2.setText("NAME");
        panelFondo.add(lblNombre2);
        lblNombre2.setBounds(255, 100, 90, 30);

        lblNombre1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(180, 232, 255));
        lblNombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre1.setText("NAME");
        panelFondo.add(lblNombre1);
        lblNombre1.setBounds(55, 100, 90, 30);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("-");
        panelFondo.add(jLabel1);
        jLabel1.setBounds(190, 50, 20, 60);

        lblPuntaje1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        lblPuntaje1.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntaje1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntaje1.setText("0");
        panelFondo.add(lblPuntaje1);
        lblPuntaje1.setBounds(130, 50, 60, 60);

        lblPuntaje2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        lblPuntaje2.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntaje2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntaje2.setText("0");
        panelFondo.add(lblPuntaje2);
        lblPuntaje2.setBounds(210, 50, 60, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private modelo.Imagen jugadorCirculo;
    private modelo.Imagen jugadorEquis;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblPuntaje1;
    private javax.swing.JLabel lblPuntaje2;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
