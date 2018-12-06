package cn.ericmoon.oops4java.controllers;

import cn.ericmoon.oops4java.pojo.AnalyResult;
import cn.ericmoon.oops4java.pojo.Student;
import cn.ericmoon.oops4java.pojo.Stus;

import java.util.List;

/**
 * @ProjectName: oops4java
 * @CoderName: Eric Wong
 * @Date: 2018/12/6
 * @Desc: 数据分析控制器
 */
public class AnalyseController {

    /**
     * @return cn.ericmoon.oops4java.pojo.AnalyResult
     * @Description 分析学生们的成绩并按照分数排序
     * @parameters [stus]
     */
    public AnalyResult analyse(Stus stus) {
        List<Student> list = sortByScore(stus);
        stus.setStus(list);
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

    /**
     * @return java.util.List<cn.ericmoon.oops4java.pojo.Student>
     * @Description 根据学号排序
     * @parameters [stus]
     */
    public List<Student> sortByName(Stus stus) {
        List<Student> list = stus.getStus();
        list.sort((o1, o2) -> (int) (Double.parseDouble(o1.getId()) - Double.parseDouble(o2.getId()) + 1));
        return list;
    }

    /**
     * @return java.util.List<cn.ericmoon.oops4java.pojo.Student>
     * @Description 根据分数排序
     * @parameters [stus]
     */
    public List<Student> sortByScore(Stus stus) {
        List<Student> list = stus.getStus();
        list.sort((o1, o2) -> {
            if (o1.getScore() < o2.getScore()) return 1;
            if (o1.getScore() > o2.getScore()) return -1;
            if (o1.getScore() == o2.getScore()) {
                if (Long.parseLong(o1.getId()) < Long.parseLong(o2.getId())) return -1;
                else return 1;
            }
            return 0;
        });
        return list;
    }

}
