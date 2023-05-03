import java.util.ArrayList;

public class Ejercicio {
	
	ArrayList<Estudiante> estudiantes = new ArrayList<>();
	public Ejercicio() {
		
	}
	
	public void agregarEstudiante(String nombre, int edad) {
		Estudiante newEstudiante = new Estudiante(nombre,edad);
		estudiantes.add(newEstudiante);
		
	}
	public void imprimirEstudiantes(ArrayList<Estudiante> estudiantes) {
		for( Estudiante e: estudiantes){
			System.out.println(e.getNombre()+", "+e.getEdad());
		}
	}
	
	public void imprimirPromedioEdades(ArrayList<Estudiante> estudiantes) {
		float promedio=0;
		for(Estudiante e:estudiantes) {
			promedio+=e.getEdad();
			System.out.println(e.getEdad());
		}
		
		System.out.println(promedio/estudiantes.size());
	}
	
	public Estudiante encontrarEstudiantesPorEdad(int edad) {
		return estudiantes
				.stream()
				.filter( t -> t.getEdad()==edad).findFirst().get();
	}
	
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}
}
