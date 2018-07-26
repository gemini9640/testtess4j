import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class Test {

    public static void testCode() {
        File imageFile = new File("test_data/eurotext.png");
        ITesseract tesseract = new Tesseract();
        try {
            String result = tesseract.doOCR(imageFile);
            System.out.println(result);
        } catch (TesseractException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        testCode();
    }
}