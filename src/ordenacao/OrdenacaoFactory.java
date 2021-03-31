package ordenacao;

import java.util.Optional;


public class OrdenacaoFactory {
    public static Ordenacao getOrdenacao(Integer tipo) {
        Optional<TiposOrdenacao> opt = TiposOrdenacao.values().length>=tipo+1 ? Optional.of(TiposOrdenacao.values()[tipo]) : Optional.empty();
        if (opt.isEmpty()) {
            throw new IllegalArgumentException("O tipo de ordenação informado não existe");
        }
        return opt.get().getOrdenacao();
    }
}
