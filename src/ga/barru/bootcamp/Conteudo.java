package ga.barru.bootcamp;
import lombok.*;

@Getter
@Setter
public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;
    private int cargaHoraria = 0;

    public abstract double calcularXp();

}
