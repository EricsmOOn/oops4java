package cn.ericmoon.oops4java.controllers;

import cn.ericmoon.oops4java.pojo.Student;
import cn.ericmoon.oops4java.pojo.Stus;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: oops4java
 * @CoderName: Eric Wong
 * @Date: 2018/12/6
 * @Desc: 搜索控制器
 */
public class SearchController {

    /**
     * @return java.util.List<cn.ericmoon.oops4java.pojo.Student>
     * @Description 通过关键词搜索相应的学生
     * @parameters [keywords, stus]
     */
    public List<Student> search(String keywords, Stus stus) {
        List<Student> list = new ArrayList<>();
        for (Student s : stus.getStus()) {
            if (s.getId().contains(keywords) || s.getName().contains(keywords)) {
                list.add(s);
            }
        }
        return list;
    }
}
