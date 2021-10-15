package zoo.Animals;

public class Mamifero extends Animal {
    int peso;
    String horaDia;
    int velocidad;
    String dieta;
    String tipo;

    public Mamifero(String nombre, int edad, String genero, int peso, String horaDia, int velocidad, String dieta, String tipo) {
        super(nombre, edad, genero);
        this.peso = peso;
        this.horaDia = horaDia;
        this.velocidad = velocidad;
        this.dieta = dieta;
        this.tipo = tipo;
    }

    public void imprimir(){
        System.out.print(" || Nombre: " + Nombre);
        System.out.print(" || Edad: " + Edad);
        System.out.print(" || Genero: "+ Genero);
        System.out.print(" || Pesa: " + peso);
        System.out.print(" || Horario: " + horaDia);
        System.out.print(" || Velocidad/Desplazamiento: " + velocidad);
        System.out.print(" || Dieta: " + dieta);
        System.out.println(" || Especie/Tipo " + tipo);
    }

    public int getPeso() {
        return peso;
    }

    public String getHoraDia() {
        return horaDia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getDieta() {
        return dieta;
    }

    public String getTipo() {
        return tipo;
    }
}
