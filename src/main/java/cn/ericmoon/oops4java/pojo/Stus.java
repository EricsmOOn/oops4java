package cn.ericmoon.oops4java.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: oops4java
 * @CoderName: Eric Wong
 * @Date: 2018/12/5
 * @Desc: 封装全局变量　
 */
public class Stus {

    private List<Student> stus;
    private String path;
    private int num;
    private String className;
    private String courseName;

    public Stus() {
        List<Student> list = new ArrayList<>();
        list.add(new Student());
        this.stus = list;
        this.path = "";
        this.num = stus.size();
        this.className = "";
        this.courseName = "";
    }


    public Stus(List<Student> stus, String path, String className, String courseName) {
        this.stus = stus;
        this.path = path;
        this.num = stus.size();
        this.className = className;
        this.courseName = courseName;
    }

    public List<Student> getStus() {
        return stus;
    }

    public void setStus(List<Student> stus) {
        this.stus = stus;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getNum() {
        return num;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


}
