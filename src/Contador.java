import java.sql.SQLOutput;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int parametroUm = terminal.nextInt();

        System.out.print("Digite o segundo número: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O parâmetro um é maior que o parâmetro dois!");
        }

        terminal.close();
    }

    static void contar (int parametroUm, int paramtroDois) throws ParametrosInvalidosException {
        if (parametroUm > paramtroDois){

            throw new ParametrosInvalidosException();

        }else{
             int contagem = paramtroDois - parametroUm;
             System.out.println("Será realizada a contagem de " + contagem + " números");
             for (int i = 0; i < contagem; i++){

                 System.out.println("Imprimindo número " + (i+1));

             }
        }


    }

}
