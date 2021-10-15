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



}
