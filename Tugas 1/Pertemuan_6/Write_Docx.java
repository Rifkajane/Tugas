/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.Pertemuan_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author Rifka
 */
public class Write_Docx {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Properties prop = new Properties();
        prop.setProperty("log4j.rootLogger", "WARN");
        PropertyConfigurator.configure(prop);
        
        String teks = "Berusahalah dan bersyukur"
                    + "Dalam hidup terkadang ada hal yang di luar logika."
                    + "Ternyata ini adalah salah satu jalan Dia menunjukkan kuasanya."
                    + "Semangatlah, Berusahalah, Berdoalah, dan Bersyukurlah!"
                    + "Percayalah Proses tidak akan menghianati hasil"
                    + "Maka berproseslah dengan benar lillahitaala.";
        XWPFDocument documentDocx = new XWPFDocument();

        String outDocxString = "F://writeDocx.docx";
        FileOutputStream outDocx = new FileOutputStream(new File(outDocxString));

        XWPFParagraph paragraphDocx = documentDocx.createParagraph();
        XWPFRun runDocx = paragraphDocx.createRun();
        runDocx.setText(teks);

        documentDocx.write(outDocx);
        outDocx.close();
        runDocx.setText(teks);
        System.out.println("docx written succesfully");
    }
}