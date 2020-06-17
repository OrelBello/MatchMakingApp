package Mod;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;


public class CSV_Handling {

public static void saveRecord(String a, String b, String c, int d, int e, int f, int g, String h, Boolean i,
		String j, double k, Boolean l, String m, String n, String o, String p, String q, String s,
		String t, int u, String v, String w, String x, String y, Boolean z, int a1, String b1, String c1, 
		String d1, String e1, Boolean f1, Boolean g1, Boolean h1, Boolean i1, Boolean j1, Boolean k1, String l1,
		String m1, String n1, String o1, String p1, String q1, String r1, String s1)
	

{
try {
	FileWriter fw = new FileWriter("test33.txt", true);
	BufferedWriter bw = new BufferedWriter(fw);
	PrintWriter pw = new PrintWriter(bw);
	
	pw.println(a+","+b+","+c+","+d+","+e+","+f+","+g+","+h+","+i+","+
			j+","+k+","+l+","+m+","+n+","+o+","+p+","+q+","+s+","+
			 t+","+u+","+w+","+x+","+y+","+z+","+a1+","+b1+","+c1+","+
			 d1+","+e1+","+f1+","+g1+","+h1+","+i1+","+j1+","+k1+","+l1+","+
			 m1+","+n1+"," +o1+","+p1+","+q1+","+r1);
	pw.flush();
	pw.close();
	JOptionPane.showMessageDialog(null, "Recoed saved");
}
	catch(Exception e11) {
		
	}
	
}

	}
