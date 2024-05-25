public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("123456789");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("CEP inválido!");
            e.printStackTrace();
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }

        return "12345678";
        // return cep.substring(0, 5) + "-" + cep.substring(5);
    }
}
