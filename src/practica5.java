import java.util.ArrayList;
import java.util.Scanner;

public class practica5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn= new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		ArrayList<String> datosUsuario = new ArrayList<String>();
		
		
			System.out.println("Introduce nombre para estudiante");
			datosUsuario.add(sc.nextLine());
			System.out.println("Introduce apellido para estudiante");
			datosUsuario.add(sc.nextLine());
			System.out.println("Introduce fecha nacimiento para estudiante");
			datosUsuario.add(sc.nextLine());
			System.out.println("Introduce dni para estudiante");
			datosUsuario.add(sc.nextLine());
			System.out.println("Introduce estudios previos para estudiante");
			datosUsuario.add(sc.nextLine());
			System.out.println("introduzca telefono");
			datosUsuario.add(sc.nextLine());
	}

}
