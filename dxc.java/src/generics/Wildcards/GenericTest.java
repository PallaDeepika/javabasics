package generics.Wildcards;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
	
	public static void drawShape(List<? extends Shape> shapesList ) {
	    for(Shape shape : shapesList) {
			shape.drawShape();
		}
	}
	
	
	public static void main(String[] args) {
		List<Rectangle> rectList = new ArrayList<>();
		rectList.add(new Rectangle());
		
		List<Circle> cirList= new ArrayList<>();
		cirList.add(new Circle());
		cirList.add(new Circle());
		
		drawShape(rectList);
		drawShape(cirList);
	}

}
