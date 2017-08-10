package day3;

import javax.swing.JOptionPane;

public class quiz {


public static void main(String[] args) {
	int wrong = 0;
int right = 0;

String q1 = JOptionPane.showInputDialog("how many sides of the force are their");
	
	

if(q1.equals("3")){
	right++;
}
else{
	wrong++;
}
String q2 = JOptionPane.showInputDialog("what is the most hated StarWars character");
if(q2.equals("jar jar binks")){
	right++;
}
else{
	wrong++;
}
String q3 = JOptionPane.showInputDialog("what is the mostr hated StarWars trilogy");
if(q3.equals("the prequle")){
	right++;
}
else{
	wrong++;
}
String q4 = JOptionPane.showInputDialog("how do lightsabers work");
if (q4.equals("jedi cristals")){
	right++;
}
else{
	wrong++;
}

JOptionPane.showMessageDialog(null," you got "+ wrong + " wrong");
JOptionPane.showMessageDialog(null, "you got "+ right + " right");
JOptionPane.showMessageDialog(null, "DONT BULLY ME ON MY SPELLING");

















}






























}
