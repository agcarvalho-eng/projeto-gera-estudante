import java.util.List;

/**
 * Aplicação de exemplo de princípios de programação funcional em Java,
 * Expressões Lambda e API de Streams do Java 8.
 * <p>
 * Para aprofundar nestes assuntos, veja os links abaixo:
 *
 * <ul>
 * <li><a href=
 * "https://www.oracle.com/technetwork/pt/articles/java/streams-api-java-8-3410098-ptb.html">Curso
 * Streams e Expressões Lambda do Java 8</a></li>
 * <li><a href= "http://bit.ly/2I2U5bU">Curso JDK 8 MOOC: Lambdas and Streams
 * Introduction</a></li>
 * </ul>
 *
 * @author Manoel Campos da Silva Filho
 */
public class AppProgramacaoFuncional {
    private static final int TOTAL_ESTUDANTES = 10;
    private final List<Estudante> estudantes = StudentGenerator.generate(TOTAL_ESTUDANTES);

    public AppProgramacaoFuncional() {
        double maiorNota = estudantes.stream()
                .filter((Estudante e) -> e.getSexo() == 'M')
                .mapToDouble((Estudante e) -> e.getNota())
                .max()
                .orElse(0);
        System.out.printf("A maior nota é: %.2f\n", maiorNota);

    }

    public static void main(String[] args) {
        new AppProgramacaoFuncional();
    }
}

