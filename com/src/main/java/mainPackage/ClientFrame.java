
package mainPackage;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.*;

import classPackage.classClientFrame;

public class ClientFrame extends classClientFrame {

public ClientFrame() {

classClientFrame cCF = new classClientFrame();

cCF.selectRadioBtn(rdbtn[0], rdbtn[1], rdbtn[2]);

cCF.sendForm(btn[0], txtfield[0], txtfield[1], chckbx[0], chckbx[1], rdbtn[0], rdbtn[1], rdbtn[2]);

cCF.getTourCost(btn[2], txtfield[2]);

gotoBack(btn[1]);
}

public void gotoBack(JButton button) {

button.addActionListener(new ActionListener () {

public void actionPerformed(ActionEvent e) {

dispose();

ModeFrame MD = new ModeFrame();

MD.setVisible(true);

MD.setSize(400, 310);

MD.setLocationRelativeTo(null);

Calculator.setTourcost(0);
}
});	
}
}

