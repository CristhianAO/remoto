import java.util.Scanner;

public class practica5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn= new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String nombre="";
		String apellido="";
		String fechaNac="";
		String dni="";
		String estudios="";
		String tlf="";
		
		
			System.out.println("Introduce nombre para estudiante");
			nombre=sc.nextLine();
			System.out.println("Introduce apellido para estudiante");
			apellido=sc.nextLine();
			System.out.println("Introduce fecha nacimiento para estudiante");
			fechaNac=sc.nextLine();
			System.out.println("Introduce dni para estudiante");
			dni=sc.nextLine();
			System.out.println("Introduce estudios previos para estudiante");
			estudios=sc.nextLine();
			System.out.println("introduzca telefono");
			tlf=sc.nextLine();
	}

}
