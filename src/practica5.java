import java.util.ArrayList;
import java.util.Scanner;

public class practica5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn= new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		Estudiante estudiantes = new Estudiante();
		
		
			System.out.println("Introduce nombre para estudiante");
			estudiantes.setNombre(sc.nextLine());
			System.out.println("Introduce apellido para estudiante");
			estudiantes.setApellido(sc.nextLine());
			System.out.println("Introduce fecha nacimiento para estudiante");
			estudiantes.setFechaNac(sc.nextLine());
			System.out.println("Introduce dni para estudiante");
			estudiantes.setDni(sc.nextLine());
			System.out.println("Introduce estudios previos para estudiante");
			estudiantes.setEstudiosPrevios(sc.nextLine());
			System.out.println("introduzca telefono");
			estudiantes.setTelefono(sc.nextLine());
	}

}
