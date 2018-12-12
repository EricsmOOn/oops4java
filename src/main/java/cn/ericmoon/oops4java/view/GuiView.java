package cn.ericmoon.oops4java.view;

import cn.ericmoon.oops4java.view.gui.MyFrame;
import cn.ericmoon.oops4java.view.gui.MyMenuBar;
import cn.ericmoon.oops4java.view.gui.MyPanel;
import cn.ericmoon.oops4java.view.gui.MyTable;

import javax.swing.*;

/**
 * @ProjectName: oops4java
 * @CoderName: Eric Wong
 * @Date: 2018/12/6
 * @Desc: GUI图形交互界面
 */
public class GuiView {

    MyMenuBar menuBar;
    MyTable table;
    MyPanel panel;

    public void guiStart() {
        //新建窗口
        JFrame frame = new MyFrame();

        //注入组件
        menuBar = new MyMenuBar(frame);
        table = new MyTable(frame);
        panel = new MyPanel(frame);

        //显示窗口
        frame.setVisible(true);

        while (true) {
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            table.updateUI();
            panel.updateMp();
        }
    }

}
