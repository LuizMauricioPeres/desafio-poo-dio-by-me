package ga.barru.bootcamp;

import lombok.*;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@Getter

public class Dev {

    private String nome;
    private Set<Modulo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Modulo> conteudosConcluidos = new LinkedHashSet<>();


    public void inscreverBootcamp(Bootcamp bootcamp) {

        for (Curso curso : bootcamp.getCursos()) {
            for (Modulo modulo : curso.getModulos()) {
                this.conteudosInscritos.add(modulo);
            }
        }
        bootcamp.getDevsInscritos().add(this);
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public double calcularTotalXp() {
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Modulo::calcularXp)
                .sum();
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
