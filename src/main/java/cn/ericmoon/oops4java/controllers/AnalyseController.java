package cn.ericmoon.oops4java.controllers;

import cn.ericmoon.oops4java.pojo.AnalyResult;
import cn.ericmoon.oops4java.pojo.Student;
import cn.ericmoon.oops4java.pojo.Stus;

import java.util.ArrayList;
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
        List<Integer> l = new ArrayList<>();
        List<Double> lb = new ArrayList<>();

        int l0 = 0, l1 = 0, l2 = 0, l3 = 0, l4 = 0;

        List<Student> list = sortByScore(stus);
        stus.setStus(list);
        AnalyResult ar = new AnalyResult();
        ar.setAnalyStus(stus);

        if (list.isEmpty()) {
            ar.setMaxScore(0);
            ar.setMinScore(0);

            l.add(0, l0);
            lb.add(0, 0.0);
            l.add(1, l1);
            lb.add(1, 0.0);
            l.add(2, l2);
            lb.add(2, 0.0);
            l.add(3, l3);
            lb.add(3, 0.0);
            l.add(4, l4);
            lb.add(4, 0.0);
            ar.setAvaScore(0);
            ar.setL(l);
            ar.setLb(lb);

            return ar;
        }
        ar.setMaxScore(list.get(0).getScore());
        ar.setMinScore(list.get(list.size() - 1).getScore());
        double sum = 0;
        for (Student s : list) {

            if (s.getScore() >= 90 && s.getScore() <= 100) l0++;
            if (s.getScore() >= 80 && s.getScore() < 90) l1++;
            if (s.getScore() >= 70 && s.getScore() < 80) l2++;
            if (s.getScore() >= 60 && s.getScore() < 70) l3++;
            if (s.getScore() > 0 && s.getScore() < 60) l4++;

            sum += s.getScore();
        }
        l.add(0, l0);
        lb.add(0, 100 * (double) l0 / list.size());
        l.add(1, l1);
        lb.add(1, 100 * (double) l1 / list.size());
        l.add(2, l2);
        lb.add(2, 100 * (double) l2 / list.size());
        l.add(3, l3);
        lb.add(3, 100 * (double) l3 / list.size());
        l.add(4, l4);
        lb.add(4, 100 * (double) l4 / list.size());
        ar.setAvaScore(sum / list.size());
        ar.setL(l);
        ar.setLb(lb);
        return ar;
    }

    /**
     * @return java.util.List<cn.ericmoon.oops4java.pojo.Student>
     * @Description 根据学号排序
     * @parameters [stus]
     */
    public List<Student> sortById(Stus stus) {
        List<Student> list = stus.getStus();
        list.sort((o1, o2) -> (int) (Double.parseDouble(o1.getId()) - Double.parseDouble(o2.getId())));
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
