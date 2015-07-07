package testBinary;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

public class BinaryCodeUtil {

    public void Encoder(String contents) {
        Hashtable<EncodeHintType, String> hints = new Hashtable<EncodeHintType, String>();

        hints.put(EncodeHintType.CHARACTER_SET, "GBK");
        BitMatrix matrix = null;
        System.out.println(contents);
      
            try {
                matrix = new MultiFormatWriter().encode(contents, BarcodeFormat.QR_CODE, 300, 300, hints);
            } catch (WriterException e1) {
                // TODO 自動生成された catch ブロック
                e1.printStackTrace();
            }
        

        File file = new File("C:/Users/deng_wenxin/Desktop/encode.png");

        try {
            MatrixToImageWriter.writeToFile(matrix, "png", file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
