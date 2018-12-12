package cn.ericmoon.oops4java.view.gui;

import cn.ericmoon.oops4java.view.gui.event.MenuEvent;
import cn.ericmoon.oops4java.view.gui.event.SearchEvent;

import javax.swing.*;
import java.awt.*;

/**
 * @ProjectName: oops4java
 * @CoderName: Eric Wong
 * @Date: 2018/12/6
 * @Desc: 菜单栏及状态栏
 */
public class MyMenuBar extends JMenuBar {
    private JLabel statusBar = new JLabel();

    public MyMenuBar(JFrame frame) {
        JMenuItem openTxt = new JMenuItem("打开文本文件成绩单");
        openTxt.addMouseListener(new MenuEvent(this, frame, 1));
        JMenuItem saveTxt = new JMenuItem("另存为文本文件成绩单");
        saveTxt.addMouseListener(new MenuEvent(this, frame, 2));
        JMenuItem openBin = new JMenuItem("打开对象文件成绩单");
        openBin.addMouseListener(new MenuEvent(this, frame, 3));
        JMenuItem saveBin = new JMenuItem("另存为对象文件成绩单");
        saveBin.addMouseListener(new MenuEvent(this, frame, 4));
        JMenuItem clean = new JMenuItem("清除数据");
        clean.addMouseListener(new MenuEvent(this, frame, 5));
        JTextField textField = new JTextField("search...", 10);
        textField.addKeyListener(new SearchEvent(textField));

        JMenu jMenu = new JMenu("文件");
        JMenu jSearch = new JMenu("搜索");

        jMenu.add(openTxt);
        jMenu.add(saveTxt);
        jMenu.addSeparator();
        jMenu.add(openBin);
        jMenu.add(saveBin);
        jMenu.addSeparator();
        jMenu.add(clean);

        jSearch.add(textField);
        jSearch.addSeparator();

        this.add(jMenu);
        this.add(jSearch);

        //状态栏
        statusBar.setText(" 成功创建窗口!");
        statusBar.setBorder(BorderFactory.createRaisedBevelBorder());
        frame.add(statusBar, BorderLayout.SOUTH);

        frame.add(this, BorderLayout.NORTH);
    }


    public JLabel getStatusBar() {
        return statusBar;
    }

    public void setStatusBar(JLabel statusBar) {
        this.statusBar = statusBar;
    }
}
