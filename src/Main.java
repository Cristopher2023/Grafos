public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        grafo.agregarVertice("Bob");
        grafo.agregarVertice("Rob");
        grafo.agregarVertice("Alice");
        grafo.agregarVertice("Mark");
        grafo.agregarVertice("Maria");
        grafo.agregarArista("Bob","Rob");
        grafo.agregarArista("Bob","Alice");
        grafo.agregarArista("Rob","Maria");
        grafo.agregarArista("Rob","Mark");
        grafo.agregarArista("Maria","Alice");
        grafo.agregarArista("Alice","Mark");
        System.out.println("");

        System.out.println("LISTA DE GRAFOS:");

        grafo.imprimirGrafoComoListaAdyacente();
        System.out.println("");

        System.out.println("GRAFO BOB ELIMINADO:");
        grafo.eliminarVertice("Bob");
        grafo.eliminarArista("Alice","Rob");
        System.out.println("");
        grafo.imprimirGrafoComoListaAdyacente();






    }
}
