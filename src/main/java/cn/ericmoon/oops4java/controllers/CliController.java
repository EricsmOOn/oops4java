package cn.ericmoon.oops4java.controllers;

import cn.ericmoon.oops4java.pojo.AnalyResult;
import cn.ericmoon.oops4java.pojo.Student;
import cn.ericmoon.oops4java.pojo.Stus;

import java.util.List;

/**
 * @ProjectName: oops4java
 * @CoderName: Eric Wong
 * @Date: 2018/12/6
 * @Desc: 命令行控制器
 */
public class CliController {

    public Stus readTxt(String path, String fullName, FileController fc) throws Exception {
        return fc.getFromTxt(path, fullName);
    }

    public String saveToBin(String path, String fullName, Stus stus, FileController fc) throws Exception {
        fc.saveToScore(path, fullName, stus);
        return path + fullName;
    }

    public Stus readBin(String path, String fullName, FileController fc) throws Exception {
        return fc.getFromScore(path, fullName);
    }

    public void showScore(Stus stus) {
        if (stus == null) {
            System.out.println("请先加载文件...");
        } else {
            System.out.println("班级名称:" + stus.getClassName());
            System.out.println("课程名称:" + stus.getCourseName());
            System.out.println("\n     学号    姓名,成绩");
            System.out.println("-------------------------------------------");
            for (Student s : stus.getStus()) {
                System.out.print(s.toString());
            }
            System.out.println("-------------------------------------------");

            AnalyseController ac = new AnalyseController();
            AnalyResult result = ac.analyse(stus);

            System.out.println("最高分:" + result.getMaxScore());
            System.out.println("最低分:" + result.getMinScore());
            System.out.println(String.format("平均分:%.2f", result.getAvaScore()));
        }
    }

    public List<Student> searchStus(String keywords, Stus stus) {
        SearchController sc = new SearchController();
        return sc.search(keywords, stus);
    }
}
