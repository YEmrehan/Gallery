import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class satislar extends javax.swing.JFrame {

    public satislar() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Satışlar");
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

        jLabel2.setText("Müşteri ID");

        jLabel3.setText("Araba ID");

        jLabel4.setText("Çalışan ID");

        jLabel5.setText("Satış Fiyatı");

        jLabel6.setText("Satış Tarihi");

        jLabel1.setText("ID");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Araba ID", "Müşteri ID", "Çalışan ID", "Satış Tarihi", "Satış Fiyatı"
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addComponent(jTextField8)
                    .addComponent(jTextField9)
                    .addComponent(jTextField10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jToggleButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jButton3)
                            .addComponent(jToggleButton2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton2)
                    .addComponent(jToggleButton3))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            ResultSet sonucKumesi = sorgu.executeQuery("SELECT * FROM satislar");
            DefaultTableModel varsayilanTablo = (DefaultTableModel) jTable1.getModel();
            varsayilanTablo.setRowCount(0);
            while(sonucKumesi.next()){
                varsayilanTablo.addRow(new String[]{
                    sonucKumesi.getString("id"),
                    sonucKumesi.getString("araba_id"),
                    sonucKumesi.getString("musteri_id"),
                    sonucKumesi.getString("calisan_id"),
                    sonucKumesi.getString("tarih"),
                    sonucKumesi.getString("fiyat")
                });
            }
            jTable1.setModel(varsayilanTablo);
            sorgu.close();
            baglanti.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Kayıtlar Listelenemedi.");
        }
    }
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        arabalar arabalarPage = new arabalar();
        arabalarPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection baglanti = baglan();

            try {
                Statement sorgu=baglanti.createStatement();
                String id = jTextField1.getText();
                String araba_id = jTextField2.getText();
                String musteri_id = jTextField3.getText();
                String calisan_id = jTextField8.getText();
                String tarih = jTextField9.getText();
                String fiyat = jTextField10.getText();
                
                sorgu.executeUpdate(
                    "INSERT INTO satislar(id,araba_id,musteri_id,calisan_id,tarih,fiyat)"
                    +"VALUES('"+id+"','"+araba_id+"','"+musteri_id+"','"+calisan_id+"','"+tarih+"','"+fiyat+"')"     
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
                    sorgu.executeUpdate("DELETE FROM satislar WHERE id='"+id+"'");
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
                String araba_id = jTextField2.getText();
                String musteri_id = jTextField3.getText();
                String calisan_id = jTextField8.getText();
                String tarih = jTextField9.getText();
                String fiyat = jTextField10.getText();

                // Güncelleme sorgusu için temel SQL
                StringBuilder sqlUpdate = new StringBuilder("UPDATE satislar SET ");

                // Hangi alanların boş olmadığını kontrol et ve sadece o alanları güncelle
                boolean isFirst = true; // İlk güncellenen alan kontrolü için

                if (!araba_id.isEmpty()) {
                    if (!isFirst) sqlUpdate.append(", ");
                    sqlUpdate.append("araba_id='" + araba_id + "'");
                    isFirst = false;
                }
                if (!musteri_id.isEmpty()) {
                    if (!isFirst) sqlUpdate.append(", ");
                    sqlUpdate.append("musteri_id='" + musteri_id + "'");
                    isFirst = false;
                }
                if (!calisan_id.isEmpty()) {
                    if (!isFirst) sqlUpdate.append(", ");
                    sqlUpdate.append("calisan_id='" + calisan_id + "'");
                    isFirst = false;
                }
                if (!tarih.isEmpty()) {
                    if (!isFirst) sqlUpdate.append(", ");
                    sqlUpdate.append("tarih='" + tarih + "'");
                    isFirst = false;
                }
                if (!fiyat.isEmpty()) {
                    if (!isFirst) sqlUpdate.append(", ");
                    sqlUpdate.append("fiyat='" + fiyat + "'");
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
            java.util.logging.Logger.getLogger(satislar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(satislar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(satislar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(satislar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new satislar().setVisible(true);
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
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    // End of variables declaration//GEN-END:variables
}
