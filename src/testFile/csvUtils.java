package testFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class csvUtils {
    /**
     * 导出
     * 
     * @param file csv文件(路径+文件)
     */
    public void OutCSV(File file, List<String> dataList) {
        FileOutputStream out = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            out = new FileOutputStream(file);
            osw = new OutputStreamWriter(out);
            bw = new BufferedWriter(osw);
            bw.append("排名").append(",").append("绰号").append(",").append("姓名").append("\n");
            if (dataList != null && !dataList.isEmpty()) {
                for (String data : dataList) {
                    bw.append(data).append("\n");
                }
            }
            System.out.println("outSuccsess");
        } catch (Exception e) {
            System.out.println("error");
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                    bw = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (osw != null) {
                try {
                    osw.close();
                    osw = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                    out = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 导入
     * 
     * @param file csv文件(路径+文件)
     */
    public List<String> inCSV(File file) {
        List<String> dataList = new ArrayList<String>();
        BufferedReader br = null;
        
        try {
            br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                dataList.add(line);
            }
        } catch (Exception e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        } finally{
            if (br != null) {
                try {
                    br.close();
                    br = null;
                } catch (IOException e) {
                    // TODO 自動生成された catch ブロック
                    e.printStackTrace();
                }
            }
        }
        
        
        return dataList;
    }

}
