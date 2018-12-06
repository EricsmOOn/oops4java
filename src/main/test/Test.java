import cn.ericmoon.oops4java.controllers.AnalyseController;
import cn.ericmoon.oops4java.controllers.FileController;
import cn.ericmoon.oops4java.controllers.SearchController;
import cn.ericmoon.oops4java.pojo.AnalyResult;
import cn.ericmoon.oops4java.pojo.Student;
import cn.ericmoon.oops4java.pojo.Stus;

import java.util.List;

/**
 * @ProjectName: oops4java
 * @CoderName: Eric Wong
 * @Date: 2018/12/4
 * @Desc: 测试类
 */
public class Test {
    private static final String SOURCE_PRE = "src/main/resources/";//数据库资源前缀
    private static final String TXT_SUF = ".txt";//txt后缀
    private static final String SCORE_SUF = ".score";//score后缀

    public static void main(String[] str) throws Exception {

//        StringBuilder info = DataBaseUtils.getDataFromTxt(SOURCE_PRE, "1" + TXT_SUF);
//        DataBaseUtils.insertDataToTxt(SOURCE_PRE,"199"+TXT_SUF,info.toString());

        FileController fc = new FileController();
        Stus stus = fc.getFromTxt(SOURCE_PRE, "2017网工二班-Java" + TXT_SUF);
//        String s = StringUtils.StusToString(stus);
//        System.out.println(stus.getClassName()+":::"+stus.getCourseName());

//        AnalyseController ac = new AnalyseController();
//        Stus sortStus = ac.sortStus(stus);
//        System.out.println(sortStus.getStus().toString());
//        System.out.println(stus.getStus().toString());

        AnalyseController ac = new AnalyseController();
        AnalyResult ar = ac.analyse(stus);
        System.out.println(ar);

        SearchController sc = new SearchController();
        List<Student> list = sc.search("一", stus);
        for (Student s : list) {
            System.out.println(s.toString());
        }

    }
}
