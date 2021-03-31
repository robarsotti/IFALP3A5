package ordenacao;

import java.util.Collections;
import java.util.List;


public class OrdenacaoAleatoria extends Ordenacao<Integer>{
    @Override
    public List<Integer> Ordenar(List<Integer> lista) {
        Collections.shuffle(lista);
        return lista;
    }
}
