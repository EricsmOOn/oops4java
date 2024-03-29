package cn.ericmoon.oops4java.view;

import cn.ericmoon.oops4java.controllers.CliController;
import cn.ericmoon.oops4java.controllers.FileController;
import cn.ericmoon.oops4java.pojo.Student;
import cn.ericmoon.oops4java.view.gui.source.GuiSource;

import java.util.List;
import java.util.Scanner;

/**
 * @ProjectName: oops4java
 * @CoderName: Eric Wong
 * @Date: 2018/12/6
 * @Desc: 命令行操作交互界面
 */
public class CliView {

    public void CliStart(Scanner scn) {
        boolean finish = false;
        String s1 = "";
        String s2 = "";
        CliController cc = new CliController();
        FileController fc = new FileController();

        try {
            while (!finish) {
                System.out.println("" +
                        "1.读取文本文件\n" +
                        "2.另存为二进制对象文件\n" +
                        "3.读取二进制对象文件\n" +
                        "4.显示全部成绩\n" +
                        "5.查询学生成绩\n" +
                        "0.退出\n" +
                        "-----------------------------------\n" +
                        "请选择：");
                int i = scn.nextInt();

                switch (i) {
                    case 1:
                        System.out.println("输入文件路径");
                        s1 = scn.next();
                        System.out.println("输入文件名称(不包括后缀名)");
                        s2 = scn.next();
                        GuiSource.setStus(cc.readTxt(s1 + s2 + ".txt", fc));
                        System.out.println("读取 \"" + s1 + s2 + ".txt\" " + "成功!");
                        break;

                    case 2:
                        System.out.println("输入文件路径");
                        s1 = scn.next();
                        System.out.println("输入文件名称(不包括后缀名)");
                        s2 = scn.next();
                        if (GuiSource.getStus() == null) throw new Exception("请先读取对象!");
                        String s = cc.saveToBin(s1 + s2 + ".score", GuiSource.getStus(), fc);
                        System.out.println("文件已存入 --> " + s);
                        break;

                    case 3:
                        System.out.println("输入文件路径");
                        s1 = scn.next();
                        System.out.println("输入文件名称(不包括后缀名)");
                        s2 = scn.next();
                        GuiSource.setStus(cc.readBin(s1 + s2 + ".score", fc));
                        System.out.println("读取 \"" + s1 + s2 + ".score\" " + "成功!");
                        break;

                    case 4:
                        cc.showScore(GuiSource.getStus());
                        break;

                    case 5:
                        System.out.println("输入搜索关键词");
                        s1 = scn.next();
                        List<Student> list = cc.searchStus(s1, GuiSource.getStus());
                        if (list == null || list.isEmpty()) {
                            System.out.println("没有符合条件的用户!");
                        } else {
                            for (Student student : list) {
                                System.out.println(student.toString());
                            }
                        }
                        break;

                    case 0:
                        System.out.println("感谢您的使用!");
                        return;

                    default:
                        System.out.println("请输入有效的字符!");
                }

                System.out.println("输入任意值继续...");
                scn.next();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
