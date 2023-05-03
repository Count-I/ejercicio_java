import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    int nEstudiantes = solicitarPositivo("Ingrese la cantidad de estudiantes a registrar");
    ArrayList<Estudiante> estudiantes = new ArrayList<>();
    float promedioEdades=0;

    for(int i=0;i<nEstudiantes;i++){
        estudiantes.add(new Estudiante(solicitarData("Ingrese el nombre"), solicitarPositivo("Ingrese la edad")));
        promedioEdades  += (float) estudiantes.get(i).getEdad();
    }

    estudiantes.forEach(e->{
        System.out.println(e.getNombre()+" "+e.getEdad());
    });

    System.out.println("El promedio de las edades es: "+(promedioEdades/estudiantes.size()));
    }

    public static Estudiante encontrarEstudiantesPorEdad(int edad, ArrayList<Estudiante> estudiantes) {
        return estudiantes
                .stream()
                .filter( t -> t.getEdad()==edad).findFirst().get();
    }

    public static String solicitarData(String message){
        return JOptionPane.showInputDialog(message);
    }
    public static int solicitarPositivo(String message){
        int data;
        do{
            data = Integer.parseInt(solicitarData(message));
                    if(data<=0){
                        JOptionPane.showConfirmDialog(null, "ingese un dato valido");
                    }
        }
        while(data<=0);
        return data;
    }

}