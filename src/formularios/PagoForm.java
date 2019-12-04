/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;
import modelos.Habitacion;
import modelos.Pago;
import modelos.Reserva;
import modelos.Conexion;
import modelos.ConsumoDAO;
import modelos.HabitacionDAO;
import modelos.PagoDAO;
import modelos.ReservaDAO;
import java.io.File;
import java.sql.Connection;
import java.sql.Date;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author b6
 */
public class PagoForm extends javax.swing.JFrame {
    private String accion = "guardar";
    public static String idReserva;
    public static String cliente;
    public static String idHabitacion;
    public static String habitacion;
    public static Double totalReserva = 0.00;

    /**
     * Creates new form PagoForm
     */
    public PagoForm() {
        initComponents();
        mostrar(idReserva);
        inhabilitar();
        txtIdReserva.setText(idReserva);
        txtCliente.setText(cliente);
        txtHabitacion.setText(habitacion);
        txtIdHabitacion.setText(idHabitacion);
        txtTotalReserva.setText(Double.toString(totalReserva));
        ConsumoDAO consumoDAO = new ConsumoDAO();
        consumoDAO.mostrar(idReserva);
        txtTotalPago.setText(Double.toString(totalReserva + consumoDAO.totalConsumo));
    }
    void ocultar_columnas(){
        tblListadoPagos.getColumnModel().getColumn(0).setMaxWidth(0);
        tblListadoPagos.getColumnModel().getColumn(0).setMaxWidth(0);
        tblListadoPagos.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblListadoPagos.getColumnModel().getColumn(1).setMaxWidth(0);
        tblListadoPagos.getColumnModel().getColumn(1).setMaxWidth(0);
        tblListadoPagos.getColumnModel().getColumn(1).setPreferredWidth(0);
    }
    void ocultar_columnasconsumo(){
        tblListadoConsumo.getColumnModel().getColumn(0).setMaxWidth(0);
        tblListadoConsumo.getColumnModel().getColumn(0).setMaxWidth(0);
        tblListadoConsumo.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblListadoConsumo.getColumnModel().getColumn(1).setMaxWidth(0);
        tblListadoConsumo.getColumnModel().getColumn(1).setMaxWidth(0);
        tblListadoConsumo.getColumnModel().getColumn(1).setPreferredWidth(0);
        tblListadoConsumo.getColumnModel().getColumn(2).setMaxWidth(0);
        tblListadoConsumo.getColumnModel().getColumn(2).setMaxWidth(0);
        tblListadoConsumo.getColumnModel().getColumn(2).setPreferredWidth(0);
    }
    void inhabilitar(){
        txtIdPago.setVisible(false);
        txtIdReserva.setVisible(false);
        txtCliente.setEnabled(false);
        txtNumComprobante.setEnabled(false);
        cboTipoComprobante.setEnabled(false);
        txtImpuesto.setEnabled(false);
        txtTotalPago.setEnabled(false);
        txtTotalReserva.setEnabled(false);
        datFechaEmision.setEnabled(false);
        datFechaPago.setEnabled(false);
        txtIdHabitacion.setVisible(false);
        txtHabitacion.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);
        txtIdPago.setText("");
        txtNumComprobante.setText("");
        txtImpuesto.setText("");
        txtTotalPago.setText("");
    }
    void habilitar(){
        txtIdPago.setVisible(false);
        txtIdReserva.setVisible(true);
        txtCliente.setEnabled(true);
        txtNumComprobante.setEnabled(true);
        cboTipoComprobante.setEnabled(true);
        txtImpuesto.setEnabled(true);
        txtTotalPago.setEnabled(true);
        txtTotalReserva.setEnabled(true);
        datFechaEmision.setEnabled(true);
        datFechaPago.setEnabled(true);
        txtIdHabitacion.setVisible(true);
        txtHabitacion.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEliminar.setEnabled(true);
        txtIdPago.setText("");
        txtNumComprobante.setText("");
        txtImpuesto.setText("");
        
    }
    void mostrar(String buscar){
        try{
            DefaultTableModel modelo;
            PagoDAO pagoDAO = new PagoDAO();
            modelo = pagoDAO.mostrar(buscar);
            tblListadoPagos.setModel(modelo);
            ocultar_columnas();
            lblTotalRegistrosPagos.setText("Total Pagos " + Integer.toString(pagoDAO.totalRegistros));
            ConsumoDAO consumoDAO = new ConsumoDAO();
            modelo = consumoDAO.mostrar(buscar);
            tblListadoConsumo.setModel(modelo);
            ocultar_columnasconsumo();
            lblTotalRegistrosConsumo.setText("Total Consumos " + consumoDAO.totalRegistros);
            lblTotalConsumo.setText("Consumo total: $"+ consumoDAO.totalConsumo);
        }catch(Exception e){
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        pnlDatos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtIdReserva = new javax.swing.JTextField();
        txtTotalReserva = new javax.swing.JTextField();
        txtHabitacion = new javax.swing.JTextField();
        txtNumComprobante = new javax.swing.JTextField();
        txtImpuesto = new javax.swing.JTextField();
        txtTotalPago = new javax.swing.JTextField();
        datFechaEmision = new com.toedter.calendar.JDateChooser();
        datFechaPago = new com.toedter.calendar.JDateChooser();
        cboTipoComprobante = new javax.swing.JComboBox<>();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtIdHabitacion = new javax.swing.JTextField();
        txtIdPago = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        pnlListadoConsumos = new javax.swing.JPanel();
        srcListadoConsumos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListadoConsumo = new javax.swing.JTable();
        lblTotalConsumo = new javax.swing.JLabel();
        lblTotalRegistrosConsumo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pnlListadoPagos = new javax.swing.JPanel();
        btnImprimirComprobante = new javax.swing.JButton();
        btnImprimirComprobanteConsumo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        scrListadoPagos = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListadoPagos = new javax.swing.JTable();
        lblTotalRegistrosPagos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setPreferredSize(new java.awt.Dimension(1100, 600));
        jInternalFrame1.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Pagos");

        pnlDatos.setBackground(new java.awt.Color(255, 255, 204));
        pnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de pagos"));
        pnlDatos.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel2.setText("Reserva:");

        jLabel3.setText("Total reserva:");

        jLabel4.setText("Habitación:");

        jLabel5.setText("Tipo comprobante:");

        jLabel6.setText("Nº Comprobante:");

        jLabel7.setText("Impuesto:");

        jLabel8.setText("TotalPago:");

        jLabel9.setText("Fecha emisión:");

        jLabel10.setText("Fecha pago:");

        txtIdReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdReservaActionPerformed(evt);
            }
        });

        txtNumComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumComprobanteActionPerformed(evt);
            }
        });

        txtTotalPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPagoActionPerformed(evt);
            }
        });

        cboTipoComprobante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boleta", "Factura", "Ticket", "Otro" }));
        cboTipoComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoComprobanteActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/nuevo.GIF"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNuevo)
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(btnGuardar)
                                .addGap(60, 60, 60)
                                .addComponent(btnCancelar))
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtNumComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtIdPago, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboTipoComprobante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDatosLayout.createSequentialGroup()
                                        .addComponent(txtIdHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtHabitacion))
                                    .addComponent(txtTotalReserva, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDatosLayout.createSequentialGroup()
                                        .addComponent(txtIdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCliente))))))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addGap(29, 29, 29)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalPago, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtImpuesto)
                                .addComponent(datFechaEmision, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(txtIdPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTotalReserva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTipoComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNumComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTotalPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datFechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(datFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addGap(44, 44, 44))
        );

        pnlListadoConsumos.setBackground(new java.awt.Color(255, 255, 204));
        pnlListadoConsumos.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de consumos"));
        pnlListadoConsumos.setPreferredSize(new java.awt.Dimension(650, 200));

        javax.swing.GroupLayout srcListadoConsumosLayout = new javax.swing.GroupLayout(srcListadoConsumos);
        srcListadoConsumos.setLayout(srcListadoConsumosLayout);
        srcListadoConsumosLayout.setHorizontalGroup(
            srcListadoConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        srcListadoConsumosLayout.setVerticalGroup(
            srcListadoConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        tblListadoConsumo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblListadoConsumo);

        lblTotalConsumo.setText("Total consumo");

        lblTotalRegistrosConsumo.setText("Registros");

        javax.swing.GroupLayout pnlListadoConsumosLayout = new javax.swing.GroupLayout(pnlListadoConsumos);
        pnlListadoConsumos.setLayout(pnlListadoConsumosLayout);
        pnlListadoConsumosLayout.setHorizontalGroup(
            pnlListadoConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListadoConsumosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(srcListadoConsumos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListadoConsumosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotalConsumo)
                .addGap(72, 72, 72)
                .addComponent(lblTotalRegistrosConsumo)
                .addGap(162, 162, 162))
        );
        pnlListadoConsumosLayout.setVerticalGroup(
            pnlListadoConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListadoConsumosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlListadoConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(srcListadoConsumos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlListadoConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotalConsumo)
                    .addComponent(lblTotalRegistrosConsumo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnlListadoPagos.setBackground(new java.awt.Color(255, 255, 204));
        pnlListadoPagos.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de pagos"));
        pnlListadoPagos.setPreferredSize(new java.awt.Dimension(650, 200));

        btnImprimirComprobante.setText("Imprimir");
        btnImprimirComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirComprobanteActionPerformed(evt);
            }
        });

        btnImprimirComprobanteConsumo.setText("Imprimir Consumos");
        btnImprimirComprobanteConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirComprobanteConsumoActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salir.gif"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnReporte.setText("Reporte");

        tblListadoPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblListadoPagos);

        scrListadoPagos.setViewportView(jScrollPane2);

        lblTotalRegistrosPagos.setText("Registros");

        javax.swing.GroupLayout pnlListadoPagosLayout = new javax.swing.GroupLayout(pnlListadoPagos);
        pnlListadoPagos.setLayout(pnlListadoPagosLayout);
        pnlListadoPagosLayout.setHorizontalGroup(
            pnlListadoPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListadoPagosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlListadoPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrListadoPagos)
                    .addGroup(pnlListadoPagosLayout.createSequentialGroup()
                        .addComponent(btnImprimirComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImprimirComprobanteConsumo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(btnReporte)
                        .addGap(48, 48, 48)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir))
                    .addGroup(pnlListadoPagosLayout.createSequentialGroup()
                        .addComponent(lblTotalRegistrosPagos)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlListadoPagosLayout.setVerticalGroup(
            pnlListadoPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListadoPagosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlListadoPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImprimirComprobante)
                    .addComponent(btnImprimirComprobanteConsumo)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir)
                    .addComponent(btnReporte))
                .addGap(27, 27, 27)
                .addComponent(scrListadoPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTotalRegistrosPagos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(pnlListadoConsumos, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(pnlListadoPagos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(pnlListadoConsumos, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlListadoPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdReservaActionPerformed
        txtIdReserva.transferFocus();
    }//GEN-LAST:event_txtIdReservaActionPerformed

    private void txtNumComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumComprobanteActionPerformed
        txtNumComprobante.transferFocus();
    }//GEN-LAST:event_txtNumComprobanteActionPerformed

    private void cboTipoComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoComprobanteActionPerformed
        cboTipoComprobante.transferFocus();
    }//GEN-LAST:event_cboTipoComprobanteActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitar();
        btnGuardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(txtImpuesto.getText().length() == 0){
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar el igv del Comprobante de pago a generar");
            txtImpuesto.requestFocus();
            return;
        }
        if(txtTotalPago.getText().length() == 0){
            JOptionPane.showConfirmDialog(rootPane, " Debes ingresar el tital de pago del comprobante");
            txtTotalPago.requestFocus();
            return;
        }
        if(txtNumComprobante.getText().length() == 0){
            JOptionPane.showConfirmDialog(rootPane, " Debes ingresar un Número de Comprobante del Pago");
            txtNumComprobante.requestFocus();
            return;
        }
        Pago pago = new Pago();
        PagoDAO func = new PagoDAO();
        pago.setIdReserva(Integer.parseInt(txtIdReserva.getText()));
        int seleccionado = cboTipoComprobante.getSelectedIndex();
        pago.setTipoComprobante((String) cboTipoComprobante.getItemAt(seleccionado));
        pago.setNumComprobante(txtNumComprobante.getText());
        pago.setImpuesto(Double.parseDouble(txtImpuesto.getText()));
        pago.setTotalPago(Double.parseDouble(txtTotalPago.getText()));
        Calendar cal;
        int d, m, a;
        cal = datFechaPago.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        pago.setFechaPago(new Date(a,m,d));
        cal = datFechaEmision.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        pago.setFechaEmision(new Date(a,m,d));
        if(accion.equals("guardar")){
            if (func.insertar(pago)){
                JOptionPane.showMessageDialog(rootPane, " El pago por $. " +txtTotalPago.getText()
                + " de " + txtCliente.getText() + " ha sido realizado con Éxito");
                mostrar(idReserva);
                inhabilitar();
                HabitacionDAO habitacionDAO = new HabitacionDAO();
                Habitacion habitacion = new Habitacion();
                habitacion.setIdhabitacion(Integer.parseInt(txtIdHabitacion.getText()));
                habitacionDAO.desocupar(habitacion);
                ReservaDAO reservaDAO = new ReservaDAO();
                Reserva reserva = new Reserva();
                reserva.setIdReserva(Integer.parseInt(txtIdReserva.getText()));
                reservaDAO.pagar(reserva);
            }
        }else if (accion.equals("editar")){
            pago.setIdPago(Integer.parseInt(txtIdPago.getText()));
            if(func.editar(pago)){
                JOptionPane.showMessageDialog(rootPane, " El pago de " + txtCliente.getText() + " ha sido modificado correctamente");
                mostrar(idReserva);
                inhabilitar();
            }
        }
                
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtTotalPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPagoActionPerformed
        
    }//GEN-LAST:event_txtTotalPagoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (!txtIdPago.getText().equals("")){
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Estás seguro de Eliminar el Pago seleccionado?", "Confirmar", 2);
            if (confirmacion == 0){
                PagoDAO pagoDAO = new PagoDAO();
                Pago pago = new Pago();
                pago.setIdPago(Integer.parseInt(txtIdPago.getText()));
                pagoDAO.eliminar(pago);
                mostrar(idReserva);
                inhabilitar();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private Connection connection = new Conexion().conectar();

    private void btnImprimirComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirComprobanteActionPerformed
        if(!txtIdPago.getText().equals("")){
            Map p = new HashMap();
            p.put("idpago", txtIdPago.getText());
            JasperReport report;
            JasperPrint print;
            try{
                report = JasperCompileManager.compileReport(new File("").getAbsolutePath() + "/src/Reportes/rptComprobante.jrxml");
                print = JasperFillManager.fillReport(report, p, connection);
                JasperViewer view = new JasperViewer(print, false);
                view.setTitle("Comprobante");
                view.setVisible(true);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnImprimirComprobanteActionPerformed

    private void btnImprimirComprobanteConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirComprobanteConsumoActionPerformed
        if(!txtIdPago.getText().equals("")){
            Map p = new HashMap();
            p.put("idpago", txtIdPago.getText());
            JasperReport report;
            JasperPrint print;
            try{
                report = JasperCompileManager.compileReport(new File("").getAbsolutePath() + "/src/Reportes/rptComprobanteConsumo.jrxml");
                print = JasperFillManager.fillReport(report, p, connection);
                JasperViewer view = new JasperViewer(print, false);
                view.setTitle("Comprobante");
                view.setVisible(true);
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnImprimirComprobanteConsumoActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(PagoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimirComprobante;
    private javax.swing.JButton btnImprimirComprobanteConsumo;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboTipoComprobante;
    private com.toedter.calendar.JDateChooser datFechaEmision;
    private com.toedter.calendar.JDateChooser datFechaPago;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTotalConsumo;
    private javax.swing.JLabel lblTotalRegistrosConsumo;
    private javax.swing.JLabel lblTotalRegistrosPagos;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlListadoConsumos;
    private javax.swing.JPanel pnlListadoPagos;
    private javax.swing.JScrollPane scrListadoPagos;
    private javax.swing.JPanel srcListadoConsumos;
    private javax.swing.JTable tblListadoConsumo;
    private javax.swing.JTable tblListadoPagos;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtHabitacion;
    private javax.swing.JTextField txtIdHabitacion;
    private javax.swing.JTextField txtIdPago;
    private javax.swing.JTextField txtIdReserva;
    private javax.swing.JTextField txtImpuesto;
    private javax.swing.JTextField txtNumComprobante;
    private javax.swing.JTextField txtTotalPago;
    private javax.swing.JTextField txtTotalReserva;
    // End of variables declaration//GEN-END:variables
}
