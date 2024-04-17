import java.util.List;

public class VisualizadorArbolHabilidades {

    public static void visualizarArbol(Habilidad raiz, List<Habilidad> habilidadesDesbloqueadas) {
        visualizarHabilidad(raiz, habilidadesDesbloqueadas, 0);
    }

    private static void visualizarHabilidad(Habilidad habilidad, List<Habilidad> habilidadesDesbloqueadas, int nivel) {
        StringBuilder espacio = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            espacio.append("   ");
        }

        if (habilidadesDesbloqueadas.contains(habilidad)) {
            System.out.println(espacio + "|- " + habilidad.getNombre() + " (Nivel " + habilidad.getNivel() + "/"
                    + habilidad.getMaximoNivel() + ")");
        } else {
            System.out.println(espacio + "|- " + habilidad.getNombre() + " (Bloqueada)");
        }

        List<Habilidad> habilidadesHijas = habilidad.getHabilidadesHijas();
        for (Habilidad habilidadHija : habilidadesHijas) {
            visualizarHabilidad(habilidadHija, habilidadesDesbloqueadas, nivel + 1);
        }
    }
}