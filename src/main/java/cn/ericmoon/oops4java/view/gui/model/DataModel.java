package cn.ericmoon.oops4java.view.gui.model;

import cn.ericmoon.oops4java.pojo.Student;
import cn.ericmoon.oops4java.view.gui.source.GuiSource;

import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 * @ProjectName: oops4java
 * @CoderName: Eric Wong
 * @Date: 2018/12/11
 * @Desc:
 */
public class DataModel extends AbstractTableModel {

    @Override
    public int getRowCount() {
        int size = GuiSource.getStus().getStus().size();
        return size;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        List<Student> stus = GuiSource.getStus().getStus();
        Student student = stus.get(rowIndex);
        if (columnIndex == 0)
            return student.getId();
        else if (columnIndex == 1)
            return student.getName();
        else
            return student.getScore();
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0)
            return "学号";
        else if (column == 1)
            return "姓名";
        else
            return "成绩";
    }
}
