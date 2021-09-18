package com.Czp.main;
import com.Czp.utils.HammingUtils;
import com.Czp.utils.SimHashUtils;
import com.Czp.utils.TxtlOUtils;


public class MainPaperCheck {

        public static void main(String[] args) {
            // 从命令行输入的路径名读取对应的文件，将文件的内容转化为对应的字符串
            String str0 = TxtlOUtils.readTxt(args[0]);
            String str1 = TxtlOUtils.readTxt(args[1]);
            String resultFileName = args[2];
            // 由字符串得出对应的 simHash值
            String simHash0 = SimHashUtils.getSimHash(str0);
            String simHash1 = SimHashUtils.getSimHash(str1);
            // 由 simHash值求出相似度
            double similarity = HammingUtils.getSimilarity(simHash0, simHash1);
            // 把相似度写入最后的结果文件中
            TxtlOUtils.writeTxt(similarity, resultFileName);
            // 退出程序
            System.exit(0);
        }

    }

