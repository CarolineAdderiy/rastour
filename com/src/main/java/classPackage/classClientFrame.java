package classPackage;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.*;

import mainPackage.Calculator;

public class classClientFrame extends JFrame {

Calculator calc = new Calculator();

protected JButton[] btn = new JButton [3];

protected JLabel[] lbl = new JLabel[5];
	
protected JTextField[] txtfield = new JTextField[3];
	
protected JCheckBox[] chckbx = new JCheckBox[2];

protected JRadioButton[] rdbtn = new JRadioButton[3];
	
protected String[] text = {"Отправить заявку", "Выйти из режима", "Получить стоимость тура", "Количество суток - ",
"Количество людей - ", "Выберите тип перевозки: ", "Выберите тип организации питания: ", "Стоимость тура - ",
"Авиаперелет", "Круиз",
"Завтрак, обед и ужин", "Завтрак и обед", "Только завтрак"};
	
protected Integer[] coordxy = {0, 195, 0, 0, 0, 0, 0, 0, 130, 130, 110, 160, 160, 230, 230, 230,
220, 220, 255, 0, 40, 80, 135, 290, 0, 40, 290, 80, 105, 135, 160, 186};

protected Integer[] scale = {190, 190, 385, 160, 170, 165, 235, 110, 110, 65, 160, 120, 120,
30};

public void setButton(int i, JPanel panel) {
	
btn[i] = new JButton();

btn[i].setText(text[i]);
	
btn[i].setBounds(coordxy[i], coordxy[i + 16], scale[i], scale[13]);

btn[i].setFont(new Font("Segoe UI Light", Font.PLAIN, 13));

panel.add(btn[i]);
}

public void setLabel(int i, JPanel panel) {	

lbl[i] = new JLabel();
	
lbl[i].setText(text[i + 3]);
	
lbl[i].setBounds(coordxy[i + 3], coordxy[i + 19], scale[i + 3], scale[13]);

lbl[i].setFont(new Font("Segoe UI Light", Font.PLAIN, 14));

panel.add(lbl[i]);
}

public void setTextField(int i, JPanel panel) {

txtfield[i] = new JTextField();

txtfield[i].setBounds(coordxy[i + 8], coordxy[i + 24], 50, 30);
	
txtfield[i].setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
	
panel.add(txtfield[i]);
}

public void setCheckBox(int i, JPanel panel) {

chckbx[i] = new JCheckBox();

chckbx[i].setText(text[i + 8]);
	
chckbx[i].setBounds(coordxy[i + 11], coordxy[i + 27], scale[i + 8], scale[13]);
	
chckbx[i].setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
	
panel.add(chckbx[i]);
}

public void setRadioButton(int i, JPanel panel) {

rdbtn[i] = new JRadioButton();

rdbtn[i].setText(text[i + 10]);

rdbtn[i].setBounds(coordxy[i + 13], coordxy[i + 29], scale[i + 10], scale[13]);
	
rdbtn[i].setFont(new Font("Segoe UI Light", Font.PLAIN, 14));

panel.add(rdbtn[i]);
}

public JPanel setPanel (JPanel panel, int x, int y, int width, int height) {

panel.setBounds(x, y, width, height);
	
panel.setLayout(null);

return panel;
}

public void selectRadioBtn(final JRadioButton radio1, final JRadioButton radio2, final JRadioButton radio3) {

radio1.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

if (radio1.isSelected()) {

radio2.setSelected(false);

radio3.setSelected(false);
}
}
});

radio2.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

if (radio2.isSelected()) {

radio1.setSelected(false);

radio3.setSelected(false);
}
}
});

radio3.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

if (radio3.isSelected()) {

radio2.setSelected(false);

radio1.setSelected(false);
}
}
});
}

public void sendForm(JButton button, final JTextField textField, final JTextField textField1, final JCheckBox checkBox, final JCheckBox checkBox1,
final JRadioButton radioBtn, final JRadioButton radioBtn1, final JRadioButton radioBtn2) {

button.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

if (!textField.getText().equals("0") && !textField1.getText().equals("0")) {

if (!textField.getText().equals(null) && !textField1.getText().isEmpty()
&& !textField.getText().equals(null) && !textField1.getText().isEmpty()) {

if (checkBox.isSelected() && checkBox1.isSelected() && radioBtn.isSelected()
&& textField.getText().matches("^\\d*$") && textField1.getText().matches("^\\d*$")) {

getValue(textField, textField1, 1.56, 1.5);
}

else if (checkBox.isSelected() && checkBox1.isSelected() && radioBtn1.isSelected()
&& textField.getText().matches("^\\d*$") && textField1.getText().matches("^\\d*$")) {

getValue(textField, textField1, 1.56, 1.3);	
}

else if (checkBox.isSelected() && checkBox1.isSelected() && radioBtn2.isSelected()
&& textField.getText().matches("^\\d*$") && textField1.getText().matches("^\\d*$")) {

getValue(textField, textField1, 1.56, 1.1);
}

else if (checkBox.isSelected() && radioBtn.isSelected()
&& textField.getText().matches("^\\d*$") && textField1.getText().matches("^\\d*$")) {

getValue(textField, textField1, 1.2, 1.5);
}

else if (checkBox.isSelected() && radioBtn1.isSelected()
&& textField.getText().matches("^\\d*$") && textField1.getText().matches("^\\d*$")) {

getValue(textField, textField1, 1.2, 1.3);
}

else if (checkBox.isSelected() && radioBtn2.isSelected()
&& textField.getText().matches("^\\d*$") && textField1.getText().matches("^\\d*$")) {

getValue(textField, textField1, 1.2, 1.1);
}

else if (checkBox1.isSelected() && radioBtn.isSelected()
&& textField.getText().matches("^\\d*$") && textField1.getText().matches("^\\d*$")) {

getValue(textField, textField1, 1.3, 1.5);
}

else if (checkBox1.isSelected() && radioBtn1.isSelected()
&& textField.getText().matches("^\\d*$") && textField1.getText().matches("^\\d*$")) {

getValue(textField, textField1, 1.3, 1.2);
}

else if (checkBox1.isSelected() && radioBtn2.isSelected()
&& textField.getText().matches("^\\d*$") && textField1.getText().matches("^\\d*$")) {

getValue(textField, textField1, 1.3, 1.1);
}

else {

JOptionPane.showOptionDialog(null, "Заполните правильно заявку!","Ошибка", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, new Object[]{}, null);
}	
}

else {

JOptionPane.showOptionDialog(null, "Заполните правильно заявку!","Ошибка", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, new Object[]{}, null);
}
}

else {

JOptionPane.showOptionDialog(null, "Заявка пуста!","Ошибка", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, new Object[]{}, null);
}
}
});
}

public void getValue(JTextField textField, JTextField textField1, double setcontransp, double setconfood) {

calc.setconstantatransport(setcontransp);

calc.setconstantafood(setconfood);

calc.setcountnight(textField);

calc.setcountpeople(textField1);

JOptionPane.showOptionDialog(null, "Заявка отправлена!","Информация о заявке", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, new Object[]{}, null);
}

public void getTourCost(JButton button, final JTextField textField) {

button.addActionListener(new ActionListener () {

public void actionPerformed(ActionEvent e) {

if (Calculator.getTourcost() != null) {

textField.setText(Double.toString((Math.rint(100 *Double.parseDouble(Calculator.getTourcost())) / 100)));
}

else {

JOptionPane.showOptionDialog(null, "Заявка не обработана либо вы еще не отправили заявку","Информация о туре", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, new Object[]{}, null);
}

Calculator.setcountnight(0);
}
});
}	

public classClientFrame() {

JPanel panel = new JPanel();

getContentPane().setLayout(null);

setPanel(panel, 10, 11, 415, 320);

getContentPane().add(panel);

for (int i = 0; i < 5; i++) {
	
if (i < 2) {

setButton(i, panel);

setLabel(i, panel);

setTextField(i, panel);

setCheckBox(i, panel);

setRadioButton(i, panel);
}

else if (i == 2) {

setButton(i, panel);
	
setLabel(i, panel);

setTextField(i, panel);

setRadioButton(i, panel);
}
	
else if (i > 2) {

setLabel(i, panel);
}
}
}
}