
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author albertosml
 */
public class Combina {
    public String combinar(ArrayList<String> s, String salida) {
        List<InputStream> list = new ArrayList<>();
        try {
            // Source pdfs
            for(String f : s) list.add(new FileInputStream(new File(f)));

            // Resulting pdf
            OutputStream out = new FileOutputStream(new File(salida));

            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, out);
            document.open();
            PdfContentByte cb = writer.getDirectContent();

            for (InputStream in : list) {
                PdfReader reader = new PdfReader(in);
                for (int i = 1; i <= reader.getNumberOfPages(); i++) {
                    document.newPage();
                    //import the page from source pdf
                    PdfImportedPage page = writer.getImportedPage(reader, i);
                    //add the page to the destination pdf
                    cb.addTemplate(page, 0, 0);
                }
            }

            out.flush();
            document.close();
            out.close();

            return "";
        } catch (DocumentException | IOException e) {
            System.out.println(e.getMessage());
            return "error";
        }
    }
}
