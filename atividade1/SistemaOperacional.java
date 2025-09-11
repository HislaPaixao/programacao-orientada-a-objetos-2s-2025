public class SistemaOperacional {
    private Computador computador;

    public SistemaOperacional(Computador computador) {
        this.computador = computador;
    }

    public boolean executarPrograma(Programa p) {
        boolean ssdInsuficiente = p.getSSDOcupado() > computador.getSSD();
        boolean memoriaInsuficiente = p.getMemoriaRAMAlocada() > computador.getMemoriaRAM();

        if (ssdInsuficiente) {
            System.out.println("Erro na instalação do programa: SSD insuficiente.");
            return false;
        } 
        
        if (memoriaInsuficiente) {
            System.out.println("Erro na execução do programa: Memória RAM insuficiente.");
            return false;
        }

        System.out.println("Programa executado com sucesso.");
        float tempoExecucao = (float) p.getQuantidadeOperacoes() /
                              (computador.getOperacoesPorSegundo() * computador.getNucleos());
        System.out.printf("Tempo de execução do programa: %.2f segundos%n", tempoExecucao);
        return true;
    }
}
