package com.Czp.utils;
import org.junit.Test;


public class SimHashUtilsTest {

    @Test
    public void getHashTest(){
        String[] strings = {"杰伦", "是", "一位", "优秀", "的", "歌手"};
        for (String string : strings) {
            String stringHash = SimHashUtils.getHash(string);
            System.out.println(stringHash.length());
            System.out.println(stringHash);
        }
    }

    @Test
    public void getSimHashTest(){
        String str0 = TxtlOUtils.readTxt("D:\\软工2\\cx1\\orig.txt");
        String str1 = TxtlOUtils.readTxt("D:\\软工2\\cx1\\orig_0.8_add.txt");
        System.out.println(SimHashUtils.getSimHash(str0));
        System.out.println(SimHashUtils.getSimHash(str1));
    }

}