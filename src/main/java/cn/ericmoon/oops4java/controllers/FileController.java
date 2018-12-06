package cn.ericmoon.oops4java.controllers;

import cn.ericmoon.oops4java.pojo.Student;
import cn.ericmoon.oops4java.pojo.Stus;
import cn.ericmoon.oops4java.tools.DataBaseUtils;
import cn.ericmoon.oops4java.tools.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: oops4java
 * @CoderName: Eric Wong
 * @Date: 2018/12/5
 * @Desc: 文件S/L控制器
 */
public class FileController {
    /**
     * @Description
     * 从txt读取成绩
     * @parameters  [path, fullName]
     * @return  cn.ericmoon.oops4java.pojo.Stus
     */
    public Stus getFromTxt(String path, String fullName) throws Exception {
        StringBuilder txt = DataBaseUtils.getDataFromTxt(path, fullName);
        List<Student> stus = StringUtils.toStus(txt.toString());
        Map<String, String> nameInfo = StringUtils.getNameInfo(fullName);
        return new Stus(stus, path + fullName, nameInfo.get("className"), nameInfo.get("courseName"));
    }

    /**
     * @Description
     * 将数据存入txt
     * @parameters  [path, fullName, stus]
     * @return  void
     */
    public void saveToTxt(String path,String fullName,Stus stus){
        String info = StringUtils.StusToString(stus);
        DataBaseUtils.insertDataToTxt(path,fullName,info);
    }

    /**
     * @Description
     * 从score读取成绩
     * @parameters  [path, fullName]
     * @return  cn.ericmoon.oops4java.pojo.Stus
     */
    public Stus getFromScore(String path,String fullName) throws Exception {
        List<Student> stus = DataBaseUtils.loadStus(path, fullName);
        Map<String, String> nameInfo = StringUtils.getNameInfo(fullName);
        return new Stus(stus, path + fullName, nameInfo.get("className"), nameInfo.get("courseName"));
    }

    /**
     * @Description
     * 将数据存入score
     * @parameters  [path, fullName, stus]
     * @return  void
     */
    public void saveToScore(String path,String fullName,Stus stus) throws Exception {
        DataBaseUtils.saveStus(path,fullName,stus.getStus());
    }


}
