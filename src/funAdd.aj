import java.awt.Color;

public aspect funAdd {
	
	
	pointcut funciojn(Color c) : execution (void changeColor(Color)) && args(c);
    after(Color c) returning : funciojn(c) {
			System.out.println("Nuevo color de fondo: " + c.toString());
		}
	
	
}
