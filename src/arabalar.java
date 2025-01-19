import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class arabalar extends javax.swing.JFrame {

    public arabalar() {
        initComponents();
        baglan();
        tablo();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jSpinner2 = new javax.swing.JSpinner();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arabalar");
        setPreferredSize(new java.awt.Dimension(850, 700));

        jToggleButton1.setText("Arabalar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Satışlar");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setText("Müşteriler");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.setText("Çalışanlar");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Şasi Numarası", "Marka", "Model", "Yıl", "Kilometre", "Yakıt Tipi", "Viteas Tipi", "Hasar Kaydı"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Şasi Numarası");

        jLabel2.setText("Model");

        jLabel3.setText("Marka");

        jLabel4.setText("Yıl");

        jLabel5.setText("Yakıt Tipi");

        jLabel6.setText("Kilometre");

        jLabel7.setText("Vites Tİpi");

        jLabel8.setText("Hasar Kaydı");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Benzin", "Dizel", "Benzin ve LPG", "Elektrik" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manuel", "Otomatik" }));

        jButton1.setText("Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setText("ID");

        jButton3.setText("Sil");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Düzenle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinner2)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSpinner1)
                            .addComponent(jTextField4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton4)))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Connection baglan(){
        String yol="jdbc:mysql://localhost/galeri";
        String kullanici_adi="root";
        String parola="";
        Connection conn=null;
        try{
            conn=DriverManager.getConnection(yol,kullanici_adi,parola);
        }catch(SQLException mySQLException){
            JOptionPane.showMessageDialog(rootPane, "Veritabanı Bağlantısı Sırasında Bir Hata Oluştu.");
        }
        return conn;
    }
    
    public void tablo(){
        Connection baglanti = baglan();
        try {
            Statement sorgu = baglanti.createStatement();
            ResultSet sonucKumesi = sorgu.executeQuery("SELECT * FROM arabalar");
            DefaultTableModel varsayilanTablo = (DefaultTableModel) jTable1.getModel();
            varsayilanTablo.setRowCount(0);
            while(sonucKumesi.next()){
                varsayilanTablo.addRow(new String[]{
                    sonucKumesi.getString("id"),
                    sonucKumesi.getString("sasi_numarasi"),
                    sonucKumesi.getString("marka"),
                    sonucKumesi.getString("model"),
                    sonucKumesi.getString("yil"),
                    sonucKumesi.getString("kilometre"),
                    sonucKumesi.getString("yakit_tipi"),
                    sonucKumesi.getString("vites_tipi"),
                    sonucKumesi.getString("hasar_kaydi"),
                });
            }
            jTable1.setModel(varsayilanTablo);
            sorgu.close();
            baglanti.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Kayıtlar Listelenemedi.");
        }
    }
    
    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
            satislar satislarPage = new satislar();
            satislarPage.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
            arabalar arabalarPage = new arabalar();
            arabalarPage.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
            musteriler musterilerPage = new musteriler();
            musterilerPage.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
            calisanlar calisanlarPage = new calisanlar();
            calisanlarPage.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection baglanti = baglan();

            try {
                Statement sorgu=baglanti.createStatement();
                String id = jTextField5.getText();
                String sasi_numarasi = jTextField1.getText();
                String marka = jTextField2.getText();
                String model = jTextField3.getText();
                String yil = jSpinner1.getValue().toString();
                String kilometre = jSpinner2.getValue().toString();
                String yakit_tipi = jComboBox1.getSelectedItem().toString();
                String vites_tipi = jComboBox2.getSelectedItem().toString();
                String hasar_kaydi = jTextField4.getText();
                
                sorgu.executeUpdate(
                    "INSERT INTO arabalar(id,sasi_numarasi,marka,model,yil,kilometre,yakit_tipi,vites_tipi,hasar_kaydi)"
                    +"VALUES('"+id+"','"+sasi_numarasi+"','"+marka+"','"+model+"','"+yil+"','"+kilometre+"','"+yakit_tipi+"','"+vites_tipi+"','"+hasar_kaydi+"')"
                );
                sorgu.close();
                baglanti.close();
                JOptionPane.showMessageDialog(rootPane, "Kayıt Eklendi.");
                tablo();
            } catch (SQLException mySQLException) {
                JOptionPane.showMessageDialog(rootPane, "Kayıt Eklenemedi.");
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Connection baglanti=baglan();
        try{
            if (jTable1.getSelectedRowCount()>0){
                if(JOptionPane.showConfirmDialog(rootPane, "Silmek İstiyor musunuz","Silme İşlemi",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                    int satirNumarasi=jTable1.getSelectedRow();
                    System.out.println("Secilen Satir: " + satirNumarasi);
                    String id=jTable1.getValueAt(satirNumarasi, 0).toString();
                    System.out.println("id: " + id);
                    Statement sorgu = baglanti.createStatement();
                    sorgu.executeUpdate("DELETE FROM arabalar WHERE id='"+id+"'");
                    sorgu.close();
                    baglanti.close();
                    JOptionPane.showMessageDialog(rootPane, "Seçili Kayıt Silindi.");
                    tablo();
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Lütfen Silmek İstediğiniz Kaydı Tablodan Seçiniz.");
            }
        }catch(SQLException mySQLExp){
            JOptionPane.showMessageDialog(rootPane, "Kayıt Silinemedi.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           // Bağlantıyı oluştur
    Connection baglanti = baglan();
    
    try {
        // Eğer tablodan bir satır seçilmişse
        if (jTable1.getSelectedRowCount() > 0) {
            // Seçilen satırın indeksini al
            int satirNumarasi = jTable1.getSelectedRow();
            
            // Seçilen satırdaki ID değerini al (ilk kolon)
            String id = jTable1.getValueAt(satirNumarasi, 0).toString();
            
            // Kullanıcının düzenlediği yeni verileri al
            String sasi_numarasi = jTextField1.getText();
            String marka = jTextField2.getText();
            String model = jTextField3.getText();
            String yil = jSpinner1.getValue().toString();
            String kilometre = jSpinner2.getValue().toString();
            String yakit_tipi = jComboBox1.getSelectedItem().toString();
            String vites_tipi = jComboBox2.getSelectedItem().toString();
            String hasar_kaydi = jTextField4.getText();
            
            // Güncelleme sorgusu için temel SQL
            StringBuilder sqlUpdate = new StringBuilder("UPDATE arabalar SET ");
            
            // Hangi alanların boş olmadığını kontrol et ve sadece o alanları güncelle
            boolean isFirst = true; // İlk güncellenen alan kontrolü için
            
            if (!sasi_numarasi.isEmpty()) {
                if (!isFirst) sqlUpdate.append(", ");
                sqlUpdate.append("sasi_numarasi='" + sasi_numarasi + "'");
                isFirst = false;
            }
            if (!marka.isEmpty()) {
                if (!isFirst) sqlUpdate.append(", ");
                sqlUpdate.append("marka='" + marka + "'");
                isFirst = false;
            }
            if (!model.isEmpty()) {
                if (!isFirst) sqlUpdate.append(", ");
                sqlUpdate.append("model='" + model + "'");
                isFirst = false;
            }
            if (!yil.isEmpty()) {
                if (!isFirst) sqlUpdate.append(", ");
                sqlUpdate.append("yil='" + yil + "'");
                isFirst = false;
            }
            if (!kilometre.isEmpty()) {
                if (!isFirst) sqlUpdate.append(", ");
                sqlUpdate.append("kilometre='" + kilometre + "'");
                isFirst = false;
            }
            if (!yakit_tipi.isEmpty()) {
                if (!isFirst) sqlUpdate.append(", ");
                sqlUpdate.append("yakit_tipi='" + yakit_tipi + "'");
                isFirst = false;
            }
            if (!vites_tipi.isEmpty()) {
                if (!isFirst) sqlUpdate.append(", ");
                sqlUpdate.append("vites_tipi='" + vites_tipi + "'");
                isFirst = false;
            }
            if (!hasar_kaydi.isEmpty()) {
                if (!isFirst) sqlUpdate.append(", ");
                sqlUpdate.append("hasar_kaydi='" + hasar_kaydi + "'");
                isFirst = false;
            }
            
            // Son olarak WHERE koşulunu ekle
            sqlUpdate.append(" WHERE id='" + id + "'");
            
            // SQL sorgusunu çalıştır
            Statement sorgu = baglanti.createStatement();
            sorgu.executeUpdate(sqlUpdate.toString());
            
            // Sorguyu kapat
            sorgu.close();
            // Bağlantıyı kapat
            baglanti.close();
            
            // Kullanıcıya bilgi ver
            JOptionPane.showMessageDialog(rootPane, "Kayıt Güncellendi.");
            // Tabloyu güncelle
            tablo();
        } else {
            // Eğer kullanıcı herhangi bir satır seçmediyse
            JOptionPane.showMessageDialog(rootPane, "Lütfen Güncellemek İstediğiniz Kaydı Tablodan Seçiniz.");
        }
    } catch (SQLException mySQLExp) {
        // Hata durumunda kullanıcıya bilgi ver
        JOptionPane.showMessageDialog(rootPane, "Kayıt Güncellenemedi.");
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(arabalar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(arabalar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(arabalar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(arabalar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new arabalar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    // End of variables declaration//GEN-END:variables
}
