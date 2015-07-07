package testZip;   

import testZip.ZipUtils;
    /** 
     *  
     * @version 1.0 
     * @since 1.0 
     */  
    public class testZip {  
        /** 
         *   
         */  
        public static void main(String[] args) throws Exception {  
            // 压缩文件  
            ZipUtils.compress("C:\\Users\\deng_wenxin\\Desktop\\what.txt");  
            System.out.println("success");
            // 压缩目录  
//            ZipUtils.compress("d:\\fd");  
        }  
    }  