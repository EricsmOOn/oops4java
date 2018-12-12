package cn.ericmoon.oops4java.view.gui.gexception;

import javax.swing.*;
import java.awt.*;

/**
 * @ProjectName: oops4java
 * @CoderName: Eric Wong
 * @Date: 2018/12/7
 * @Desc: GUI异常弹窗
 */
public class GuiException {

    public GuiException(Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "运行遇到错误", JOptionPane.ERROR_MESSAGE);
    }

    public GuiException(Exception e, String title) {
        JOptionPane.showMessageDialog(null, e.getMessage(), title, JOptionPane.ERROR_MESSAGE);
    }

    public GuiException(Component c, Exception e) {
        JOptionPane.showMessageDialog(c, e.getMessage(), "运行遇到错误", JOptionPane.ERROR_MESSAGE);
    }

    public GuiException(String e) {
        JOptionPane.showMessageDialog(null, e, "运行遇到错误", JOptionPane.ERROR_MESSAGE);
    }

    public GuiException(Component c, String e) {
        JOptionPane.showMessageDialog(c, e, "运行遇到错误", JOptionPane.ERROR_MESSAGE);
    }
}
