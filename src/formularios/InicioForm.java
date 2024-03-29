package formularios;

public class InicioForm extends javax.swing.JFrame {

    public InicioForm() {
        initComponents();
        this.setExtendedState(InicioForm.MAXIMIZED_BOTH);
        this.setTitle("Sistema para Administración de Hotel");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEscritorio = new javax.swing.JDesktopPane();
        lblIdPersona = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblApellidoMadre = new javax.swing.JLabel();
        lblAcceso = new javax.swing.JLabel();
        mnbSistema = new javax.swing.JMenuBar();
        mnuSistema = new javax.swing.JMenu();
        mnuArchivo = new javax.swing.JMenu();
        mniHabitaciones = new javax.swing.JMenuItem();
        mniProductos = new javax.swing.JMenuItem();
        mnuReservas = new javax.swing.JMenu();
        mniReservas = new javax.swing.JMenuItem();
        mniClientes = new javax.swing.JMenuItem();
        mniPagos = new javax.swing.JMenuItem();
        mnuConsultas = new javax.swing.JMenu();
        mnuConfiguracion = new javax.swing.JMenu();
        mniUsuarios = new javax.swing.JMenuItem();
        mnuHerramientas = new javax.swing.JMenu();
        mnuAyuda = new javax.swing.JMenu();
        mniAcerca = new javax.swing.JMenuItem();
        mniAyuda = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlEscritorio.setBackground(new java.awt.Color(102, 255, 255));

        lblIdPersona.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblIdPersona.setText("jLabel1");
        pnlEscritorio.add(lblIdPersona);
        lblIdPersona.setBounds(20, 10, 130, 16);

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNombre.setText("jLabel2");
        pnlEscritorio.add(lblNombre);
        lblNombre.setBounds(20, 40, 130, 16);

        lblApellido.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblApellido.setText("jLabel3");
        pnlEscritorio.add(lblApellido);
        lblApellido.setBounds(20, 70, 130, 16);

        lblApellidoMadre.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblApellidoMadre.setText("jLabel4");
        pnlEscritorio.add(lblApellidoMadre);
        lblApellidoMadre.setBounds(20, 110, 130, 16);

        lblAcceso.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblAcceso.setText("jLabel7");
        pnlEscritorio.add(lblAcceso);
        lblAcceso.setBounds(20, 140, 130, 16);

        mnuSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Inicio.png"))); // NOI18N
        mnuSistema.setMnemonic('f');
        mnuSistema.setText("Sisreserva");
        mnbSistema.add(mnuSistema);

        mnuArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Archivo.png"))); // NOI18N
        mnuArchivo.setMnemonic('e');
        mnuArchivo.setText("Archivo");
        mnuArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoActionPerformed(evt);
            }
        });

        mniHabitaciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        mniHabitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/habitaciones.png"))); // NOI18N
        mniHabitaciones.setMnemonic('t');
        mniHabitaciones.setText("Habitaciones");
        mniHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHabitacionesActionPerformed(evt);
            }
        });
        mnuArchivo.add(mniHabitaciones);

        mniProductos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        mniProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/productos.png"))); // NOI18N
        mniProductos.setMnemonic('y');
        mniProductos.setText("Productos");
        mniProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniProductosActionPerformed(evt);
            }
        });
        mnuArchivo.add(mniProductos);

        mnbSistema.add(mnuArchivo);

        mnuReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Reservas.png"))); // NOI18N
        mnuReservas.setMnemonic('h');
        mnuReservas.setText("Reservas");

        mniReservas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mniReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/reservas-consumos.png"))); // NOI18N
        mniReservas.setMnemonic('c');
        mniReservas.setText("Reservas y consumos");
        mniReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniReservasActionPerformed(evt);
            }
        });
        mnuReservas.add(mniReservas);

        mniClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mniClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/clientes.png"))); // NOI18N
        mniClientes.setMnemonic('a');
        mniClientes.setText("Clientes");
        mniClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniClientesActionPerformed(evt);
            }
        });
        mnuReservas.add(mniClientes);

        mniPagos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        mniPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/pagos.png"))); // NOI18N
        mniPagos.setText("Pagos");
        mniPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPagosActionPerformed(evt);
            }
        });
        mnuReservas.add(mniPagos);

        mnbSistema.add(mnuReservas);

        mnuConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Consultas.png"))); // NOI18N
        mnuConsultas.setText("Consultas");
        mnbSistema.add(mnuConsultas);

        mnuConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Configuraciones.png"))); // NOI18N
        mnuConfiguracion.setText("Configuración");

        mniUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        mniUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/trabajadores.png"))); // NOI18N
        mniUsuarios.setText("Usuarios");
        mniUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniUsuariosActionPerformed(evt);
            }
        });
        mnuConfiguracion.add(mniUsuarios);

        mnbSistema.add(mnuConfiguracion);

        mnuHerramientas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Herramientas.png"))); // NOI18N
        mnuHerramientas.setText("Herramientas");
        mnbSistema.add(mnuHerramientas);

        mnuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Ayuda.png"))); // NOI18N
        mnuAyuda.setText("Ayuda");

        mniAcerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mniAcerca.setText("Acerca de...");
        mnuAyuda.add(mniAcerca);

        mniAyuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        mniAyuda.setText("Ayuda");
        mniAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAyudaActionPerformed(evt);
            }
        });
        mnuAyuda.add(mniAyuda);

        mnbSistema.add(mnuAyuda);

        mnuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Salir.png"))); // NOI18N
        mnuSalir.setText("Salir");
        mnuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSalirMouseClicked(evt);
            }
        });
        mnbSistema.add(mnuSalir);

        setJMenuBar(mnbSistema);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAyudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniAyudaActionPerformed

    private void mniHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHabitacionesActionPerformed
    /*
        HabitacionForm form = new HabitacionForm();
        pnlEscritorio.add(form);
        form.toFront();
        form.setVisible(true);
    */
    }//GEN-LAST:event_mniHabitacionesActionPerformed

    private void mniProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniProductosActionPerformed
        ProductoForm form = new ProductoForm();
        pnlEscritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_mniProductosActionPerformed

    private void mniClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniClientesActionPerformed
    
        ClientForm form = new ClientForm();
        pnlEscritorio.add(form);
        form.toFront();
        form.setVisible(true);
    
    }//GEN-LAST:event_mniClientesActionPerformed

    private void mniUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniUsuariosActionPerformed
        TrabajadorForm form = new TrabajadorForm();
        pnlEscritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_mniUsuariosActionPerformed

    private void mnuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_mnuSalirMouseClicked

    private void mniReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniReservasActionPerformed
/**
        ReservaForm form = new ReservaForm();
        pnlEscritorio.add(form);
        form.toFront();
        form.setVisible(true);
        ReservaForm.txtIdTrabajador.setText(lblIdPersona.getText());
        ReservaForm.txtTrabajador.setText(lblNombre.getText() + " " + lblApellido.getText());
        ReservaForm.idUsuario = Integer.parseInt(lblIdPersona.getText());
**/
    }//GEN-LAST:event_mniReservasActionPerformed

    private void mniPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPagosActionPerformed
    /*
        PagoForm form = new PagoForm();
        pnlEscritorio.add(form);
        form.toFront();
        form.setVisible(true);
    */
    }//GEN-LAST:event_mniPagosActionPerformed

    private void mnuArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuArchivoActionPerformed

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
            java.util.logging.Logger.getLogger(InicioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel lblAcceso;
    public static javax.swing.JLabel lblApellido;
    public static javax.swing.JLabel lblApellidoMadre;
    public static javax.swing.JLabel lblIdPersona;
    public static javax.swing.JLabel lblNombre;
    private javax.swing.JMenuBar mnbSistema;
    private javax.swing.JMenuItem mniAcerca;
    private javax.swing.JMenuItem mniAyuda;
    private javax.swing.JMenuItem mniClientes;
    private javax.swing.JMenuItem mniHabitaciones;
    private javax.swing.JMenuItem mniPagos;
    private javax.swing.JMenuItem mniProductos;
    private javax.swing.JMenuItem mniReservas;
    private javax.swing.JMenuItem mniUsuarios;
    public static javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenu mnuAyuda;
    public static javax.swing.JMenu mnuConfiguracion;
    private javax.swing.JMenu mnuConsultas;
    private javax.swing.JMenu mnuHerramientas;
    private javax.swing.JMenu mnuReservas;
    private javax.swing.JMenu mnuSalir;
    private javax.swing.JMenu mnuSistema;
    public static javax.swing.JDesktopPane pnlEscritorio;
    // End of variables declaration//GEN-END:variables

}
