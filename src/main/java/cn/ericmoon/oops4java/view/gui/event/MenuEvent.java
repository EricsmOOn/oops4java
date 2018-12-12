package cn.ericmoon.oops4java.view.gui.event;

import cn.ericmoon.oops4java.controllers.FileController;
import cn.ericmoon.oops4java.pojo.Stus;
import cn.ericmoon.oops4java.view.gui.MyMenuBar;
import cn.ericmoon.oops4java.view.gui.gexception.GuiException;
import cn.ericmoon.oops4java.view.gui.source.GuiSource;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @ProjectName: oops4java
 * @CoderName: Eric Wong
 * @Date: 2018/12/6
 * @Desc: 菜单事件监听器
 */
public class MenuEvent implements MouseListener {
    private MyMenuBar mb;
    private int type;
    private JFrame frame;
    private FileController fc = new FileController();

    public MenuEvent(JMenuBar mb, JFrame frame, int type) {
        this.mb = (MyMenuBar) mb;
        this.type = type;
        this.frame = frame;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        try {
            if (type == 5) {
                if (JOptionPane.showConfirmDialog
                        (frame, "您确认要清除数据吗?", "请确认操作", JOptionPane.YES_NO_CANCEL_OPTION)
                        == JOptionPane.YES_OPTION) {
                    GuiSource.setStus(new Stus());
                    mb.getStatusBar().setText(" 清除数据成功!");
                }
            } else {
                JFileChooser jfc = GuiSource.getJfc();
                int jfci;
                switch (type) {
                    case 1:
                        jfci = jfc.showOpenDialog(frame);
                        if (jfci == JFileChooser.APPROVE_OPTION) {
                            String fn = jfc.getSelectedFile().toString();
                            GuiSource.setStus(fc.getFromTxt(fn));
                            mb.getStatusBar().setText(" 载入 " + fn + "--共" + GuiSource.getStus().getStus().size() + "人"
                                    + " 成功!");
                        }
                        break;

                    case 2:
                        jfci = jfc.showSaveDialog(frame);
                        if (jfci == JFileChooser.APPROVE_OPTION) {
                            String fn = jfc.getSelectedFile().toString();
                            fn = fn.replace(".txt", "");
                            fn = fn + ".txt";
                            fc.saveToTxt(fn, GuiSource.getStus());
                            mb.getStatusBar().setText(" 存入 " + fn + "--共" + GuiSource.getStus().getStus().size() + "人" + " 成功!");
                        }
                        break;

                    case 3:
                        jfci = jfc.showOpenDialog(frame);
                        if (jfci == JFileChooser.APPROVE_OPTION) {
                            String fn = jfc.getSelectedFile().toString();
                            GuiSource.setStus(fc.getFromScore(fn));
                            mb.getStatusBar().setText(" 载入 " + fn + "--共" + GuiSource.getStus().getStus().size() + "人" + " 成功!");
                        }
                        break;

                    case 4:
                        jfci = jfc.showSaveDialog(frame);
                        if (jfci == JFileChooser.APPROVE_OPTION) {
                            String fn = jfc.getSelectedFile().toString();
                            fn = fn.replace(".score", "");
                            fn = fn + ".score";
                            fc.saveToScore(fn, GuiSource.getStus());
                            mb.getStatusBar().setText(" 存入 " + fn + "--共" + GuiSource.getStus().getStus().size() + "人" + " 成功!");
                        }
                        break;

                    default:
                        break;
                }
            }

        } catch (Exception eee) {
            new GuiException(frame, "操作失败,请检查读入文件类型是否合法或是否有数据可以输出!");
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
