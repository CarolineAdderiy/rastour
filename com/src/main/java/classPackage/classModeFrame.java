package classPackage;
import java.awt.*;
import javax.swing.*;
public class classModeFrame extends JFrame {
protected JButton[] button = new JButton[2];
protected String[] textBtn = {"Турагент", "Турист"};
protected Integer[] btncoordxy = {80, 80, 60, 120};
protected Integer[] btnscale = {200, 200, 30, 30};
public JPanel setPanel (JPanel panel, int x, int y, int width, int height) {	
panel.setLayout(null);
panel.setBounds(x, y, width, height);
return panel;
}
protected void setJButton(JPanel panel, int i) {
button[i] = new JButton();	
button[i].setText(textBtn[i]);	
button[i].setBounds(btncoordxy[i], btncoordxy[i + 2], btnscale[i], btnscale[i + 2]);		
button[i].setFont(new Font("Segoe UI Light", Font.PLAIN, 14));		
panel.add(button[i]);
}
public classModeFrame() {
JPanel panel = new JPanel();
getContentPane().setLayout(null);
setPanel(panel, 10, 11, 415, 240);	
getContentPane().add(panel);			
for (int i = 0; i < 2; i++) {	
setJButton(panel, i);
}
}	
}