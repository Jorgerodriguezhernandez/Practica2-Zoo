package zoo.Animals;

public class Animal {
    public String Nombre;
    public int Edad;
    public String Genero;

    public Animal(String nombre, int edad, String genero) {
        Nombre = nombre;
        Edad = edad;
        Genero = genero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }
}
