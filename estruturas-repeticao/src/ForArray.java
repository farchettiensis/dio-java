public class ForArray {
    public static void main(String[] args) {
        String alunos[] = { "João", "Maria", "Pedro", "Ana" };

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno no índice x=" + i + " é " + alunos[i]);
        }

        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
