/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.Pertemuan_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author Rifka
 */
public class Write_doc {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {

        Properties prop = new Properties();
        prop.setProperty("log4j.rootLogger", "WARN");

        String teks = "Prodi Ilmu Komputer" ;
        String outDocEn = "F://Tes.docx"; //lokasi file
        XWPFDocument document = new XWPFDocument();
        try (FileOutputStream out = new FileOutputStream(new File(outDocEn))) {
            XWPFParagraph paragraph = document.createParagraph();
            XWPFRun run = paragraph.createRun();
            run.setText(teks);
            document.write(out);
        }
        System.out.println("Generate DOC sukses");
    }
    
}
