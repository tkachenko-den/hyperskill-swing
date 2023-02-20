package org.example;

import javax.swing.*;
import java.awt.*;

public class HelloFrame extends JFrame {

    public HelloFrame() throws HeadlessException {
        super("Hello World Application");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);

    }
}
