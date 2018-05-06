
package mainPackage;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;


import javax.swing.*;

import classPackage.classAdminFrame;

import classPackage.classModeFrame;

public class ModeFrame extends classModeFrame {

public ModeFrame() {

new classModeFrame();

gotoAdminFrame(button[0]);

gotoClientFrame(button[1]);
}

public void gotoAdminFrame (JButton button){

button.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

dispose();

AdminFrame AF = new AdminFrame();

AF.setAnswer1();

AF.setVisible(true);
	
AF.setSize(445, 310);

AF.setLocationRelativeTo(null);
}
});
}

public void gotoClientFrame (JButton button){

button.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {	

dispose();

ClientFrame CF = new ClientFrame();

CF.setVisible(true);

CF.setSize(425, 380);

CF.setLocationRelativeTo(null);
}
});
}

public static void main(String[] args) {

EventQueue.invokeLater(new Runnable() {

public void run() {

try {

ModeFrame frame = new ModeFrame();

frame.setVisible(true);

frame.setSize(400, 310);

frame.setLocationRelativeTo(null);

} catch (Exception e) {

e.printStackTrace();
}
}
});
}
}
