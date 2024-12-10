//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b =5;
        int c = 30;

        boolean equal = (b == a);
        boolean different  = (b != c);
        boolean higher = (c > a);
        boolean lower = (b <= a);

        System.out.println(equal + " " + different + " " + higher + " " + lower);

        double media = (9.8 + 6.3 + 8.0) /3;

        int anoDeLancamento = 2023;
        int classificacao = (int) (media /2);

        String sinopse;
        //Aspas triplas indicam que se deseja escrever um Text Block na String,
        // sendo possível manter formatação recurso criado em Java v15
        sinopse = """
                \nFilme Top Gun
                Filme de aventura com galã dos anos 80
                Ano de Lançamento: %d
                Classificacao: %d
                """.formatted(anoDeLancamento,classificacao);

        System.out.printf("%.2f\n", media);
        System.out.println(sinopse);

        String password = "1234";
        String counterPassword = "1234";
        /*Embora funcione a forma de comparação de Strings deve ser
        utilizando o método equals da classe String
        if(password == "1234"){
            System.out.println("Acesso permitido");
        }else{
            System.out.println("Acesso negado");
        }
        */

        if(password.equals(counterPassword)){
            System.out.println("Acesso permitido");
        }else{
            System.out.println("Acesso negado");
        }
        String nome = "Carlos";
        int idade = 20;
        int aulas = 4;

        double gasto = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, gasto));
        String mensagem = """
                Olá, %s!
                Boas Vindas ao curso de Java da Alura.
                Estamos na aula %d, ou seja, temos muito a aprender ainda.
                """.formatted(nome,aulas);


        System.out.println(mensagem);
    }
}