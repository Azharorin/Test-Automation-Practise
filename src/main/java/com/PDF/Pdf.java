package com.PDF;

import com.TestBase;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Pdf extends TestBase {
    public static void main(String[] args) throws DocumentException, IOException {
        Chromelaunch();
        openURL("https://demo.opencart.com/");
        pdfGenerate();

    }
    public static void pdfGenerate() throws IOException, DocumentException {
        //taking screen shot save as byte and generate pdf
        byte[] input =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        // Document import itext
        Document doc= new Document();
        //saving
        String output= System.getProperty("user.dir")+"//src//main//PDF//newpdf.pdf";
        FileOutputStream fs= new FileOutputStream(output);
        //
        PdfWriter writer = PdfWriter.getInstance(doc,fs);
        //open pdf for writting
        writer.open();
        doc.open();
        Image img= Image.getInstance(input);
        img.scaleToFit(PageSize.A4.getWidth()/2,PageSize.A4.getHeight()/2);
        doc.add(img);
        doc.add(new Paragraph(""));
        doc.close();
        ///when we







    }
}
