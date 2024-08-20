package ga.barru.bootcamp;

import java.util.List;
import java.util.ArrayList;

import lombok.*;

@Getter
@Setter

public class Curso extends Conteudo {

    private List<Modulo> modulos = new ArrayList<Modulo>();

    public void adicionaModulo(Modulo modulo) {
        this.modulos.add(modulo);
        this.setCargaHoraria(getCargaHoraria()+ modulo.getCargaHoraria());
    }

    @Override
    public double calcularXp() {
        return modulos.stream().mapToDouble(Modulo::calcularXp).sum();
    }
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria='" + getCargaHoraria() + '\'' +
                ", modulos=" + modulos +
                '}';
    }
}
