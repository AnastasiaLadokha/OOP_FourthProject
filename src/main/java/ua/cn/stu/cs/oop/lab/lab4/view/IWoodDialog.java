package ua.cn.stu.cs.oop.lab.lab4.view;

import ua.cn.stu.cs.oop.lab.lab4.store.WoodDirectory;

public interface IWoodDialog {
    public void setVisible(boolean b);
    public Object getObject();
    public void setWoodDirectory(WoodDirectory wd);
}
