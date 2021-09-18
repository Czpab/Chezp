package com.Czp.main;

import com.Czp.utils.HammingUtils;
import com.Czp.utils.SimHashUtils;
import com.Czp.utils.TxtlOUtils;
import org.junit.Test;

    public class MainTest {

        @Test
        public void origAndAllTest(){
            String[] str = new String[6];
            str[0] = TxtlOUtils.readTxt("D:\\软工2\\cx1\\orig.txt");
            str[1] = TxtlOUtils.readTxt("D:\\软工2\\cx1\\orig_0.8_add.txt");
            str[2] = TxtlOUtils.readTxt("D:\\软工2\\cx1\\orig_0.8_del.txt");
            str[3] = TxtlOUtils.readTxt("D:\\软工2\\cx1\\orig_0.8_dis_1.txt");
            str[4] = TxtlOUtils.readTxt("D:\\软工2\\cx1\\orig_0.8_dis_10.txt");
            str[5] = TxtlOUtils.readTxt("D:\\软工2\\cx1\\orig_0.8_dis_15.txt");
            String ansFileName = "D:\\软工2\\cx1\\ansAll.txt";
            for(int i = 0; i <= 5; i++){
                double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str[0]), SimHashUtils.getSimHash(str[i]));
                TxtlOUtils.writeTxt(ans, ansFileName);
            }
        }

        @Test
        public void origAndOrigTest(){
            String str0 = TxtlOUtils.readTxt("D:\\软工2\\cx1\\orig.txt");
            String str1 = TxtlOUtils.readTxt("D:\\软工2\\cx1\\orig.txt");
            String ansFileName = "D:\\软工2\\cx1\\ansOrigAndOrigTest.txt";
            double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
            TxtlOUtils.writeTxt(ans, ansFileName);
        }

        @Test
        public void origAndAddTest(){
            String str0 = TxtlOUtils.readTxt("D:\\软工2\\cx1\\orig.txt");
            String str1 = TxtlOUtils.readTxt("D:\\软工2\\cx1\\orig_0.8_add.txt");
            String ansFileName = "D:\\软工2\\cx1\\ansOrigAndAddTest.txt";
            double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
            TxtlOUtils.writeTxt(ans, ansFileName);
        }

        @Test
        public void origAndDelTest(){
            String str0 = TxtlOUtils.readTxt("D:\\软工2\\cx1\\orig.txt");
            String str1 = TxtlOUtils.readTxt("D:\\软工2\\cx1\\orig_0.8_del.txt");
            String ansFileName = "D:\\软工2\\cx1\\ansOrigAndDelTest.txt";
            double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
            TxtlOUtils.writeTxt(ans, ansFileName);
        }

        @Test
        public void origAndDis1Test(){
            String str0 = TxtlOUtils.readTxt("D:\\软工2\\cx1\\orig.txt");
            String str1 = TxtlOUtils.readTxt("D:\\软工2\\cx1\\orig_0.8_dis_1.txt");
            String ansFileName = "D:\\软工2\\cx1\\ansOrigAndDis1Test.txt";
            double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
            TxtlOUtils.writeTxt(ans, ansFileName);
        }

        @Test
        public void origAndDis10Test(){
            String str0 = TxtlOUtils.readTxt("D:\\软工2\\cx1\\orig.txt");
            String str1 = TxtlOUtils.readTxt("D:\\软工2\\cx1\\orig_0.8_dis_10.txt");
            String ansFileName = "D:\\软工2\\cx1\\ansOrigAndDis10Test.txt";
            double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
            TxtlOUtils.writeTxt(ans, ansFileName);
        }

        @Test
        public void origAndDis15Test(){
            String str0 = TxtlOUtils.readTxt("D:\\软工2\\cx1\\orig.txt");
            String str1 = TxtlOUtils.readTxt("D:\\软工2\\cx1\\orig_0.8_dis_15.txt");
            String ansFileName = "D:\\软工2\\cx1\\ansOrigAndDis15Test.txt";
            double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
            TxtlOUtils.writeTxt(ans,ansFileName);
        }

    }

