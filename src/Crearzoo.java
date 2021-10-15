import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.FileReader;
import zoo.Animals.Ave;
import zoo.Animals.Mamifero;
import zoo.Animals.Reptil;

public class Crearzoo {

    public static void main(String[] args) throws IOException {
        int Jaulas;
        int Animales;
        Scanner Leer = new Scanner(System.in);
        System.out.println(" ¿Cuantas Jaulas quieres que tenga el zoo? ");
        Jaulas = Leer.nextInt();
        System.out.println(" ¿Cuantos Animales quieres que tenga el zoo? ");
        Animales = Leer.nextInt();
        ArrayList<Ave> Aves = new ArrayList<>();

        ArrayList<Mamifero> Mamiferos = new ArrayList<>();
        ArrayList<Reptil> Reptiles = new ArrayList<>();

        for (int i=0; i < Animales;i++) {
            Random rand = new Random();
            int n = rand.nextInt(3);
            if (n == 1) {
                Ave Especie = new Ave(GenerarNombre(), GenerarEdad(), GenerarSexo(), GenerarVuelo(), GenerarColor(), GenerarPalma(), GenerarTipoAve());
                //Especie.imprimir();
                Aves.add(Especie);


            }else if(n==2){
                Mamifero Especie = new Mamifero(GenerarNombre(), GenerarEdad(), GenerarSexo(), GenerarPeso(), GenerarHabito(), GenerarVelocidad(),GenerarDieta(), GenerarTipoMamifero());
                //Especie.imprimir();
                Mamiferos.add(Especie);
            }else{
                Reptil Especie = new Reptil(GenerarNombre(), GenerarEdad(), GenerarSexo(), GenerarTemperatura(), GenerarColor(), GenerarVelocidad(), GenerarTipoReptil());
                //Especie.imprimir();
                Reptiles.add(Especie);
            }

        }
        ArrayList<Ave> AvesIndice = new ArrayList<>();
        for (int x=0; x < Aves.size();x++){
            String Tipo = Aves.get(x).getTipo();
            String Genero= Aves.get(x).getGenero();
            String Nombre= Aves.get(x).getNombre();
            AvesIndice.add(Aves.get(x));
            for (int e=0; e < AvesIndice.size();e++) {
                if (Nombre != AvesIndice.get(e).getNombre()){
                    if (Genero != AvesIndice.get(e).getGenero()) {
                        if (Tipo == AvesIndice.get(e).getTipo()) {
                            System.out.println("Jaula compartida de : ");
                            Aves.get(x).imprimir();
                            AvesIndice.get(e).imprimir();
                            AvesIndice.remove(e);
                            Jaulas= Jaulas-1;
                            System.out.println("Jaulas restantes : " + Jaulas);
                        }
                    }
                }
            }

        }

        ArrayList<Mamifero> MamiferosIndice = new ArrayList<>();
        for (int x=0; x < Mamiferos.size();x++){
            String Tipo = Mamiferos.get(x).getTipo();
            String Genero= Mamiferos.get(x).getGenero();
            String Nombre= Mamiferos.get(x).getNombre();
            MamiferosIndice.add(Mamiferos.get(x));
            for (int e=0; e < MamiferosIndice.size();e++) {
                if (Nombre != MamiferosIndice.get(e).getNombre()){
                    if (Genero != MamiferosIndice.get(e).getGenero()) {
                            if (Tipo == MamiferosIndice.get(e).getTipo()) {
                            System.out.println("Jaula compartida de : ");
                            Mamiferos.get(x).imprimir();
                            MamiferosIndice.get(e).imprimir();
                            MamiferosIndice.remove(e);
                            Jaulas= Jaulas-1;
                            System.out.println("Jaulas restantes : " + Jaulas);
                        }
                    }
                }
            }

        }

    }

    public static String GenerarTipoReptil() throws IOException {
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
    public static String GenerarTipoMamifero() throws IOException {
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
    //Metodos Genericos y Reutilizables
    public static String GenerarSexo() throws IOException {
        Random rand = new Random();
        int n = rand.nextInt(2);
        if (n < 1){
            return "Masculino";
        }else{
            return "Femenino";
        }
    }
    public static int GenerarEdad() throws IOException {
        Random rand = new Random();
        int randomNum = (int) (Math.random() * ( 30 - 1 ));
        return randomNum;
    }
    public static String GenerarNombre() throws IOException {
        ArrayList<String> Nombres = new ArrayList<>();
        FileReader f = new FileReader("E:\\Multimedia PRG\\Practica2-1\\src\\NombresAnimales.txt");
        BufferedReader b = new BufferedReader(f);
        String NombreNum;
        while((b.readLine())!=null) {
            Nombres.add((b.readLine()));
        }

        Random rand = new Random();
        int n = rand.nextInt(Nombres.size());
        NombreNum = Nombres.get(n);

        return NombreNum;
    }
    public static String GenerarColor() throws IOException {
        Random rand = new Random();
        int n = rand.nextInt(5);

        switch (n){
            case (1):
                return "Rojo";
            case (2):
                return "Verde";
            case (3):
                return "Amarillo";
            case (4):
                return "Azul";
            case (0):
                return "Violeta";
        }
        return null;
    }
    public static int GenerarVelocidad() throws IOException {
        Random rand = new Random();
        int n = rand.nextInt(60);
        return n;
    }
    // Metodos de Aves
    public static int GenerarVuelo() throws IOException {
        Random rand = new Random();
        int n = rand.nextInt(40);
        return n;
    }
    public static String GenerarPalma() throws IOException {
        Random rand = new Random();
        int n = rand.nextInt(2);
        if (n < 1){
            return "Palmipeda";
        }else{
            return "Garra";
        }
    }
    public static String GenerarTipoAve() throws IOException {
        Random rand = new Random();
        int n = rand.nextInt(5);

        switch (n){
            case (1):
                return "Golondrina";
            case (2):
                return "Halcon";
            case (3):
                return "Lechuza";
            case (4):
                return "Buho";
            case (0):
                return "Cigueña";
        }
        return null;
    }
    // Metodos de Mamiferos
    public static int GenerarPeso() throws IOException {
        Random rand = new Random();
        int n = rand.nextInt(80);
        return n;
    }
    public static String GenerarHabito() throws IOException {
        Random rand = new Random();
        int n = rand.nextInt(2);
        if (n < 1){
            return "Diurno";
        }else{
            return "Nocturno";
        }
    }
    public static String GenerarDieta() throws IOException {
        Random rand = new Random();
        int n = rand.nextInt(3);
        if (n == 0){
            return "Carnívora";
        }else if( n==1){
            return "Herbívora";
        }else{
            return "Omnívora";
        }
    }
    // Metodos de Reptiles
    public static Double GenerarTemperatura() throws IOException {
        Random rand = new Random();
        double n = rand.nextDouble();
        return n;
    }

}
