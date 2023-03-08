package proyecto1;

import java.util.Scanner;

public class MenuProyecto1 {
    public byte opcion;
    public Scanner leer = new Scanner(System.in);
    
    public MenuProyecto1(){
        opcion = 10;
    }
    public void Mostrar(){    
        do {
            System.out.println("1- Inicializar");
            System.out.println("2- Incluir Estudiante");
            System.out.println("3- Consultar Estudiante");
            System.out.println("4- Modificar Estudiante");
            System.out.println("5- Eliminar Estudiante");
            System.out.println("6- Submenu de Reportes");
            System.out.println("7- Salir");
            System.out.println("Digite una opcion");
            opcion = leer.nextByte();
            
            switch (opcion) {
                case 1: OpcionesProyecto1.Inicializar();
                break;
                case 2: OpcionesProyecto1.IncluirEstudiante();
                break;
                case 3: OpcionesProyecto1.ConsultarEstudiante();
                break;
                case 4: OpcionesProyecto1.ModificarEstudiante();
                break;
                case 5: OpcionesProyecto1.EliminarEstudiante();
                break;
                case 6: OpcionesProyecto1.SubmenuReportes();
                break;
            }
            
        }while (opcion!=7);
    }
}