import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot s = new Robot();
		String color = JOptionPane.showInputDialog("pick, a color red,green or blue");
		if (color.equals("red")) {
			s.setPenColor(Color.RED);
		}
		if (color.equals("green")) {
			s.setPenColor(Color.GREEN);
		}
		if (color.equals("blue")) {
			s.setPenColor(Color.BLUE);
		}
		String shape = JOptionPane.showInputDialog("pick, a shape square,triangle or circle");
		if (shape.equals("square")) {
			drawSquare(s);
		}

		if (shape.equals("triangle")) {
			drawTriangel(s);

			// drawSquare(s);
			// drawTriangel(s);
			// drawCircle(s);
		}
		if (shape.equals("circle")) {
			drawCircle(s);

		}
	}

	private static void drawCircle(Robot s) {
		// TODO Auto-generated method stub
		s.setSpeed(100);
		s.penDown();
		for (int m = 0; m < 360; m++) {
			s.move(1);
			s.turn(1);
		}
		s.penUp();
		s.move(200);
	}

	private static void drawTriangel(Robot s) {
		// TODO Auto-generated method stub
		s.setSpeed(100);
		s.penDown();
		s.turn(-50);
		s.move(229);
		s.turn(-100);
		s.move(200);
		s.turn(-125);
		s.move(279);
		s.penUp();
		s.move(100);

	}

	private static void drawSquare(Robot s) {
		s.setSpeed(100);
		s.penDown();
		s.move(100);
		s.turn(90);
		s.move(100);
		s.turn(90);
		s.move(100);
		s.turn(90);
		s.move(100);
		s.penUp();
		s.move(50);

	}

}
