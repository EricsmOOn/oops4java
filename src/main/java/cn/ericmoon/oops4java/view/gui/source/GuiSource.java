package cn.ericmoon.oops4java.view.gui.source;

import cn.ericmoon.oops4java.controllers.AnalyseController;
import cn.ericmoon.oops4java.controllers.SearchController;
import cn.ericmoon.oops4java.pojo.Stus;

import javax.swing.*;

/**
 * @ProjectName: oops4java
 * @CoderName: Eric Wong
 * @Date: 2018/12/11
 * @Desc: Stus仓库
 */
public class GuiSource {
    private static Stus stus = new Stus();
    private static JFileChooser jfc = new JFileChooser();
    private static AnalyseController ac = new AnalyseController();
    private static SearchController sc = new SearchController();

    public static SearchController getSc() {
        return sc;
    }

    public static Stus getStus() {
        return stus;
    }

    public static void setStus(Stus stus) {
        GuiSource.stus = stus;
    }

    public static JFileChooser getJfc() {
        return jfc;
    }

    public static AnalyseController getAc() {
        return ac;
    }
}
