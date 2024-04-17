public class ArbolHabilidadesSecuencial<T> {
    private T raiz;

    public ArbolHabilidadesSecuencial(T raiz) {
        this.raiz = raiz;
    }

    public void realizarTurno(Jugador jugador) {
        System.out.println("Turno de " + jugador.getNombre());
        jugador.seleccionarHabilidad();
        jugador.ejecutarHabilidad();
        System.out.println(); // Salto de línea para separar los turnos
    }

    // Método para agregar habilidades en el árbol. Este es un ejemplo básico y debe
    // ser expandido.
    // Aquí deberías implementar la lógica para encontrar al padre y agregar las
    // habilidades hijas.
    public void agregarHabilidad(T padre, T habilidadIzquierda, T habilidadDerecha) {

    }

    // Método para buscar una habilidad por nombre.
    public T buscarHabilidad(String nombre) {
        return null; // Modificar para retornar la habilidad encontrada.
    }

    // Método para visualizar el árbol de habilidades.
    public void imprimirArbol() {
        // Implementar un método para imprimir el árbol, mostrando la estructura y
        // niveles de habilidad.
    }

    public class Jugador {
        private String nombre;

        public Jugador(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void seleccionarHabilidad() {
            // Aquí iría la lógica para que el jugador seleccione una habilidad.
        }

        public void ejecutarHabilidad() {
            // Aquí iría la lógica para que el jugador ejecute la habilidad seleccionada.
        }
    }
}