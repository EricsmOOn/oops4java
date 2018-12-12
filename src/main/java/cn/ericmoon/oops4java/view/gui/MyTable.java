package cn.ericmoon.oops4java.view.gui;

import cn.ericmoon.oops4java.controllers.AnalyseController;
import cn.ericmoon.oops4java.view.gui.model.DataModel;
import cn.ericmoon.oops4java.view.gui.source.GuiSource;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @ProjectName: oops4java
 * @CoderName: Eric Wong
 * @Date: 2018/12/7
 * @Desc: 数据显示栏
 */
public class MyTable extends JTable {

    public MyTable(JFrame frame) {
        this.setBorder(BorderFactory.createTitledBorder("成绩单"));
        JTable table = new JTable(new DataModel());
        JTableHeader header = table.getTableHeader();
        header.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                AnalyseController ac = GuiSource.getAc();
                int pick = header.columnAtPoint(e.getPoint());
                switch (pick) {
                    case 0:
                        ac.sortById(GuiSource.getStus());
                        break;
                    case 1:
                        ac.sortById(GuiSource.getStus());
                        break;
                    case 2:
                        ac.sortByScore(GuiSource.getStus());
                        break;
                    default:
                        break;
                }
            }
        });
        frame.add(new JScrollPane(table), BorderLayout.WEST);
    }
}
