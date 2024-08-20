package ga.barru.bootcamp;

public class Modulo extends Conteudo {

    boolean concluido = false;

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }
    @Override
    public double calcularXp() {
        return concluido ? XP_PADRAO * getCargaHoraria() : 0;
    }


}
