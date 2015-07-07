package testFile;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import testFile.csvUtils;

public class testCSV {
 
    public static void main(String[] args) {
        // 构造数据
        List<String> dataList = new ArrayList<String>();
        dataList.add("1,及时雨,宋江");
        
        csvUtils csvIn = new csvUtils();
        List<String> csvList = new ArrayList<String>();
        csvList = csvIn.inCSV(new File("C:/Users/deng_wenxin/Desktop/csvIn.csv"));
        
        if (csvList != null && !csvList.isEmpty()) {
            for (String data : csvList) {
                String[] names = data.split(";");
                System.out.println("读取成功");
                System.out.println(data);
                System.out.println("NickName: " + names[1] + " Name: " + names[2]);
            }
        }
        csvUtils csvOut = new csvUtils();
        csvOut.OutCSV(new File("C:/Users/deng_wenxin/Desktop/csvOut.csv"), csvList);
        
        
    }

}

