package cn.ericmoon.oops4java.view.gui;

import cn.ericmoon.oops4java.pojo.AnalyResult;
import cn.ericmoon.oops4java.view.gui.source.GuiSource;

import javax.swing.*;
import java.awt.*;

/**
 * @ProjectName: oops4java
 * @CoderName: Eric Wong
 * @Date: 2018/12/12
 * @Desc: 数据分析显示栏
 */
public class MyPanel extends JPanel {
    JTextField maxf;
    JTextField minf;
    JTextField avaf;

    JTextField l0f;
    JTextField l1f;
    JTextField l2f;
    JTextField l3f;
    JTextField l4f;

    JTextField l0fb;
    JTextField l1fb;
    JTextField l2fb;
    JTextField l3fb;
    JTextField l4fb;

    JLabel max;
    JLabel min;
    JLabel ava;

    JLabel l0;
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;

    JLabel rrr0;
    JLabel rrr1;
    JLabel rrr2;
    JLabel rrr3;
    JLabel rrr4;
    JLabel bbb0;
    JLabel bbb1;
    JLabel bbb2;
    JLabel bbb3;
    JLabel bbb4;


    public MyPanel(JFrame frame) {
        this.setBorder(BorderFactory.createTitledBorder("数据分析"));

        JPanel panelup = new JPanel();
        JPanel paneldown = new JPanel();
        JPanel paneldownleft = new JPanel();
        JPanel paneldownright = new JPanel();
        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(2, 1));
        panelup.setLayout(new GridLayout(3, 2));
        paneldown.setLayout(new GridLayout(1, 2));
        paneldownleft.setLayout(new GridLayout(5, 2));
        paneldownright.setLayout(new GridLayout(5, 3));

        max = new JLabel("最高分");
        min = new JLabel("最低分");
        ava = new JLabel("平均分");

        l0 = new JLabel("优秀 90-100 ");
        l1 = new JLabel("良好 80-89 ");
        l2 = new JLabel("中等 70-79 ");
        l3 = new JLabel("及格 60-69 ");
        l4 = new JLabel("不及格 0-60 ");

        rrr0 = new JLabel("  人,占");
        rrr1 = new JLabel("  人,占");
        rrr2 = new JLabel("  人,占");
        rrr3 = new JLabel("  人,占");
        rrr4 = new JLabel("  人,占");
        bbb0 = new JLabel("  %");
        bbb1 = new JLabel("  %");
        bbb2 = new JLabel("  %");
        bbb3 = new JLabel("  %");
        bbb4 = new JLabel("  %");

        maxf = new JTextField();
        minf = new JTextField();
        avaf = new JTextField();

        l0f = new JTextField();
        l1f = new JTextField();
        l2f = new JTextField();
        l3f = new JTextField();
        l4f = new JTextField();

        l0fb = new JTextField();
        l1fb = new JTextField();
        l2fb = new JTextField();
        l3fb = new JTextField();
        l4fb = new JTextField();

        panelup.add(max);
        panelup.add(maxf);
        panelup.add(min);
        panelup.add(minf);
        panelup.add(ava);
        panelup.add(avaf);

        paneldownleft.add(l0);
        paneldownleft.add(l0f);
        paneldownleft.add(l1);
        paneldownleft.add(l1f);
        paneldownleft.add(l2);
        paneldownleft.add(l2f);
        paneldownleft.add(l3);
        paneldownleft.add(l3f);
        paneldownleft.add(l4);
        paneldownleft.add(l4f);

        paneldownright.add(rrr0);
        paneldownright.add(l0fb);
        paneldownright.add(bbb0);
        paneldownright.add(rrr1);
        paneldownright.add(l1fb);
        paneldownright.add(bbb1);
        paneldownright.add(rrr2);
        paneldownright.add(l2fb);
        paneldownright.add(bbb2);
        paneldownright.add(rrr3);
        paneldownright.add(l3fb);
        paneldownright.add(bbb3);
        paneldownright.add(rrr4);
        paneldownright.add(l4fb);
        paneldownright.add(bbb4);

        paneldown.add(paneldownleft);
        paneldown.add(paneldownright);

        panel.add(panelup);
        panel.add(paneldown);

        updateMp();

        frame.add(panel, BorderLayout.EAST);

    }

    public void updateMp() {
        AnalyResult result = GuiSource.getAc().analyse(GuiSource.getStus());
        maxf.setText(String.format("%.2f", result.getMaxScore()));
        minf.setText(String.format("%.2f", result.getMinScore()));
        avaf.setText(String.format("%.2f", result.getAvaScore()));

        l0f.setText(String.format("%d", result.getL().get(0)));
        l1f.setText(String.format("%d", result.getL().get(1)));
        l2f.setText(String.format("%d", result.getL().get(2)));
        l3f.setText(String.format("%d", result.getL().get(3)));
        l4f.setText(String.format("%d", result.getL().get(4)));

        l0fb.setText(String.format("%.2f", result.getLb().get(0)));
        l1fb.setText(String.format("%.2f", result.getLb().get(1)));
        l2fb.setText(String.format("%.2f", result.getLb().get(2)));
        l3fb.setText(String.format("%.2f", result.getLb().get(3)));
        l4fb.setText(String.format("%.2f", result.getLb().get(4)));

    }
}
