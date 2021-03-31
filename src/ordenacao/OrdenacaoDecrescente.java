package ordenacao;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenacaoDecrescente extends Ordenacao<Integer>{

    @Override
    public List<Integer> Ordenar(List<Integer> lista) {
        return lista.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}
