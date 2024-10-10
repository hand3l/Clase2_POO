//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)	{
        System.out.println("Hello World!");
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
    }
}
