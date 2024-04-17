import java.util.ArrayList;
import java.util.List;

public class ArbolHabilidades {
    private Habilidad raiz;
    private List<Habilidad> habilidades;

    public ArbolHabilidades(Habilidad raiz) {
        this.raiz = raiz;
        habilidades = new ArrayList<>();
        habilidades.add(raiz);
    }

    public void agregarHabilidad(Habilidad habilidad, Habilidad padre) {
        if (habilidades.contains(habilidad)) {
            System.out.println("La habilidad ya existe");
            return;
        }
        if (!habilidades.contains(padre)) {
            System.out.println("La habilidad padre no existe");
            return;
        }
        habilidades.add(habilidad);
        padre.agregarHijo(habilidad);
    }

    public Habilidad buscarHabilidad(String nombre) {
        for (Habilidad habilidad : habilidades) {
            if (habilidad.getNombre().equals(nombre)) {
                return habilidad;
            }
        }
        return null;
    }

    public void mejorarHabilidad(Habilidad habilidad) {
        habilidad.mejorar();
    }

    public void visualizar() {
        for (Habilidad habilidad : habilidades) {
            System.out.println(habilidad);
        }
    }
}