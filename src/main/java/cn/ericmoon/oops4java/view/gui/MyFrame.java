package cn.ericmoon.oops4java.view.gui;

import javax.swing.*;

/**
 * @ProjectName: oops4java
 * @CoderName: Eric Wong
 * @Date: 2018/12/6
 * @Desc: 窗口组件
 */
public class MyFrame extends JFrame {

    public MyFrame() {
        this.setTitle(CONSTANT.TITLE);
        this.setSize(CONSTANT.FRAME_WIDTH, CONSTANT.FRAME_HEIGHT);
        this.setLocationRelativeTo(null);//居中显示
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }

}
