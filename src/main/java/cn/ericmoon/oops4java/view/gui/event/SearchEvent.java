package cn.ericmoon.oops4java.view.gui.event;

import cn.ericmoon.oops4java.pojo.Student;
import cn.ericmoon.oops4java.view.gui.source.GuiSource;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

/**
 * @ProjectName: oops4java
 * @CoderName: Eric Wong
 * @Date: 2018/12/12
 * @Desc:
 */
public class SearchEvent implements KeyListener {
    private JTextField jTextField;
    private java.util.List<Student> old = new ArrayList<>();

    public SearchEvent(JTextField jTextField) {
        this.jTextField = jTextField;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == KeyEvent.VK_ENTER) {
            if (jTextField.getText().equals("")) {
                if (!old.isEmpty()) {
                    System.out.println("读取+" + old.toString());
                    GuiSource.getStus().setStus(old);
                }
            } else {
                if (GuiSource.getStus() != null) {
                    if (GuiSource.getStus().getStus().size() > old.size()) {
                        old.clear();
                        old.addAll(GuiSource.getStus().getStus());
                    }
                }
                if (!old.isEmpty()) {
                    System.out.println("存入+" + old.toString());
                    GuiSource.getStus().setStus(GuiSource.getSc().search(jTextField.getText(), GuiSource.getStus()));
                }
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
