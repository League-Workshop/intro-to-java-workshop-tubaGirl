package day3;

import javax.swing.JOptionPane;

public class quiz2 {
public static void main(String[] args) {
	
	int wrong = 0;
int right = 0;

String q1 = JOptionPane.showInputDialog("are the euphonium and the baritone the same");
	
	

if(q1.equals("no")){
	right++;
}
else{
	wrong++;
}
String q2 = JOptionPane.showInputDialog("what is a f atachment on a tuba");
if(q2.equals("a forth valve")){
	right++;
}
else{
	wrong++;
}
String q3 = JOptionPane.showInputDialog("is the ");
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