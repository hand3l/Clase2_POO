import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)	{
        System.out.println("--------------Clase 2 - POO---------\n");
        //Para declarar el objeto
        //Para instanciar una clase
        Libro libro = new Libro("El Respandor","Stephen King","De Bolsillo",600);
        Libro libro1 = new Libro("El dia de ayer","Edna Iturralde","Don bosco",181);
        Libro libro2 = new Libro("Cien años de soledad","Gabriel García Márquez","Editorial Sudamericana",432);
        Libro libro3 = new Libro("Don Quijote de la Mancha","Miguel de Cervantes","Penguin Clasicos",1024);
        Libro libro4 = new Libro("La sombra del viento","Carlos Ruiz Zafón","Planeta",576);
        Libro libro5 = new Libro("El amor en los tiempos del cólera","Gabriel García Márquez","Editorial Random House",368);

        libro1.imprimir();
        System.out.println();libro1.imprimircubierta();
        libro2.imprimir();
        System.out.println();libro2.imprimircubierta();
        libro3.imprimir();
        System.out.println();libro3.imprimircubierta();
        libro4.imprimir();
        System.out.println();libro4.imprimircubierta();
        libro5.imprimir();
        System.out.println();libro5.imprimircubierta();

        System.out.println("\n----------VIDEOJUEGO-----------\n");
        Videojuego videojuego1 = new Videojuego("The Legend of Zelda: Breath of the Wild","Aventura","Moderada",2017);
        Videojuego videojuego2 = new Videojuego("God of War","Acción","Moderada",2018);
        Videojuego videojuego3 = new Videojuego("Hollow Knight","Aventura","Moderada",2017);
        Videojuego videojuego4 = new Videojuego("Overwatch","Shooter en equipo","Variable",2016);
        Videojuego videojuego5 = new Videojuego();


        //Imprimir algo en especifico
        System.out.println(videojuego1.getCategoria());
        System.out.println(videojuego2.getNombre());
        System.out.println(videojuego3.getCategoria());

        //Para que se imprima otro valor
        System.out.println(videojuego2.getLanzamineto());
        videojuego2.setLanzamineto(2024);
        System.out.println(videojuego2.getLanzamineto());

        //Para agregar un dato-Constructor vacio
        videojuego3.setNombre("Pacman");
        videojuego4.setLanzamineto(2001);
        videojuego5.imprimir();


    }
}
