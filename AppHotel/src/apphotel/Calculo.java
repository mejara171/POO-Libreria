/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apphotel;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import static java.time.Month.JANUARY;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author untac
 */
public class Calculo extends javax.swing.JFrame {

    /**
     * Creates new form Calculo
     */
    public Calculo() {
        initComponents();
        DefaultTableModel Mtable = (DefaultTableModel) jTableCal.getModel();
        if (!Iter.reservas.isEmpty()) {
            for (int i = 0; Iter.reservas.size() > i; i++) {
                if (Iter.reservas.get(i).toString().equals("start")) {
                    //FeReser.add(Iter.reservas.get(i + 3));
                    LocalDate currentDate1 = LocalDate.parse(Iter.reservas.get(i + 3).toString());
                    LocalDate currentDate2 = LocalDate.parse(Iter.reservas.get(i + 4).toString());
                    long valor = DAYS.between(currentDate1, currentDate2);
                    int valorXdias = (int) (valor * Integer.parseInt(Iter.reservas.get(i + 5).toString()));
                    //String valorint = Integer.toString(valorXdias1);
                    //String valorXdias = valorint.replace("0", " ").trim().replace(" ", "0");
                    System.out.println("dias trascaurridos " + valor);
                    String month = currentDate1.getMonth().toString();
                    System.out.println("dentro de la variables mes del for " + month);
                    switch (month) {
                        case "JANUARY":
                            System.out.println("ES ENERO");
                            Mtable.addRow(new Object[]{valorXdias, "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0",});
                            break;
                        case "FEBRUARY":
                            System.out.println("ES FEBRERO");
                            Mtable.addRow(new Object[]{"0", valorXdias, "0", "0", "0", "0", "0", "0", "0", "0", "0", "0",});
                            break;
                        case "MARCH":
                            System.out.println("ES MARZO");
                            Mtable.addRow(new Object[]{"0", "0", valorXdias, "0", "0", "0", "0", "0", "0", "0", "0", "0",});
                            break;
                        case "APRIL":
                            System.out.println("ES ABRIL");
                            Mtable.addRow(new Object[]{"0", "0", "0", valorXdias, "0", "0", "0", "0", "0", "0", "0", "0",});
                            break;
                        case "MAY":
                            System.out.println("ES MAYO");
                            Mtable.addRow(new Object[]{"0", "0", "0", "0", valorXdias, "0", "0", "0", "0", "0", "0", "0",});
                            break;
                        case "JUNE":
                            System.out.println("ES JUNIO");
                            Mtable.addRow(new Object[]{"0", "0", "0", "0", "0", valorXdias, "0", "0", "0", "0", "0", "0",});
                            break;
                        case "JULY":
                            System.out.println("ES JULIO");
                            Mtable.addRow(new Object[]{"0", "0", "0", "0", "0", "0", valorXdias, "0", "0", "0", "0", "0",});
                            break;
                        case "AUGUST":
                            System.out.println("ES AGOSTO");
                            Mtable.addRow(new Object[]{"0", "0", "0", "0", "0", "0", "0", valorXdias, "0", "0", "0", "0",});
                            break;
                        case "SEPTEMBER":
                            System.out.println("ES SEPTIEMBRE");
                            Mtable.addRow(new Object[]{"0", "0", "0", "0", "0", "0", "0", "0", valorXdias, "0", "0", "0",});
                            break;
                        case "OCTOBER":
                            System.out.println("ES OCTUIBRE");
                            Mtable.addRow(new Object[]{"0", "0", "0", "0", "0", "0", "0", "0", "0", valorXdias, "0", "0",});
                            break;
                        case "NOVEMBER":
                            System.out.println("ES NOVIEMBRE");
                            Mtable.addRow(new Object[]{"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", valorXdias, "0",});
                            break;
                        case "DECEMBER":
                            System.out.println("ES DICIEMBRE");
                            Mtable.addRow(new Object[]{"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", valorXdias,});
                            break;
                        default:
                            System.out.println("FECHA NO VALIDA");
                    }
                }

            }
        }
  

        //Date createdDate = (Date);
        //Mtable.addRow(new Object[]{"SIMPLE", Iter.Preehabitual.get(0).toString(), Iter.Preespora.get(0).toString()});
        System.out.println("datos dentro de la array de fechas " + FeReser);

        //getDayMonthYear("2022-01-15");
    }
    ArrayList FeReser = new ArrayList();

    void getDayMonthYear(String date) {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        // Get an instance of LocalTime
        // from date
        LocalDate currentDate = LocalDate.parse(date);
        //simpleDateFormat.format(currentDate);
        // Get day from date
        int day = currentDate.getDayOfMonth();

        // Get month from date
        Month month = currentDate.getMonth();

        // Get year from date
        int year = currentDate.getYear();

        // Print the day, month, and year
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCal = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextFieldene = new javax.swing.JTextField();
        jTextFieldfeb = new javax.swing.JTextField();
        jTextFieldmar = new javax.swing.JTextField();
        jTextFieldabr = new javax.swing.JTextField();
        jTextFieldmay = new javax.swing.JTextField();
        jTextFieldjun = new javax.swing.JTextField();
        jTextFieldjul = new javax.swing.JTextField();
        jTextFieldago = new javax.swing.JTextField();
        jTextFieldsep = new javax.swing.JTextField();
        jTextFieldoct = new javax.swing.JTextField();
        jTextFieldnov = new javax.swing.JTextField();
        jTextFielddic = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableCal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"
            }
        ));
        jScrollPane1.setViewportView(jTableCal);

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldene, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldfeb, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldmar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldabr, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldmay, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldjun, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldjul, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldago, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldsep, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldoct, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldnov, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFielddic, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldfeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldabr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldmay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldjun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldjul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldsep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldoct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldnov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFielddic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel Mtable = (DefaultTableModel) jTableCal.getModel();
        ArrayList DatosTable = new ArrayList();
        int sumene = 0;
        int sumfeb = 0;
        int summar = 0;
        int sumabr = 0;
        int summay = 0;
        int sumjun = 0;
        int sumjul = 0;
        int sumago = 0;
        int sumsep = 0;
        int sumoct = 0;
        int sumnov = 0;
        int sumdic = 0;

        for (int i = 0; i < jTableCal.getRowCount(); i++) {
            //for (int j = 0; j < jTableCal.getColumnCount(); j++) {
                System.out.println("dato dento de la columna enero " + jTableCal.getValueAt(i, 0).toString());
                //sumene = sumene + Integer.valueOf(jTableCal.getValueAt(i, 0).toString());
                // if (!jTableCal.getValueAt(i, j).toString().equals("")) {
                //String ene = jTableCal.getValueAt(i, 0).toString();

                sumene = sumene + Integer.parseInt(jTableCal.getValueAt(i, 0).toString());
                sumfeb = sumfeb + Integer.parseInt(jTableCal.getValueAt(i, 1).toString());
                summar = summar + Integer.parseInt(jTableCal.getValueAt(i, 2).toString());
                sumabr = sumabr + Integer.parseInt(jTableCal.getValueAt(i, 3).toString());
                summay = summay + Integer.parseInt(jTableCal.getValueAt(i, 4).toString());
                sumjun = sumjun + Integer.parseInt(jTableCal.getValueAt(i, 5).toString());
                sumjul = sumjul + Integer.parseInt(jTableCal.getValueAt(i, 6).toString());
                sumago = sumago + Integer.parseInt(jTableCal.getValueAt(i, 7).toString());
                sumsep = sumsep + Integer.parseInt(jTableCal.getValueAt(i, 8).toString());
                sumoct = sumoct + Integer.parseInt(jTableCal.getValueAt(i, 9).toString());
                sumnov = sumnov + Integer.parseInt(jTableCal.getValueAt(i, 10).toString());
                sumdic = sumdic + Integer.parseInt(jTableCal.getValueAt(i, 11).toString());
                //}

                //System.out.print(jTableCal.getValueAt(i, j) + "-");
            //}
            System.out.println();
        }
        jTextFieldene.setText(Integer.toString(sumene));
        jTextFieldfeb.setText(Integer.toString(sumfeb));
        jTextFieldmar.setText(Integer.toString(summar));
        jTextFieldabr.setText(Integer.toString(sumabr));
        jTextFieldmay.setText(Integer.toString(summay));
        jTextFieldjun.setText(Integer.toString(sumjun));
        jTextFieldjul.setText(Integer.toString(sumjul));
        jTextFieldago.setText(Integer.toString(sumago));
        jTextFieldsep.setText(Integer.toString(sumsep));
        jTextFieldoct.setText(Integer.toString(sumoct));
        jTextFieldnov.setText(Integer.toString(sumnov));
        jTextFielddic.setText(Integer.toString(sumdic));
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Calculo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCal;
    private javax.swing.JTextField jTextFieldabr;
    private javax.swing.JTextField jTextFieldago;
    private javax.swing.JTextField jTextFielddic;
    private javax.swing.JTextField jTextFieldene;
    private javax.swing.JTextField jTextFieldfeb;
    private javax.swing.JTextField jTextFieldjul;
    private javax.swing.JTextField jTextFieldjun;
    private javax.swing.JTextField jTextFieldmar;
    private javax.swing.JTextField jTextFieldmay;
    private javax.swing.JTextField jTextFieldnov;
    private javax.swing.JTextField jTextFieldoct;
    private javax.swing.JTextField jTextFieldsep;
    // End of variables declaration//GEN-END:variables
}
