package universidadgrupo8;

import universidadgrupo8.accesoADatos.MateriaData;
import universidadgrupo8.entidades.Materia;

public class UniversidadGrupo8 {

    public static void main(String[] args) {

        Materia mat = new Materia("Analisis", 1, true);
        MateriaData m = new MateriaData();
        m.guardarMateria(mat);
        
    }

}
