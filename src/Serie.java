public class Serie {
    //Atributos
    String nombre;
    String categoria;
    String episodios;
    int lamzaiento;

    public Serie(String nombre, String categoria, String episodios, int lamzaiento) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.episodios = episodios;
        this.lamzaiento = lamzaiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEpisodios() {
        return episodios;
    }

    public void setEpisodios(String episodios) {
        this.episodios = episodios;
    }

    public int getLamzaiento() {
        return lamzaiento;
    }

    public void setLamzaiento(int lamzaiento) {
        this.lamzaiento = lamzaiento;
    }
}
