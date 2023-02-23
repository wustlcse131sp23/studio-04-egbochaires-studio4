package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();
		
		System.out.println(shapeType);
	/*	int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		boolean filled = in.nextBoolean();
		double x = in.nextDouble();
		double y= in.nextDouble();
		double halfWidth = in.nextDouble();
		double halfHeight = in.nextDouble();
		*/
		while(shapeType == "rectangle") {
			int r = in.nextInt();
			int g = in.nextInt();
			int b = in.nextInt();
			boolean filled = in.nextBoolean();
			double x = in.nextDouble();
			double y= in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			if(filled == true ) {
				StdDraw.setPenColor(r,g,b);

				StdDraw.filledRectangle(x, y, halfWidth, halfHeight); 

			}else {
		StdDraw.setPenColor(r,g,b);
		StdDraw.rectangle(x, y, halfWidth, halfHeight); 
			}}
		while(shapeType == "triangle") {
			int r = in.nextInt();
			int g = in.nextInt();
			int b = in.nextInt();
			boolean filled = in.nextBoolean();
			double []x= new double [2];
			double []y= new double [2];
			for(int i = 0; i <=2; i++) {
				x[i]=in.nextDouble();
			}
			for(int j = 0; j<=2; j++) {
				y[j] = in.nextDouble();
			}
			if(filled == true ) {
				StdDraw.setPenColor(r,g,b);

				StdDraw.filledPolygon(x, y); 

			}else {
		StdDraw.setPenColor(r,g,b);
		StdDraw.polygon(x, y); 
			}}
		while(shapeType == "ellipse") {
			int r = in.nextInt();
			int g = in.nextInt();
			int b = in.nextInt();
			boolean filled = in.nextBoolean();
			double x = in.nextDouble();
			double y= in.nextDouble();
			double semiMajorAxos = in.nextDouble();
			double halfHeight = in.nextDouble();
			if(filled == true ) {
				StdDraw.setPenColor(r,g,b);

				StdDraw.filledRectangle(x, y, halfWidth, halfHeight); 

			}else {
		StdDraw.setPenColor(r,g,b);
		StdDraw.rectangle(x, y, halfWidth, halfHeight); 
			}}
		
		
		
	}
}
