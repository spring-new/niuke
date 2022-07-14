package util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReplace {


    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\Wcs\\Desktop\\str.txt");// 要读的文件路径

        InputStreamReader isr = new InputStreamReader(fis);// 字符流

        BufferedReader br = new BufferedReader(isr); // 缓冲

        String line = null;
        String sql = "";
        while ((line = br.readLine()) != null) {// 字符不等于空
            sql += line;
        }
        br.close();// 关闭文件
        sql = sql.replace("\"", "");
        sql = sql.replace("+", "");
        System.out.println(sql);
    }
}

