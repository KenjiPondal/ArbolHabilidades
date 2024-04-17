public class Main {
    public static void main(String[] args) {

        ArbolHabilidadesDinamico<Habilidad> troll = new ArbolHabilidadesDinamico<>(new Habilidad("Troll", "Personaje"));
        ArbolHabilidadesDinamico<Habilidad> elfo = new ArbolHabilidadesDinamico<>(new Habilidad("Elfo", "Personaje"));

        // Agregar habilidades al árbol de Troll y Elfo
        troll.agregarHabilidad(troll.getRaiz(), new Habilidad("Ataque", "Ataque"), new Habilidad("Defensa", "Defensa"));
        elfo.agregarHabilidad(elfo.getRaiz(), new Habilidad("Ataque", "Ataque"), new Habilidad("Defensa", "Defensa"));

        // Imprimir árbol de habilidades
        System.out.println("Árbol de habilidades de Troll:");
        troll.imprimirArbol();
        System.out.println("\nÁrbol de habilidades de Elfo:");
        elfo.imprimirArbol();

        int max_turnos = 10;
        int turnos = 0;

        while (turnos < max_turnos) {

            if (turnos % 2 == 0) {
                // Ataca un jugador (Por ejemplo Troll)
                System.out.println("Turno " + turnos + ": Troll ataca");
            } else {
                // Ataca el otro jugador (Por ejemplo Elfo)
                System.out.println("Turno " + turnos + ": Elfo ataca");
            }
            turnos++;
        }

        // Al finalizar la partida, imprimir los árboles de habilidades actualizados
        System.out.println("\nArbol de habilidades de Troll al finalizar la partida:");
        troll.imprimirArbol();
        System.out.println("\nArbol de habilidades de Elfo al finalizar la partida:");
        elfo.imprimirArbol();
    }
}