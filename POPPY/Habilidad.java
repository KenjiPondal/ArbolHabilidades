public class Habilidad {
    private String nombre;
    private String descripcion;
    private int nivel;
    private final int maximoNivel;
    private boolean desbloqueada;

    public Habilidad(String nombre, String descripcion, int maximoNivel) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivel = 1; // Por defecto, comienza en nivel 1
        this.maximoNivel = maximoNivel;
        this.desbloqueada = false; // Por defecto, la habilidad está bloqueada
    }

    public void desbloquear() {
        desbloqueada = true;
    }

    public boolean estaDesbloqueada() {
        return desbloqueada;
    }

    public void mejorar() {
        if (nivel < maximoNivel) {
            nivel++;
        }
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getMaximoNivel() {
        return maximoNivel;
    }

    @Override
    public String toString() {
        return nombre + " (Nivel " + nivel + "/" + maxNivel + "): " + tipo;
    }
}
