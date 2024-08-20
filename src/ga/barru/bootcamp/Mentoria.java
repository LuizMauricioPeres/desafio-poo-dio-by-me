package ga.barru.bootcamp;

import java.time.LocalDate;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor

public class Mentoria extends Conteudo {
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + getCargaHoraria() +
                ", data=" + data +
                '}';
    }


}
