package projeto.alura.aula;

import java.util.ArrayList;

public class MainContaBancaria {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        ContaBancaria conta1 = new ContaBancaria(1, 2500);
        ContaBancaria conta2 = new ContaBancaria(2, 5000);
        ContaBancaria conta3 = new ContaBancaria(3, 500);
        ContaBancaria conta4 = new ContaBancaria(4, 10000);
        listaDeContas.add(conta1);
        listaDeContas.add(conta2);
        listaDeContas.add(conta3);
        listaDeContas.add(conta4);
        ContaBancaria maiorSalario = listaDeContas.get(0);
        for (ContaBancaria conta : listaDeContas) {
            if (conta.getSaldo() > maiorSalario.getSaldo()) {
                maiorSalario = conta;

            }

        }
        System.out.println(maiorSalario);
    }
}

