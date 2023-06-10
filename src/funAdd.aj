import java.awt.Color;
import java.awt.event.ActionEvent;

public aspect funAdd {
	
	
	pointcut funciojn(Color c) : call(void changeColor(Color c)) && args(c);
    after(Color c) returning : funciojn(Color c) {
			System.out.println("Nuevo color de fondo: " + c.toString());
		}
	
	
}
