package ordenacao;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenacaoCrescente extends Ordenacao<Integer>{

    @Override
    public List<Integer> Ordenar(List<Integer> lista) {
        return lista.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    }
}
