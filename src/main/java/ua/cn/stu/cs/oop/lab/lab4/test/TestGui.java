package ua.cn.stu.cs.oop.lab.lab4.test;

import ua.cn.stu.cs.oop.lab.lab4.view.MainGui;

import javax.swing.*;
import java.awt.*;

public class TestGui {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    MainGui window = new MainGui();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
