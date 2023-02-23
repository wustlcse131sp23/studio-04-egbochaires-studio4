package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	//	Scanner in = new Scanner(f); //making Scanner with a File
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(0.5,  0.5, .3, 0.2);
		StdDraw.setPenColor(255, 255, 0);
		StdDraw.filledRectangle(.5, .5, .25, .15);
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.filledEllipse(.5, .5, .225, .1225);
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledEllipse(0.5,  0.5, .115, .15);
	}
}