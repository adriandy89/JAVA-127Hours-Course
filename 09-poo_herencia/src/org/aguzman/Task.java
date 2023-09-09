package org.aguzman;

// Clase Persona (superclase)
class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}

// Clase Empleado (subclase de Persona)
class Empleado extends Persona {
    private double sueldo;

    public Empleado(String nombre, int edad, double sueldo) {
        super(nombre, edad);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void aumentarSueldo(double aumento) {
        sueldo += aumento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sueldo: " + sueldo;
    }
}

// Clase Gerente (subclase de Empleado)
class Gerente extends Empleado {
    private double presupuesto;

    public Gerente(String nombre, int edad, double sueldo, double presupuesto) {
        super(nombre, edad, sueldo);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() + ", Presupuesto: " + presupuesto;
    }
}

// Clase Cliente (subclase de Persona)
class Cliente extends Persona {
    public Cliente(String nombre, int edad) {
        super(nombre, edad);
    }
}

// Clase Main para ejemplo
public class Task {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("John Doe", 35, 5000.0, 100000.0);
        System.out.println(gerente.toString());
    }
}