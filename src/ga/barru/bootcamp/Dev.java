package ga.barru.bootcamp;

import lombok.*;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;

@Getter

public class Dev {

    private String nome;
    private Set<Modulo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Modulo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getModulos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Modulo> modulo = this.conteudosInscritos.stream().findFirst();
        if (modulo.isPresent()) {
            modulo.get().setConcluido(true);
            this.conteudosConcluidos.add(modulo.get());
            this.conteudosInscritos.remove(modulo.get());
        } else {
            System.out.println("Você não está matriculado em nenhum conteúdo!");
        }

    }
    @Override
    public boolean equals(Object o) {
        return (!(o==null) && o.getClass() == this.getClass() && (this == o || mesmosAtributos((Dev) o)));
    }

    private boolean mesmosAtributos(Dev o) {
        return this.nome.equals(o.getNome())
            && this.conteudosInscritos.equals(o.getConteudosInscritos())
            && this.conteudosConcluidos.equals(o.getConteudosConcluidos());
    }

    @Override
    public int hashCode() {
        return Objects.hash( nome, conteudosInscritos, conteudosConcluidos);
    }

}
