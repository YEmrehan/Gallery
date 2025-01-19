import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class calisanlar extends javax.swing.JFrame {

    public calisanlar() {
        initComponents();
        baglan();
        tablo();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Çalışanlar");
        setAutoRequestFocus(false);
        setPreferredSize(new java.awt.Dimension(850, 700));

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

        jToggleButton1.setText("Arabalar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("İsim");

        jLabel4.setText("Pozisyon");

        jLabel1.setText("ID");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "İsim", "Soyisim", "Pozisyon", "Telefon", "Adres"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setText("Adres");

        jLabel2.setText("Soyisim");

        jLabel6.setText("Telefon");

        jButton1.setText("Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2)
                            .addComponent(jTextField4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5)
                            .addComponent(jTextField6))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(375, 375, 375)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(jScrollPane1)
                    .addGap(8, 8, 8)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton4))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(352, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(353, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(2, 2, 2)))
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
            ResultSet sonucKumesi = sorgu.executeQuery("SELECT * FROM calisanlar");
            DefaultTableModel varsayilanTablo = (DefaultTableModel) jTable1.getModel();
            varsayilanTablo.setRowCount(0);
            while(sonucKumesi.next()){
                varsayilanTablo.addRow(new String[]{
                    sonucKumesi.getString("id"),
                    sonucKumesi.getString("isim"),
                    sonucKumesi.getString("soyisim"),
                    sonucKumesi.getString("pozisyon"),
                    sonucKumesi.getString("telefon"),
                    sonucKumesi.getString("adres"),
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

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        arabalar arabalarPage = new arabalar();
        arabalarPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection baglanti = baglan();

            try {
                Statement sorgu=baglanti.createStatement();
                String id = jTextField1.getText();
                String isim = jTextField2.getText();
                String soyisim = jTextField4.getText();
                String pozisyon = jTextField5.getText();
                String telefon = jTextField6.getText();
                String adres = jTextField7.getText();
                sorgu.executeUpdate(
                    "INSERT INTO calisanlar(id,isim,soyisim,pozisyon,telefon,adres)"
                    +"VALUES('"+id+"','"+isim+"','"+soyisim+"','"+pozisyon+"','"+telefon+"','"+adres+"')"
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
                    sorgu.executeUpdate("DELETE FROM calisanlar WHERE id='"+id+"'");
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
                String isim = jTextField2.getText();
                String soyisim = jTextField4.getText();
                String pozisyon = jTextField5.getText();
                String telefon = jTextField6.getText();
                String adres = jTextField7.getText();

                // Güncelleme sorgusu için temel SQL
                StringBuilder sqlUpdate = new StringBuilder("UPDATE calisanlar SET ");

                // Hangi alanların boş olmadığını kontrol et ve sadece o alanları güncelle
                boolean isFirst = true; // İlk güncellenen alan kontrolü için

                if (!isim.isEmpty()) {
                    if (!isFirst) sqlUpdate.append(", ");
                    sqlUpdate.append("isim='" + isim + "'");
                    isFirst = false;
                }
                if (!soyisim.isEmpty()) {
                    if (!isFirst) sqlUpdate.append(", ");
                    sqlUpdate.append("soyisim='" + soyisim + "'");
                    isFirst = false;
                }
                if (!pozisyon.isEmpty()) {
                    if (!isFirst) sqlUpdate.append(", ");
                    sqlUpdate.append("pozisyon='" + pozisyon + "'");
                    isFirst = false;
                }
                if (!telefon.isEmpty()) {
                    if (!isFirst) sqlUpdate.append(", ");
                    sqlUpdate.append("telefon='" + telefon + "'");
                    isFirst = false;
                }
                if (!adres.isEmpty()) {
                    if (!isFirst) sqlUpdate.append(", ");
                    sqlUpdate.append("adres='" + adres + "'");
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
            java.util.logging.Logger.getLogger(calisanlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calisanlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calisanlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calisanlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calisanlar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    // End of variables declaration//GEN-END:variables
}
