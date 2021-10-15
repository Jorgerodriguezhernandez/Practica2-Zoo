package zoo.Animals;

import java.io.IOException;
import java.util.Random;

public class Reptil extends Animal{
    double temperatura;
    String colorEsca;
    int velocidad;
    String tipo;

    public Reptil(String nombre, int edad, String genero, double temperatura, String colorEsca, int velocidad, String tipo) {
        super(nombre, edad, genero);
        this.temperatura = temperatura;
        this.colorEsca = colorEsca;
        this.velocidad = velocidad;
        this.tipo = tipo;
    }

    public void imprimir(){
        System.out.print(" || Nombre: " + Nombre);
        System.out.print(" || Edad: " + Edad);
        System.out.print(" || Genero: "+ Genero);
        System.out.print(" || Temperatura: " + temperatura);
        System.out.print(" || Color de Escama " + colorEsca);
        System.out.print(" || Velocidad/Desplazamiento " + velocidad);
        System.out.println(" || Especie/Tipo " + tipo);
    }

    public String GenerarTipoReptil() throws IOException {
        Random rand = new Random();
        int n = rand.nextInt(5);

        switch (n){
            case (1):
                return "Dragon";
            case (2):
                return "Cocodrilo";
            case (3):
                return "Iguana";
            case (4):
                return "Serpiente";
            case (0):
                return "Tortuga";
        }
        return null;

    }
    public String GenerarTipoMamifero() throws IOException {
        Random rand = new Random();
        int n = rand.nextInt(5);

        switch (n){
            case (1):
                return "Leon";
            case (2):
                return "Tigre";
            case (3):
                return "Elefante";
            case (4):
                return "Rinoceronte";
            case (0):
                return "Marmota";
        }
        return null;

    }

    public Double getTemperatura() {
        return temperatura;
    }

    public String getColorEsca() {
        return colorEsca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getTipo() {
        return tipo;
    }
}
