
public class Estudiante {
	public String nombre;
	private String apellido;
	private String fechaNac;
	private String dni;
	private String estudiosPrevios;
	private String telefono;

	public Estudiante(String nombre, String apellido, String fechaNac, String dni, String estudiosPrevios,
			String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.dni = dni;
		this.estudiosPrevios = estudiosPrevios;
		this.telefono = telefono;
	}

	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEstudiosPrevios() {
		return estudiosPrevios;
	}

	public void setEstudiosPrevios(String estudiosPrevios) {
		this.estudiosPrevios = estudiosPrevios;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac + ", dni=" + dni
				+ ", estudiosPrevios=" + estudiosPrevios + ", telefono=" + telefono + "]";
	}

}
