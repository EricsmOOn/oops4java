import cn.ericmoon.oops4java.controllers.FileController;
import cn.ericmoon.oops4java.pojo.Stus;
import cn.ericmoon.oops4java.tools.StringUtils;

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
        Stus stus = fc.getFromTxt(SOURCE_PRE, "1" + TXT_SUF);
        String s = StringUtils.StusToString(stus);
    }
}
