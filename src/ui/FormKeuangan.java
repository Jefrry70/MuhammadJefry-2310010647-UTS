package ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.text.NumberFormat;
import model.Transaction;
import model.TransactionManager;
import org.json.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FormKeuangan extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormKeuangan.class.getName());

    TransactionManager manager = new TransactionManager();
    DefaultTableModel tableModel;

    public FormKeuangan() {
        initComponents();
        setLocationRelativeTo(null);

        String[] kolom = {"Tanggal", "Kategori", "Deskripsi", "Jumlah"};
        tableModel = new DefaultTableModel(kolom, 0);
        tableKeuangan.setModel(tableModel);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JLabel();
        txtTanggal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JLabel();
        txtDeskripsi = new javax.swing.JTextField();
        cbKategori = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKeuangan = new javax.swing.JTable();
        lblSaldo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.setText("Tanggal :");

        txtTanggal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Kategori :");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField3.setText("Deskripsi :");

        txtDeskripsi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cbKategori.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pemasukan", "Pengeluaran" }));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.setText("Jumlah :");

        txtJumlah.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnTambah.setBackground(new java.awt.Color(51, 255, 51));
        btnTambah.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(255, 0, 0));
        btnHapus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnExport.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExport.setText("Export");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        btnImport.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnImport.setText("Import");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });

        tableKeuangan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tableKeuangan.setModel(new javax.swing.table.DefaultTableModel(
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
        tableKeuangan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKeuanganMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableKeuangan);

        lblSaldo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSaldo.setText("Saldo :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnHapus)
                                    .addComponent(btnExport))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnImport, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addComponent(btnEdit))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jTextField3)
                            .addComponent(jTextField2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTanggal)
                            .addComponent(txtDeskripsi)
                            .addComponent(cbKategori, 0, 158, Short.MAX_VALUE)
                            .addComponent(txtJumlah))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSaldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1)
                            .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(cbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3)
                            .addComponent(txtDeskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2)
                            .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambah)
                            .addComponent(btnEdit))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClear)
                            .addComponent(btnHapus))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExport)
                            .addComponent(btnImport))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        try {
        String tgl = txtTanggal.getText();  // ← perbaiki ini
        String kategori = cbKategori.getSelectedItem().toString();
        String des = txtDeskripsi.getText();  // ← perbaiki ini
        double jumlah = Double.parseDouble(txtJumlah.getText());  // ← perbaiki ini

        Transaction t = new Transaction(tgl, kategori, des, jumlah);
        manager.add(t);

        refreshTable();
        clearForm();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Jumlah harus angka!");
    }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
       int index = tableKeuangan.getSelectedRow();

    if (index < 0) {
        JOptionPane.showMessageDialog(this, "Pilih baris yang mau diedit!");
        return;
    }

    try {
        String tgl = txtTanggal.getText();  // ← perbaiki
        String kategori = cbKategori.getSelectedItem().toString();
        String des = txtDeskripsi.getText();  // ← perbaiki
        double jumlah = Double.parseDouble(txtJumlah.getText());  // ← perbaiki

        Transaction t = new Transaction(tgl, kategori, des, jumlah);
        manager.update(index, t);

        refreshTable();
        clearForm();

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Jumlah harus angka!");
    }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
       int index = tableKeuangan.getSelectedRow();

        if (index < 0) {
            JOptionPane.showMessageDialog(this, "Pilih baris dulu!");
            return;
        }

        manager.delete(index);
        refreshTable();
        clearForm();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tableKeuanganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKeuanganMouseClicked
        int index = tableKeuangan.getSelectedRow();

    if (index >= 0) {
        Transaction t = manager.getAll().get(index);

        txtTanggal.setText(t.getTanggal());
        cbKategori.setSelectedItem(t.getKategori());
        txtDeskripsi.setText(t.getDeskripsi());
        
        // Format angka tanpa desimal untuk input field
        txtJumlah.setText(String.format("%.0f", t.getJumlah()));  // ← perbaiki ini
    }
    }//GEN-LAST:event_tableKeuanganMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
    }                                        

    private void clearForm() {
        txtTanggal.setText("");  // ← perbaiki
    cbKategori.setSelectedIndex(0);
    txtDeskripsi.setText("");  // ← perbaiki
    txtJumlah.setText("");  // ← perbaiki
    tableKeuangan.clearSelection();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
       String[] options = {"TXT", "PDF", "Excel (XLSX)", "JSON"};
    int choice = JOptionPane.showOptionDialog(this,
            "Pilih format export:",
            "Export Data",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]);

    if (choice == -1) return; // User cancelled

    JFileChooser fileChooser = new JFileChooser();
    
    switch (choice) {
        case 0: // TXT
            exportToTXT(fileChooser);
            break;
        case 1: // PDF
            exportToPDF(fileChooser);
            break;
        case 2: // Excel
            exportToExcel(fileChooser);
            break;
        case 3: // JSON
            exportToJSON(fileChooser);
            break;
    }
    }//GEN-LAST:event_btnExportActionPerformed

      private void exportToTXT(JFileChooser fileChooser) {
        try {
            fileChooser.setDialogTitle("Export ke TXT");
            fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files (*.txt)", "txt"));
            
            if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                if (!file.getName().endsWith(".txt")) {
                    file = new File(file.getAbsolutePath() + ".txt");
                }

                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                
                writer.write("================================================================================");
                writer.newLine();
                writer.write("LAPORAN KEUANGAN");
                writer.newLine();
                writer.write("================================================================================");
                writer.newLine();
                writer.newLine();
                
                writer.write(String.format("%-15s %-15s %-30s %15s", "Tanggal", "Kategori", "Deskripsi", "Jumlah"));
                writer.newLine();
                writer.write("--------------------------------------------------------------------------------");
                writer.newLine();

                NumberFormat nf = NumberFormat.getInstance();
                for (Transaction t : manager.getAll()) {
                    writer.write(String.format("%-15s %-15s %-30s %15s",
                            t.getTanggal(),
                            t.getKategori(),
                            t.getDeskripsi(),
                            nf.format(t.getJumlah())));
                    writer.newLine();
                }
                
                writer.newLine();
                writer.write("================================================================================");
                writer.newLine();
                writer.write("Total Saldo: Rp " + nf.format(manager.getTotalSaldo()));
                writer.newLine();

                writer.close();
                JOptionPane.showMessageDialog(this, "Export TXT berhasil!");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Gagal export TXT: " + e.getMessage());
        }
    }
    
    private void exportToPDF(JFileChooser fileChooser) {
    try {
        fileChooser.setDialogTitle("Export ke PDF");
        fileChooser.setFileFilter(new FileNameExtensionFilter("PDF Files (*.pdf)", "pdf"));
        
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            if (!file.getName().endsWith(".pdf")) {
                file = new File(file.getAbsolutePath() + ".pdf");
            }

            com.itextpdf.text.Document document = new com.itextpdf.text.Document();
            com.itextpdf.text.pdf.PdfWriter.getInstance(document, new FileOutputStream(file));
            document.open();

            com.itextpdf.text.Font titleFont = new com.itextpdf.text.Font(
                com.itextpdf.text.Font.FontFamily.HELVETICA, 18, com.itextpdf.text.Font.BOLD);
            com.itextpdf.text.Paragraph title = new com.itextpdf.text.Paragraph("LAPORAN KEUANGAN", titleFont);
            title.setAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
            title.setSpacingAfter(20);
            document.add(title);

            com.itextpdf.text.pdf.PdfPTable table = new com.itextpdf.text.pdf.PdfPTable(4);
            table.setWidthPercentage(100);
            table.setWidths(new float[]{2, 2, 3, 2});

            com.itextpdf.text.Font headerFont = new com.itextpdf.text.Font(
                com.itextpdf.text.Font.FontFamily.HELVETICA, 12, com.itextpdf.text.Font.BOLD);
            com.itextpdf.text.pdf.PdfPCell cell;
            
            String[] headers = {"Tanggal", "Kategori", "Deskripsi", "Jumlah"};
            for (String header : headers) {
                cell = new com.itextpdf.text.pdf.PdfPCell(new com.itextpdf.text.Phrase(header, headerFont));
                cell.setBackgroundColor(com.itextpdf.text.BaseColor.LIGHT_GRAY);
                cell.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
                table.addCell(cell);
            }

            NumberFormat nf = NumberFormat.getInstance();
            for (Transaction t : manager.getAll()) {
                table.addCell(t.getTanggal());
                table.addCell(t.getKategori());
                table.addCell(t.getDeskripsi());
                table.addCell(nf.format(t.getJumlah()));
            }

            document.add(table);

            com.itextpdf.text.Font totalFont = new com.itextpdf.text.Font(
                com.itextpdf.text.Font.FontFamily.HELVETICA, 14, com.itextpdf.text.Font.BOLD);
            com.itextpdf.text.Paragraph total = new com.itextpdf.text.Paragraph(
                "\nTotal Saldo: Rp " + nf.format(manager.getTotalSaldo()), totalFont);
            total.setSpacingBefore(20);
            document.add(total);

            document.close();
            JOptionPane.showMessageDialog(this, "Export PDF berhasil!");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Gagal export PDF: " + e.getMessage());
    }
    }
    
    private void exportToExcel(JFileChooser fileChooser) {
        try {
            fileChooser.setDialogTitle("Export ke Excel");
            fileChooser.setFileFilter(new FileNameExtensionFilter("Excel Files (*.xlsx)", "xlsx"));
            
            if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                if (!file.getName().endsWith(".xlsx")) {
                    file = new File(file.getAbsolutePath() + ".xlsx");
                }

                Workbook workbook = new XSSFWorkbook();
                Sheet sheet = workbook.createSheet("Laporan Keuangan");

                CellStyle headerStyle = workbook.createCellStyle();
                org.apache.poi.ss.usermodel.Font headerFont = workbook.createFont();
                headerFont.setBold(true);
                headerStyle.setFont(headerFont);
                headerStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
                headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

                Row headerRow = sheet.createRow(0);
                String[] headers = {"Tanggal", "Kategori", "Deskripsi", "Jumlah"};
                for (int i = 0; i < headers.length; i++) {
                    Cell cell = headerRow.createCell(i);
                    cell.setCellValue(headers[i]);
                    cell.setCellStyle(headerStyle);
                }

                int rowNum = 1;
                for (Transaction t : manager.getAll()) {
                    Row row = sheet.createRow(rowNum++);
                    row.createCell(0).setCellValue(t.getTanggal());
                    row.createCell(1).setCellValue(t.getKategori());
                    row.createCell(2).setCellValue(t.getDeskripsi());
                    row.createCell(3).setCellValue(t.getJumlah());
                }

                Row totalRow = sheet.createRow(rowNum + 1);
                Cell totalLabelCell = totalRow.createCell(2);
                totalLabelCell.setCellValue("Total Saldo:");
                
                CellStyle boldStyle = workbook.createCellStyle();
                org.apache.poi.ss.usermodel.Font boldFont = workbook.createFont();
                boldFont.setBold(true);
                boldStyle.setFont(boldFont);
                totalLabelCell.setCellStyle(boldStyle);
                
                Cell totalValueCell = totalRow.createCell(3);
                totalValueCell.setCellValue(manager.getTotalSaldo());
                totalValueCell.setCellStyle(boldStyle);

                for (int i = 0; i < headers.length; i++) {
                    sheet.autoSizeColumn(i);
                }

                FileOutputStream fileOut = new FileOutputStream(file);
                workbook.write(fileOut);
                fileOut.close();
                workbook.close();

                JOptionPane.showMessageDialog(this, "Export Excel berhasil!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal export Excel: " + e.getMessage());
        }
    }
    
    private void exportToJSON(JFileChooser fileChooser) {
        try {
            fileChooser.setDialogTitle("Export ke JSON");
            fileChooser.setFileFilter(new FileNameExtensionFilter("JSON Files (*.json)", "json"));
            
            if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                if (!file.getName().endsWith(".json")) {
                    file = new File(file.getAbsolutePath() + ".json");
                }

                JSONObject root = new JSONObject();
                JSONArray transactions = new JSONArray();

                for (Transaction t : manager.getAll()) {
                    JSONObject obj = new JSONObject();
                    obj.put("tanggal", t.getTanggal());
                    obj.put("kategori", t.getKategori());
                    obj.put("deskripsi", t.getDeskripsi());
                    obj.put("jumlah", t.getJumlah());
                    transactions.put(obj);
                }

                root.put("transactions", transactions);
                root.put("totalSaldo", manager.getTotalSaldo());

                FileWriter writer = new FileWriter(file);
                writer.write(root.toString(4));
                writer.close();

                JOptionPane.showMessageDialog(this, "Export JSON berhasil!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal export JSON: " + e.getMessage());
        }
}
    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
       String[] options = {"TXT", "Excel (XLSX)", "JSON"};
    int choice = JOptionPane.showOptionDialog(this,
            "Pilih format import:",
            "Import Data",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]);

    if (choice == -1) return;

    JFileChooser fileChooser = new JFileChooser();
    
    switch (choice) {
        case 0:
            importFromTXT(fileChooser);
            break;
        case 1:
            importFromExcel(fileChooser);
            break;
        case 2:
            importFromJSON(fileChooser);
            break;
    }
    
    }//GEN-LAST:event_btnImportActionPerformed

    private void importFromTXT(JFileChooser fileChooser) {
    try {
        fileChooser.setDialogTitle("Import dari TXT");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files (*.txt)", "txt"));
        
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            BufferedReader reader = new BufferedReader(new FileReader(file));

            manager = new TransactionManager();
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 4) {
                    try {
                        Transaction t = new Transaction(
                                parts[0].trim(),
                                parts[1].trim(),
                                parts[2].trim(),
                                Double.parseDouble(parts[3].trim())
                        );
                        manager.add(t);
                    } catch (NumberFormatException e) {
                        // Skip invalid lines
                    }
                }
            }

            reader.close();
            refreshTable();
            JOptionPane.showMessageDialog(this, "Import TXT selesai!");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Gagal import TXT: " + e.getMessage());
    }
}
    
    private void importFromExcel(JFileChooser fileChooser) {
    try {
        fileChooser.setDialogTitle("Import dari Excel");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Excel Files (*.xlsx)", "xlsx"));
        
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            FileInputStream fis = new FileInputStream(file);
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);

            manager = new TransactionManager();

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if (row != null) {
                    try {
                        String tanggal = getCellValueAsString(row.getCell(0));
                        String kategori = getCellValueAsString(row.getCell(1));
                        String deskripsi = getCellValueAsString(row.getCell(2));
                        double jumlah = getCellValueAsDouble(row.getCell(3));

                        if (!tanggal.isEmpty() && !kategori.isEmpty()) {
                            Transaction t = new Transaction(tanggal, kategori, deskripsi, jumlah);
                            manager.add(t);
                        }
                    } catch (Exception e) {
                        // Skip invalid rows
                    }
                }
            }

            workbook.close();
            fis.close();
            refreshTable();
            JOptionPane.showMessageDialog(this, "Import Excel selesai!");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Gagal import Excel: " + e.getMessage());
    }
}
    
    private void importFromJSON(JFileChooser fileChooser) {
    try {
        fileChooser.setDialogTitle("Import dari JSON");
        fileChooser.setFileFilter(new FileNameExtensionFilter("JSON Files (*.json)", "json"));
        
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            
            StringBuilder content = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            reader.close();

            JSONObject root = new JSONObject(content.toString());
            JSONArray transactions = root.getJSONArray("transactions");

            manager = new TransactionManager();

            for (int i = 0; i < transactions.length(); i++) {
                JSONObject obj = transactions.getJSONObject(i);
                Transaction t = new Transaction(
                        obj.getString("tanggal"),
                        obj.getString("kategori"),
                        obj.getString("deskripsi"),
                        obj.getDouble("jumlah")
                );
                manager.add(t);
            }

            refreshTable();
            JOptionPane.showMessageDialog(this, "Import JSON selesai!");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Gagal import JSON: " + e.getMessage());
    }
}
    
    private String getCellValueAsString(Cell cell) {
    if (cell == null) return "";
    
    switch (cell.getCellType()) {
        case STRING:
            return cell.getStringCellValue();
        case NUMERIC:
            if (DateUtil.isCellDateFormatted(cell)) {
                return cell.getDateCellValue().toString();
            }
            return String.valueOf((long) cell.getNumericCellValue());
        case BOOLEAN:
            return String.valueOf(cell.getBooleanCellValue());
        default:
            return "";
    }
}

private double getCellValueAsDouble(Cell cell) {
    if (cell == null) return 0.0;
    
    switch (cell.getCellType()) {
        case NUMERIC:
            return cell.getNumericCellValue();
        case STRING:
            try {
                return Double.parseDouble(cell.getStringCellValue());
            } catch (NumberFormatException e) {
                return 0.0;
            }
        default:
            return 0.0;
    }
}


     private void refreshTable() {

        tableModel.setRowCount(0);
    
    NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(new java.util.Locale("id", "ID"));
    
    for (Transaction t : manager.getAll()) {
        tableModel.addRow(new Object[]{
            t.getTanggal(),
            t.getKategori(),
            t.getDeskripsi(),
            rupiahFormat.format(t.getJumlah())  // ← tampil sebagai Rp10.000.000,00
        });
    }

    lblSaldo.setText("Saldo: " + rupiahFormat.format(manager.getTotalSaldo()));
    }
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormKeuangan().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cbKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTextField1;
    private javax.swing.JLabel jTextField2;
    private javax.swing.JLabel jTextField3;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JTable tableKeuangan;
    private javax.swing.JTextField txtDeskripsi;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtTanggal;
    // End of variables declaration//GEN-END:variables
}