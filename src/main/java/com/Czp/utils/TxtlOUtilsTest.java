package com.Czp.utils;

import org.junit.Test;

public class TxtlOUtilsTest {

    @Test
    public void readTxtTest() {
        // 路径存在，正常读取
        String str = TxtlOUtils.readTxt("D:\\软工2\\cx1\\orig.txt");
        String[] strings = str.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    public void writeTxtTest() {
        // 路径存在，正常写入
        double[] elem = {0.11, 0.22, 0.33, 0.44, 0.55};
        for (int i = 0; i < elem.length; i++) {
            TxtlOUtils.writeTxt(elem[i], "D:\\软工2\\cx1\\ans.txt");
        }
    }

    @Test
    public void readTxtFailTest() {
        // 路径不存在，读取失败
        String str = TxtlOUtils.readTxt("D:\\软工2\\cx1\\none.txt");
    }

    @Test
    public void writeTxtFailTest() {
        // 路径错误，写入失败
        double[] elem = {0.11, 0.22, 0.33, 0.44, 0.55};
        for (int i = 0; i < elem.length; i++) {
            TxtlOUtils.writeTxt(elem[i], "C:\\Users\\ans.txt");
        }
    }

}

