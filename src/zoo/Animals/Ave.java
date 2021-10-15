package zoo.Animals;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Ave extends Animal{
    int altuVuelo;
    String colPluma;
    String pata;
    String tipo;

    public Ave(String nombre,int edad,String sexo,int altuVuelo, String colPluma, String pata, String tipo) {
        super(nombre,edad,sexo);
        this.altuVuelo = altuVuelo;
        this.colPluma = colPluma;
        this.pata = pata;
        this.tipo = tipo;
    }

    public void imprimir(){
        System.out.print(" || Nombre: " + Nombre);
        System.out.print(" || Edad: " + Edad);
        System.out.print(" || Genero: "+ Genero);
        System.out.print(" || Vuela: " + altuVuelo +" metros ");
        System.out.print(" || Plumaje de color " + colPluma);
        System.out.print(" || Patas de tipo " + pata);
        System.out.println(" || Especie/Tipo " + tipo);
    }

    public int getAltuVuelo() {
        return altuVuelo;
    }

    public String getColPluma() {
        return colPluma;
    }

    public String getPata() {
        return pata;
    }

    public String getTipo() {
        return tipo;
    }
}
