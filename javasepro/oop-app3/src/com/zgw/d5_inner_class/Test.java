package com.zgw.d5_inner_class;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Test {
    public static void main(String[] args) {
        // 匿名内部类在开发中的使用场景
        JFrame win = new JFrame("登陆界面");
        JPanel panel = new JPanel();
        win.add(panel);
        JButton btn = new JButton("登录");
        panel.add(btn);

        btn.addActionListener(e -> JOptionPane.showMessageDialog(win, "登陆一下"));

        win.setSize(400, 400);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        win.setVisible(true);
    }
}
