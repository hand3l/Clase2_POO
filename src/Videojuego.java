public class Videojuego {
    //Atributos
    String nombre;
    String categoria;
    String dificultad;
    int lanzamineto;

    //Constructor con parametros
    public Videojuego(String nombre, String categoria, String dificultad, int lanzamineto) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.dificultad = dificultad;
        this.lanzamineto = lanzamineto;

    }

    //Constructor vacio
    public Videojuego() {
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDificultad() {
        return dificultad;
    }

    public int getLanzamineto() {
        return lanzamineto;
    }

    //Setters

    public String setNombre(String nombre) {
        this.nombre = nombre;
        return nombre;
    }

    public int setLanzamineto(int lanzamineto) {
        this.lanzamineto = lanzamineto;
        return lanzamineto;
    }

    //Metodos personalizados
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoria: " + categoria);
        System.out.println("Dificultad: " + dificultad);
        System.out.println("Lanzamineto: " + lanzamineto);
    }
}
