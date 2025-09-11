public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador(16, 500, 4, 2.5f);

        SistemaOperacional sistema = new SistemaOperacional(pc);

        Programa programa1 = new Programa(8, 200, 2, 10500);
        Programa programa2 = new Programa(20, 100, 2, 5000);
        Programa peograma3 = new Programa(8, 600, 2, 8000);

        sistema.executarPrograma(programa1);
        sistema.executarPrograma(programa2);
        sistema.executarPrograma(peograma3);
    }
}
