
package mainPackage;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.*;

import classPackage.*;

public class AdminFrame extends classAdminFrame {

public AdminFrame() {

classAdminFrame cAF = new classAdminFrame();

cAF.sendTourCost(button[0], label[2], answer2, textField[2], textField[3], textField[0], textField[1]);

gotoBack(button[1]);
}

public void gotoBack(JButton button) {

button.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

dispose();

ModeFrame MD = new ModeFrame();

MD.setVisible(true);

MD.setSize(400, 310);

MD.setLocationRelativeTo(null);
}
});
}
}

