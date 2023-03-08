package proyecto1;

import java.util.Scanner;

public class OpcionesProyecto1 {

    static int[] cedula = new int[10];
    static String[] nombre = new String[10];
    static float[] promedio = new float[10];
    static String[] condicion = new String[10];
    static int indice = 0;
    public static Scanner leer = new Scanner(System.in);

    public OpcionesProyecto1() {
    }

    public static void Inicializar() {
        for (int i = 0; i < nombre.length; i++) {
            cedula[i] = 0;
            nombre[i] = "";
            promedio[i] = 0;
            condicion[i] = "";
        }
        System.out.println("Datos inicializados en cero");
    }

    public static void IncluirEstudiante() {
        char seguir = 'n';
        Scanner leer = new Scanner(System.in);
        do {
            if (indice > 9) {
                System.out.println("La cantidad de estudiantes alcanzo el limite");
                seguir = 'n';
            } else {
                System.out.println("Digite la cedula del estudiante");
                cedula[indice] = leer.nextInt();
                System.out.println("Digite el nombre del estudiante");
                nombre[indice] = leer.next();
                System.out.println("Digite el promedio del estudiante");
                promedio[indice] = leer.nextFloat();
                if (promedio[indice] >= 70) {
                    System.out.println(condicion[indice] = "Aprobado");
                } else if (promedio[indice] < 70 && promedio[indice] >= 60) {
                    System.out.println(condicion[indice] = "Aplazado");
                } else if (promedio[indice] < 60) {
                    System.out.println(condicion[indice] = "Reprobado");
                }
                indice++;
                System.out.println("Requiere ingresar otro estudiante?");
                seguir = leer.next().toLowerCase().charAt(0);
            }
        } while (seguir != 'n');
    }

    public static void ConsultarEstudiante() {
        System.out.println("Ingrese la cedula del estudiante");
        int ced = leer.nextInt();
        boolean existe = false;

        for (int i = 0; i < cedula.length; i++) {
            if (ced == (cedula[i])) {
                System.out.println("Estudiante: " + nombre[i] + "\nCedula: " + cedula[i] + "\nPromedio: " + promedio[i] + "\nCondicion: " + condicion[i]);
                existe = true;
                break;
            }
        }
        if (existe == false) {
            System.out.println("El estudiante no esta registrado");
        }
    }

    public static void ModificarEstudiante() {
        System.out.println("Ingrese la cedula del estudiante");
        int ced = leer.nextInt();
        boolean existe = false;

        for (int i = 0; i < cedula.length; i++) {
            if (ced == (cedula[i])) {
                System.out.println("Digite el nuevo nombre del estudiante");
                nombre[i] = leer.next();
                System.out.println("Digite la nueva cedula del estudiante");
                cedula[i] = leer.nextInt();
                System.out.println("Digite el nuevo promedio del estudiante");
                promedio[i] = leer.nextFloat();
                if (promedio[i] >= 70) {
                    System.out.println(condicion[i] = "Aprobado");
                } else if (promedio[i] < 70 && promedio[i] >= 60) {
                    System.out.println(condicion[i] = "Aplazado");
                } else if (promedio[i] < 60) {
                    System.out.println(condicion[i] = "Reprobado");
                }
                System.out.println("Estudiante modificado");
                existe = true;
                break;
            }
        }
        if (existe == false) {
            System.out.println("El estudiante no esta registrado");
        }
    }

    public static void EliminarEstudiante() {
        System.out.println("Ingrese la cedula del estudiante");
        int ced = leer.nextInt();
        boolean existe = false;

        for (int i = 0; i < cedula.length; i++) {
            if (ced == (cedula[i])) {
                cedula[i] = 0;
                nombre[i] = "";
                promedio[i] = 0;
                condicion[i] = "";
                System.out.println("Estudiante eliminado");
                existe = true;
                break;
            }
        }
        if (existe == false) {
            System.out.println("El estudiante no esta registrado");
        }
    }

    public static void SubmenuReportes() {
        System.out.println("1- Reporte de estudiantes por condicion\n2- Reporte de todos los datos\n3- Regresar al menu principal");
        int subreport;
        subreport = leer.nextInt();
        switch (subreport) {
            case 1:
                System.out.println("Que opcion desea corroborar?\n1- Aprobados\n2- Reprobados\n3- Aplazados");
                int submen;
                submen = leer.nextInt();
                for (int i = 0; i < indice; i++) {
                    switch (submen) {
                        case 1:
                            if (promedio[i] >= 70) {
                                System.out.println("Cedula: " + cedula[i] + " Estudiante: " + nombre[i] + " Promedio: " + promedio[i] + " Condicion: " + condicion[i]);
                            }
                            break;
                        case 2:
                            if (promedio[i] < 60) {
                                System.out.println("Cedula: " + cedula[i] + " Estudiante: " + nombre[i] + " Promedio: " + promedio[i] + " Condicion: " + condicion[i]);
                            }
                            break;
                        case 3:
                            if (promedio[i] >= 60 && promedio[i] < 70) {
                                System.out.println("Cedula: " + cedula[i] + " Estudiante: " + nombre[i] + " Promedio: " + promedio[i] + " Condicion: " + condicion[i]);
                            }
                            break;
                    }
                }
                break;
            case 2:
                for (int i = 0; i < indice; i++) {
                    System.out.println("Cedula: " + cedula[i] + " Estudiante: " + nombre[i] + " Promedio: " + promedio[i] + " Condicion: " + condicion[i]);
                }
        }
    }
}
