package cn.ericmoon.oops4java.controllers;

import cn.ericmoon.oops4java.pojo.AnalyResult;
import cn.ericmoon.oops4java.pojo.Student;
import cn.ericmoon.oops4java.pojo.Stus;

import java.util.Collections;
import java.util.List;

/**
 * @ProjectName: oops4java
 * @CoderName: Eric Wong
 * @Date: 2018/12/6
 * @Desc: 数据分析控制器
 */
public class AnalyseController {

    /**
     * @return cn.ericmoon.oops4java.pojo.Stus
     * @Description 排序学生们
     * @parameters [stus]
     */
    private Stus sortStus(Stus stus) {
        Collections.sort(stus.getStus());
        return stus;
    }

    /**
     * @return cn.ericmoon.oops4java.pojo.AnalyResult
     * @Description 分析学生们的成绩
     * @parameters [stus]
     */
    public AnalyResult analyse(Stus stus) {
        Stus sortStus = sortStus(stus);
        List<Student> list = sortStus.getStus();
        AnalyResult ar = new AnalyResult();
        ar.setAnalyStus(stus);
        ar.setMaxScore(list.get(0).getScore());
        ar.setMinScore(list.get(list.size() - 1).getScore());
        double sum = 0;
        for (Student s : list) {
            sum += s.getScore();
        }
        ar.setAvaScore(sum / list.size());
        return ar;
    }

}
