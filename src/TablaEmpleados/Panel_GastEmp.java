/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package TablaEmpleados;


import ConexionBD.Conexion;
import Proveedores.Proveedores_Principal;
import Proveedores.TGeneral;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Johan Mendoza
 */
public class Panel_GastEmp extends javax.swing.JPanel {

    String numop;
    static int idemp, confirmacion;
    static double importetotal;
    static Date date;
    static String NombreEmp, NombreProyecto, Solicitante, Concepto;
    /**
     * Creates new form Panel_CXP
     */
    public Panel_GastEmp() {
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

        btnGroupCondPago = new javax.swing.ButtonGroup();
        btnGroupAnticipo = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtsearch = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPBuscar = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_id = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nombreproyecto = new javax.swing.JTextField();
        txt_concepto = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lbl_NEmp = new javax.swing.JLabel();
        lbl_fpago = new javax.swing.JLabel();
        txt_numop = new javax.swing.JTextField();
        txt_autorizo = new javax.swing.JTextField();
        jdc_Fechaem = new com.toedter.calendar.JDateChooser();
        jLabel27 = new javax.swing.JLabel();
        txt_numempleado = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        lbl_estatus = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        lbl_saldoxcobrar = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPEditar = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPAdd = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPDelete = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        pnl_limpar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(950, 550));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Antique Olive", 1, 24)); // NOI18N
        jLabel18.setText("MENU PRINCIPAL DE GASTOS DE EMPLEADO");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel18)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(140, 140, 140));

        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Búsqueda por Número de Operación");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(140, 140, 140));

        jPBuscar.setBackground(new java.awt.Color(140, 140, 140));
        jPBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPBuscarMouseClicked(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconografias/lupa.png"))); // NOI18N

        javax.swing.GroupLayout jPBuscarLayout = new javax.swing.GroupLayout(jPBuscar);
        jPBuscar.setLayout(jPBuscarLayout);
        jPBuscarLayout.setHorizontalGroup(
            jPBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPBuscarLayout.setVerticalGroup(
            jPBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(140, 140, 140));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_id.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_id.setForeground(new java.awt.Color(255, 255, 255));
        lbl_id.setText("Número de Operación");
        jPanel1.add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 160, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre del Asociado");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 160, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha de Emisión");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 130, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre del Proyecto");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 120, -1));

        txt_nombreproyecto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_nombreproyecto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreproyectoKeyTyped(evt);
            }
        });
        jPanel1.add(txt_nombreproyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 160, -1));

        txt_concepto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_concepto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_conceptoKeyTyped(evt);
            }
        });
        jPanel1.add(txt_concepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 670, 50));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Autorizó");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 150, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Concepto");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 80, -1));

        lbl_NEmp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_NEmp.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_NEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 20));

        lbl_fpago.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_fpago.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_fpago, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 120, 20));
        jPanel1.add(txt_numop, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 160, -1));

        txt_autorizo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_autorizoActionPerformed(evt);
            }
        });
        txt_autorizo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_autorizoKeyReleased(evt);
            }
        });
        jPanel1.add(txt_autorizo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 250, -1));
        jPanel1.add(jdc_Fechaem, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 160, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("ID de Asociado");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 130, -1));

        txt_numempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numempleadoActionPerformed(evt);
            }
        });
        txt_numempleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_numempleadoKeyReleased(evt);
            }
        });
        jPanel1.add(txt_numempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 170, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Importe ");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 80, -1));

        lbl_estatus.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(lbl_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 220, 60));

        txt_total.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });
        txt_total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_totalKeyTyped(evt);
            }
        });
        jPanel1.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 170, -1));

        lbl_saldoxcobrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_saldoxcobrar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_saldoxcobrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lbl_saldoxcobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 100, 20));

        jPanel5.setBackground(new java.awt.Color(107, 190, 249));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPEditar.setBackground(new java.awt.Color(107, 190, 249));
        jPEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPEditarMouseClicked(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconografias/icons8-editar-50.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPEditarLayout = new javax.swing.GroupLayout(jPEditar);
        jPEditar.setLayout(jPEditarLayout);
        jPEditarLayout.setHorizontalGroup(
            jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEditarLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPEditarLayout.setVerticalGroup(
            jPEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPEditarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14))
        );

        jPanel5.add(jPEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, 90, -1));

        jPAdd.setBackground(new java.awt.Color(107, 190, 249));
        jPAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPAddMouseClicked(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconografias/icons8-recibo-dólar-50.png"))); // NOI18N

        javax.swing.GroupLayout jPAddLayout = new javax.swing.GroupLayout(jPAdd);
        jPAdd.setLayout(jPAddLayout);
        jPAddLayout.setHorizontalGroup(
            jPAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAddLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel16)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPAddLayout.setVerticalGroup(
            jPAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAddLayout.createSequentialGroup()
                .addComponent(jLabel16)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.add(jPAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 100, 50));

        jPDelete.setBackground(new java.awt.Color(107, 190, 249));
        jPDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPDeleteMouseClicked(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconografias/icons8-orden-de-compra-50.png"))); // NOI18N

        javax.swing.GroupLayout jPDeleteLayout = new javax.swing.GroupLayout(jPDelete);
        jPDelete.setLayout(jPDeleteLayout);
        jPDeleteLayout.setHorizontalGroup(
            jPDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDeleteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(18, 18, 18))
        );
        jPDeleteLayout.setVerticalGroup(
            jPDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDeleteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15))
        );

        jPanel5.add(jPDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 90, 50));

        pnl_limpar.setBackground(new java.awt.Color(107, 190, 249));
        pnl_limpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_limpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_limparMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconografias/icons8-escoba-50.png"))); // NOI18N

        javax.swing.GroupLayout pnl_limparLayout = new javax.swing.GroupLayout(pnl_limpar);
        pnl_limpar.setLayout(pnl_limparLayout);
        pnl_limparLayout.setHorizontalGroup(
            pnl_limparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_limparLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );
        pnl_limparLayout.setVerticalGroup(
            pnl_limparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_limparLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.add(pnl_limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 100, 50));

        jLabel22.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel22.setText("EDITAR FACTURA");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel24.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel24.setText("LIMPIAR FORMULARIO");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        jLabel25.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel25.setText("GENERAR GASTO");
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jLabel26.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel26.setText("REPORTE DE GASTOS");
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPBuscarMouseClicked
        try {
            // Aqui es donde se generara la busqueda
            //txt_NumFact.setVisible(true);
            //lbl_id.setVisible(true);
            
            numop=txtsearch.getText();
            
            Statement stm=Conexion.getConexion().createStatement();
            ResultSet rst=stm.executeQuery("SELECT * from GtosEmpleados where NumOperacion = '"+numop+"'");
            if(rst.next())
            {
                idemp= rst.getInt(2);
                NombreProyecto = rst.getString(3);
                importetotal = rst.getDouble(4);
                Solicitante = rst.getString(5);  
                date = rst.getDate(6);
                Concepto = rst.getString(7);
                NombreEmp = rst.getString(8);
                
                
                
                txt_numempleado.setText(String.valueOf(idemp));
                txt_numop.setText(numop.trim());
                txt_autorizo.setText(String.valueOf(Solicitante));
                lbl_NEmp.setText(NombreEmp.trim());
                txt_concepto.setText(Concepto.trim());
                txt_total.setText(String.valueOf(importetotal).trim());
                txt_nombreproyecto.setText(NombreProyecto.trim());
                jdc_Fechaem.setDate(date);
                          
                
            } else {
                JOptionPane.showMessageDialog(null, "El número de Factura no existe","Número no existente",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Panel_GastEmp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jPBuscarMouseClicked

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // Busqueda de informacion mediante ID, NOMBRE O RFC

    }//GEN-LAST:event_txtsearchActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased

    }//GEN-LAST:event_txtsearchKeyReleased

    private void jPEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPEditarMouseClicked
        date = jdc_Fechaem.getDate();
        long d = date.getTime();
        java.sql.Date fechaem = new java.sql.Date(d);
        numop= txt_numop.getText();
        importetotal = Double.parseDouble(txt_total.getText());
        NombreProyecto = txt_nombreproyecto.getText();
        Solicitante = txt_autorizo.getText();
        Concepto = txt_concepto.getText();
        
         try {
            
            Statement stm=Conexion.getConexion().createStatement();
            
           
             confirmacion = JOptionPane.showConfirmDialog(null,"¿Esta seguro que desea editar estos datos?");
             if(confirmacion == 0){
                  ResultSet rst=stm.executeQuery("update GtosEmpleados set IDAsociado = '"+idemp+"', NombreProjecto ='"+NombreProyecto.trim()+"', Importe = '"+importetotal+"', Autorizo = '"+Solicitante.trim()+"', FEmision = '"+fechaem+"', Concepto = '"+Concepto.trim()+"', NombreAsociado = '"+NombreEmp.trim()+"' where NumOperacion = '"+numop+"'");            
             }
            
        
        } catch (SQLException ex) {
            Logger.getLogger(Panel_GastEmp.class.getName()).log(Level.SEVERE, null, ex);
        }
         JOptionPane.showMessageDialog(null, "Datos editados con éxito","Datos Gauradados",JOptionPane.INFORMATION_MESSAGE);
         
         confirmacion = JOptionPane.showConfirmDialog(null,"¿Desea modificar otros datos?");
         if(confirmacion == 0){
         }
    }//GEN-LAST:event_jPEditarMouseClicked

    private void jPAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPAddMouseClicked
        date = jdc_Fechaem.getDate();
        long d = date.getTime();
        java.sql.Date fechaem = new java.sql.Date(d);
        numop = txt_numop.getText();
        importetotal = Double.parseDouble(txt_total.getText());
        NombreProyecto = txt_nombreproyecto.getText();
        Solicitante = txt_autorizo.getText();
        Concepto = txt_concepto.getText();
        
    
         try {
            
            Statement stm=Conexion.getConexion().createStatement();
            //Llamado a la base de datos
            ResultSet rs=stm.executeQuery("insert into GtosEmpleados (NumOperacion, IDAsociado, NombreProjecto, Importe, Autorizo, FEmision, Concepto, NombreAsociado) values ('"+numop.trim()+"','"+idemp+"','"+NombreProyecto.trim()+"','"+importetotal+"','"+Solicitante.trim()+"','"+fechaem+"', '"+Concepto.trim()+"','"+NombreEmp.trim()+"')");
        } catch (SQLException ex) {
            Logger.getLogger(Panel_GastEmp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jPAddMouseClicked

    private void jPDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPDeleteMouseClicked
        // Eleminacion de un proveedor

    }//GEN-LAST:event_jPDeleteMouseClicked

    private void pnl_limparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_limparMouseClicked
        // TODO add your handling code here:
        txt_numop.setText("");
        txt_autorizo.setText("");
        lbl_NEmp.setText("");
        txt_concepto.setText("");
        txt_nombreproyecto.setText("");
        lbl_fpago.setText("");
        lbl_NEmp.setText("");
        txt_total.setText("");
        lbl_estatus.setText("");
        lbl_fpago.setText("");
        jdc_Fechaem.setDate(null);
    }//GEN-LAST:event_pnl_limparMouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void txt_totalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_totalKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalKeyTyped

    private void txt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalActionPerformed

    private void txt_numempleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numempleadoKeyReleased
        // TODO add your handling code here:
        idemp = Integer.parseInt(txt_numempleado.getText());
        if(txt_numempleado.getText() != ""){
            try {

                Statement stm=Conexion.getConexion().createStatement();
                //Llamado a la base de datos
                ResultSet rs=stm.executeQuery("Select NomEmpleado from Empleados where NumEmpleado = '"+idemp+"' ");
                if(rs.next()){
                    lbl_NEmp.setForeground(new Color(0,0,0));
                    NombreEmp = rs.getString("NomCliente");
                    lbl_NEmp.setText(NombreEmp.trim());
                } else {
                    lbl_NEmp.setForeground(Color.red);
                    lbl_NEmp.setText("Cliente no existente");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Panel_GastEmp.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            lbl_NEmp.setText("");
        }
    }//GEN-LAST:event_txt_numempleadoKeyReleased

    private void txt_numempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numempleadoActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_numempleadoActionPerformed

    private void txt_autorizoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_autorizoKeyReleased

    }//GEN-LAST:event_txt_autorizoKeyReleased

    private void txt_autorizoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_autorizoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_autorizoActionPerformed

    private void txt_conceptoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_conceptoKeyTyped
        /*if(txt_concepto.getText().length() >= 13)
        {
            evt.consume();
        }*/
    }//GEN-LAST:event_txt_conceptoKeyTyped

    private void txt_nombreproyectoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreproyectoKeyTyped
        /*   if(txt_nombreproyecto.getText().length() >= 3)
        {
            evt.consume();
        }*/
    }//GEN-LAST:event_txt_nombreproyectoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupAnticipo;
    private javax.swing.ButtonGroup btnGroupCondPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPAdd;
    private javax.swing.JPanel jPBuscar;
    private javax.swing.JPanel jPDelete;
    private javax.swing.JPanel jPEditar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private com.toedter.calendar.JDateChooser jdc_Fechaem;
    private javax.swing.JLabel lbl_NEmp;
    private javax.swing.JLabel lbl_estatus;
    private javax.swing.JLabel lbl_fpago;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_saldoxcobrar;
    private javax.swing.JPanel pnl_limpar;
    private javax.swing.JTextField txt_autorizo;
    private javax.swing.JTextField txt_concepto;
    private javax.swing.JTextField txt_nombreproyecto;
    private javax.swing.JTextField txt_numempleado;
    private javax.swing.JTextField txt_numop;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
