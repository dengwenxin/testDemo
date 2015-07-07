package testFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteCSV {
    public static void main(String[] args) { 
            File csv = new File("C:/Users/deng_wenxin/Desktop/writers.csv"); // CSV文件 
            
            PrintWriter writer;
            try {
                writer = new PrintWriter(csv);
                writer.println("s" + "," + "a");
                writer.println("ss" + "," + "aa");
                writer.close();
            } catch (FileNotFoundException e) {
                // TODO 自動生成された catch ブロック
                e.printStackTrace();
            }
    } 
}