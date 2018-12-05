package cn.ericmoon.oops4java.pojo;

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

    public Stus() {
    }

    public Stus(List<Student> stus, String path) {
        this.stus = stus;
        this.path = path;
        this.num = stus.size();
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
}
