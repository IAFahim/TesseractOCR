import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageFilter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Tesseract tesseract=new Tesseract();
        tesseract.setDatapath("C:\\Users\\Fahim\\IdeaProjects\\TensorflowPlay\\src\\main\\resources");

        BufferedImage bufferedImage=ImageIO.read(new File("C:\\Users\\Fahim\\IdeaProjects\\TensorflowPlay\\src\\main\\resources\\Screenshot 2021-08-04 at 19-28-48 Tesseract OCR - Gradle Example.png"));
        ImageFilter imageFilter=new ImageFilter();


        String str = null;
        try {
            str = tesseract.doOCR(bufferedImage);
        } catch (TesseractException e) {
            e.printStackTrace();
        }
        System.out.println(str);
    }
}