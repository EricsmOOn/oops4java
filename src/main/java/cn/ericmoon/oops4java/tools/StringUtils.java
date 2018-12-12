package cn.ericmoon.oops4java.tools;

import cn.ericmoon.oops4java.pojo.Student;
import cn.ericmoon.oops4java.pojo.Stus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: oops4java
 * @CoderName: Eric Wong
 * @Date: 2018/12/4
 * @Desc: 字符串处理工具
 */
public class StringUtils {

    /**
     * @Description
     * 字符串注入Students POJO
     * @parameters  [info]
     * @return  java.util.List<cn.ericmoon.oops4java.pojo.Student>
     */
    public static List<Student> toStus(String info) {
        List<Student> stus = new ArrayList<>();
        info = info.replace(" ","");
        info = info.replace(","," ");
        String[] strings = info.split("\\s+");
        for (int i = 0; i < strings.length / 3; i++) {
            Student stu = new Student();
            stu.setId(strings[1 + i * 3]);
            stu.setName(strings[2 + i * 3]);
            stu.setScore(Integer.parseInt(strings[3 + i * 3]));
            stus.add(stu);
        }
        return stus;
    }

    /**
     * @return java.lang.String
     * @Description POJO 返回字符串
     * @parameters [stus]
     */
    public static String StusToString(Stus stus){
        List<Student> students = stus.getStus();
        StringBuilder sb = new StringBuilder();
        for(Student s:students){
            sb.append(s.toString());
        }
        return sb.toString();
    }

    /**
     * @Description
     * 解析文件名
     * @parameters [fullName]
     * @return java.util.Map<java.lang.String , java.lang.String>
     */
    public static Map<String, String> getNameInfo(String fullName) {
        fullName = fullName.substring(fullName.lastIndexOf("/") + 1);
        fullName = fullName.replace("-", ".");
        String[] strings = fullName.split("\\.");
        Map map = new HashMap();
        map.put("className", strings[0]);
        map.put("courseName", strings[1]);
        return map;
    }

}
