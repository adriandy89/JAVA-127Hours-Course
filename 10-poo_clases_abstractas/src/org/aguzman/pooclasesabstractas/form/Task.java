package org.aguzman.pooclasesabstractas.form;

abstract class Mamifero {
    protected String habitat;
    protected double altura;
    protected double largo;
    protected double peso;
    protected String nombreCientifico;

    @Override
    public String toString() {
        return "Mamifero{" +
                "habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }

    public Mamifero(String habitat, double altura, double largo, double peso, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    public abstract String comer();
    public abstract String dormir();
    public abstract String correr();
    public abstract String comunicarse();
}

abstract class Felino extends Mamifero {
    protected double tamanoGarras;
    protected int velocidad;

    public Felino(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }
}

abstract class Canino extends Mamifero {
    protected String color;
    protected double tamanoColmillos;

    public Canino(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }
}

class Leon extends Felino {
    private int numeroManada;
    private double potenciaRugido;

    public Leon(double altura, double largo, double peso, String habitat, int numeroManada, double potenciaRugido, double tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, "Panthera leo", tamanoGarras, velocidad);
        this.numeroManada = numeroManada;
        this.potenciaRugido = potenciaRugido;
    }

    @Override
    public String comer() {
        return "El León caza junto a su grupo de " + numeroManada + " individuos en las llanuras africanas.";
    }

    @Override
    public String dormir() {
        return "El León duerme en su guarida en el corazón de la sabana.";
    }

    @Override
    public String correr() {
        return "El León corre a toda velocidad en busca de su presa.";
    }

    @Override
    public String comunicarse() {
        return "El León emite un rugido poderoso para comunicarse con otros leones.";
    }
}

class Tigre extends Felino {
    private String especieTigre;

    public Tigre(double altura, double largo, double peso, String habitat, double tamanoGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, "Panthera tigris", tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return "El Tigre se agazapa en la selva y acecha a su presa silenciosamente.";
    }

    @Override
    public String dormir() {
        return "El Tigre descansa en una frondosa vegetación para recargar energías.";
    }

    @Override
    public String correr() {
        return "El Tigre corre velozmente a través de la jungla en busca de alimento.";
    }

    @Override
    public String comunicarse() {
        return "El Tigre emite un rugido profundo para marcar su territorio.";
    }
}

class Guepardo extends Felino {
    public Guepardo(double altura, double largo, double peso, String habitat, double tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, "Acinonyx jubatus", tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El Guepardo persigue a su presa a velocidades asombrosas en las llanuras abiertas.";
    }

    @Override
    public String dormir() {
        return "El Guepardo descansa a la sombra de un árbol alto después de una cacería exitosa.";
    }

    @Override
    public String correr() {
        return "El Guepardo corre a una velocidad increíble para atrapar a su presa.";
    }

    @Override
    public String comunicarse() {
        return "El Guepardo emite sonidos suaves para comunicarse con otros guepardos.";
    }
}

class Lobo extends Canino {
    private int numeroCamada;
    private String especieLobo;

    public Lobo(double altura, double largo, double peso, String habitat, String color, double tamanoColmillos, int numeroCamada, String especieLobo) {
        super(habitat, altura, largo, peso, "Canis lupus", color, tamanoColmillos);
        this.numeroCamada = numeroCamada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "El Lobo se alimenta de presas que caza en manada en los bosques y praderas.";
    }

    @Override
    public String dormir() {
        return "El Lobo descansa en una cueva protegida del frío y los depredadores.";
    }

    @Override
    public String correr() {
        return "El Lobo corre en manada persiguiendo a su presa a través de la naturaleza salvaje.";
    }

    @Override
    public String comunicarse() {
        return "El Lobo aúlla para comunicarse con otros lobos y marcar el territorio.";
    }
}

class PerroSalvajeAfricano extends Canino {
    private int fuerzaMordida;

    public PerroSalvajeAfricano(double altura, double largo, double peso, String habitat, String color, double tamanoColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, "Lycaon pictus", color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El Perro Salvaje Africano se alimenta de presas pequeñas en su hábitat natural.";
    }

    @Override
    public String dormir() {
        return "El Perro Salvaje Africano duerme en madrigueras excavadas en la tierra.";
    }

    @Override
    public String correr() {
        return "El Perro Salvaje Africano corre en manada para cazar y desplazarse por la sabana.";
    }

    @Override
    public String comunicarse() {
        return "El Perro Salvaje Africano emite vocalizaciones variadas para comunicarse con su grupo.";
    }
}

public class Task {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[7];

        Mamifero leon = new Leon(120d, 5, 7.5d, "Sabana", 58 , 120, 220, 190);
        Mamifero guepardo = new Guepardo(4.9d, 130d, 94d, "Savana", 10, 120);
        Mamifero tigre = new Tigre(100d, 4.5d, 150d, "Selva", 15, 100, "Panthera tigris tigris");
        Mamifero lobo = new Lobo(80d, 1.2d, 40d, "Bosque", "Gris", 5, 5, "Canis lupus occidentalis");
        Mamifero perroSalvaje = new PerroSalvajeAfricano(60d, 1.0d, 25d, "Sabana", "Marrón", 4, 400);
        Mamifero leon2 = new Leon(100d, 4.5d, 6.0d, "Sabana", 55 , 80, 200, 160);
        Mamifero guepardo2 = new Guepardo(4.7d, 120d, 80d, "Savana", 9, 115);

        mamiferos[0] = leon;
        mamiferos[1] = guepardo;
        mamiferos[2] = tigre;
        mamiferos[3] = lobo;
        mamiferos[4] = perroSalvaje;
        mamiferos[5] = leon2;
        mamiferos[6] = guepardo2;

        for (Mamifero m:
             mamiferos) {
            System.out.println(m);
        }
}}