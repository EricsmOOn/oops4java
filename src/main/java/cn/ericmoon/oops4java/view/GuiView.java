package cn.ericmoon.oops4java.view;

import cn.ericmoon.oops4java.pojo.Stus;

import javax.swing.*;

/**
 * @ProjectName: oops4java
 * @CoderName: Eric Wong
 * @Date: 2018/12/6
 * @Desc: GUI图形交互界面
 */
public class GuiView extends JFrame {

    private Stus stus;
    private static final String TITLE = "成绩分析程序";
    private static final int FRAME_WIDTH = 1024;
    private static final int FRAME_HEIGHT = 800;
    private static final int FRAME_LOCALX = 300;
    private static final int FRAME_LOCALY = 300;

    public void LaunchFrame() {
        configureFrame();
    }

    public void configureFrame() {
        this.setTitle(TITLE);
        this.setVisible(true);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setLocation(FRAME_LOCALX, FRAME_LOCALY);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }


}
