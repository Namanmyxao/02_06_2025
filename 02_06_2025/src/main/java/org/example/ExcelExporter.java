package org.example;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelExporter {

    public void export(List<Student> students, String filePath) {
        try (Workbook workbook = new XSSFWorkbook(); FileOutputStream out = new FileOutputStream(filePath)) {
            Sheet sheet = workbook.createSheet("Students");

            // Header row
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("StudentCode");
            headerRow.createCell(1).setCellValue("Name");
            headerRow.createCell(2).setCellValue("Age");
            headerRow.createCell(3).setCellValue("Major");
            headerRow.createCell(4).setCellValue("GPA");
            headerRow.createCell(5).setCellValue("Classify");

            // Data rows
            int rowNum = 1;
            for (int i = 0; i < students.size(); i++) {
                Student student = students.get(i);
                Row row = sheet.createRow(i + 1);
                row.createCell(0).setCellValue(student.get_studentCode());
                row.createCell(1).setCellValue(student.get_name());
                row.createCell(2).setCellValue(student.get_age());
                row.createCell(3).setCellValue(student.get_major());
                row.createCell(4).setCellValue(student.get_GPA());
                row.createCell(5).setCellValue(student.get_Classify());
            }

            for (int i = 0; i<6; i++){
                sheet.autoSizeColumn(i);
            }

            workbook.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
