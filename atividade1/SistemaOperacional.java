public class SistemaOperacional {
    private Computador computador;

    public SistemaOperacional(Computador computador) {
        this.computador = computador;
    }

    public void executarPrograma(Programa p) {
        if (p.getSSDOcupado() > computador.getSSD()) {
            System.out.println("Erro na instalação do programa: SSD insuficiente.");
        } else if (p.getMemoriaRAMAlocada() > computador.getMemoriaRAM()) {
            System.out.println("Erro na execução do programa: Memória RAM insuficiente.");
        } else {
            System.out.println("Programa executado com sucesso.");
            Float tempoExecucao = (float) p.getQuantidadeOperacoes() /
                                  (computador.getOperacoesPorSegundo() * computador.getNucleos());
            System.out.printf("Tempo de execução do programa: %.2f segundos%n", tempoExecucao);
        }
    }
    
}
