package testFile;

import java.io.*;

public class testFile {
    public static void main(String[] args) throws IOException {
        File inFile = new File("C:/Users/deng_wenxin/Desktop/1.txt");
        File outFile = new File("C:/Users/deng_wenxin/Desktop/2.txt");
    
        //创建流文件读入与写出类
        FileInputStream inStream = new FileInputStream(inFile);
        FileOutputStream outStream = new FileOutputStream(outFile);

        //通过available方法取得流的最大字符数
        byte[] inOutb = new byte[inStream.available()];

        inStream.read(inOutb);  //读入流,保存在byte数组
        outStream.write(inOutb);  //写出流,保存在文件2.txt中

        inStream.close();
        outStream.close();
    }
}
