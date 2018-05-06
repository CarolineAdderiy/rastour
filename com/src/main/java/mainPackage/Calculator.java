
package mainPackage;

import javax.swing.*;

public class Calculator {

private static double countnight = 0;

private static double countpeople, constantatransport, constantafood, priceonetourist, pricetransport,  pricefood, procent;

private static String tourcost;

public static String SetToutCost(double countnight, double countpeople, double constantatransport, double constantafood, double priceonetourist, double pricetransport, double pricefood, double procent) {

String strtourcost = null;

double settourcost = 0;

settourcost = ((priceonetourist * countnight * countpeople) + (pricetransport * countpeople * constantatransport) + (pricefood * countpeople * countnight * constantafood)) * procent;

strtourcost = Double.toString(settourcost);

return strtourcost;
}

public static double getprocent() {
return procent;
}

public static void setprocent(JTextField textFieldProcent) {
procent = Double.parseDouble(textFieldProcent.getText()) / 100 + 1;
}

public static double getpricefood() {
return pricefood;
}

public static void setpricefood(JTextField textFieldFoodPrice) {
pricefood = Double.parseDouble(textFieldFoodPrice.getText());
}

public static  double getpricetransport() {
return pricetransport;
}

public static void setpricetransport(JTextField textFieldTransportPrice) {
pricetransport = Double.parseDouble(textFieldTransportPrice.getText());
}

public static  double getpriceonetourist() {
return priceonetourist;
}

public static void setpriceonetourist(JTextField textFieldTourPrice) {
priceonetourist = Double.parseDouble(textFieldTourPrice.getText());
}

public static double getcountpeople() {
return countpeople;
}

public void setcountpeople(JTextField textField1) {
countpeople = Double.parseDouble(textField1.getText());
}

public static double getcountnight() {
return countnight;
}

public void setcountnight(JTextField textField) {
countnight = Double.parseDouble(textField.getText());
}

public static void setcountnight(int i) {
countnight = i;
}

public static double getconstantatransport() {
return constantatransport;
}

public void setconstantatransport(double setcontransp) {
constantatransport = setcontransp;
}

public static double getconstantafood() {
return constantafood;
}

public void setconstantafood(double setconfood) {
constantafood = setconfood;
}

public static String getTourcost() {
return tourcost;
}

public static void setTourcost(int i) {

if (i == 1) {

tourcost = SetToutCost(getcountnight(), getcountpeople(), getconstantatransport(), getconstantafood(), getpriceonetourist(), getpricetransport(), getpricefood(), getprocent());
}

else if (i == 0) {

tourcost = null;
}
}
}