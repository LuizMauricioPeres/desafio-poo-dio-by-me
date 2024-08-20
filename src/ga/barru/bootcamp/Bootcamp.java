package ga.barru.bootcamp;

import java.time.LocalDate;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Modulo> modulos = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        return (!(o==null) && o.getClass() == this.getClass() && (this == o || mesmosAtributos((Bootcamp) o)));
   }

    private boolean mesmosAtributos(Bootcamp o) {
        return this.nome.equals(o.getNome())
            && this.descricao.equals(o.getDescricao())
            && this.dataInicial.equals(o.getDataInicial())
            && this.dataFinal.equals(o.getDataFinal())
            && Objects.equals(modulos, o.modulos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.nome, this.descricao, this.dataInicial, this.dataFinal, this.modulos);
    }
}
