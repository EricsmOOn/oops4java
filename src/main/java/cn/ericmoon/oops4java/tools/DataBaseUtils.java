package cn.ericmoon.oops4java.tools;

import cn.ericmoon.oops4java.pojo.Student;

import java.io.*;
import java.util.List;

/**
 * @ProjectName: oops4java
 * @CoderName: Eric Wong
 * @Date: 2018/12/4
 * @Desc: 数据库中间层
 */
public class DataBaseUtils {

    /**
     * @return java.lang.StringBuilder
     * @Description 读取文件到StringBuilder
     * @parameters [name]
     */
    public static StringBuilder getDataFromTxt(String path) throws Exception {
        if (!new File(path).exists()) {
            throw new Exception("不存在" + path + "此文件");
        }
        StringBuilder sb = new StringBuilder();
        String s;
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((s = br.readLine()) != null) {
                //System.lineSeparator() --> 获取系统的回车符
                sb.append(System.lineSeparator()).append(s);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb;
    }

    /**
     * @return java.lang.StringBuilder
     * @Description 储存文件从String
     * @parameters [name]
     */
    public static void insertDataToTxt(String path, String info) {
        File file = new File(path);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(info);
            bw.flush();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @Description
     * 储存对象
     * @parameters  [name, obj, oos]
     * @return  void
     */
    private static void saveObjs(String path, List<? extends Object> list) throws Exception {
        File file = new File(path);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(list);
        oos.flush();
        oos.close();
    }

    /**
     * @Description
     * 储存Stus
     * @parameters  [name, obj, oos]
     * @return  void
     */
    public static void saveStus(String path, List<Student> list) throws Exception {
        saveObjs(path, list);
    }


    /**
     * @Description
     * 读取对象们
     * @parameters  [name]
     * @return  void
     */
    private static List loadObjs(String path) throws Exception {
        File file = new File(path);
        if(!file.exists()){
            throw new Exception("不存在" + path + "此文件");
        }
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        List<Object> list = (List<Object>)ois.readObject();
        ois.close();
        return list;
    }

    /**
     * @Description
     * 读取Stus
     * @parameters  [name]
     * @return  void
     */
    public static List<Student> loadStus(String path) throws Exception {
        return (List<Student>) loadObjs(path);
    }
}
