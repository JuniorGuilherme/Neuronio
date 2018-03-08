import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int x1, x2, peso1, peso2, op;
        double soma, y;
        Scanner tc = new Scanner(System.in);

        peso1 = -1;
        peso2 = 1;


        do{
            System.out.println("Entrada 1:");
            x1 = tc.nextInt();
            System.out.println("Entrada 2:");
            x2 = tc.nextInt();

            soma = (x1 * peso1) + (x2 * peso2);

            System.out.println("Escolha a função de transferencia desejada:");
            System.out.println("1- Funcao Rampa:");
            System.out.println("2- Limite Rapido");
            System.out.println("3- Funcao Sigmoide");
            System.out.println("0- Sair");
            op=tc.nextInt();

            switch (op){
                case 1:{
                    if(soma<0){
                        y=0;
                        System.out.println("Saida: "+y);
                    }else if(soma>=0 && soma<=1){
                        y=soma;
                        System.out.println("Saida: "+y);
                    }
                    else if(soma>1){
                        y=1;
                        System.out.println("Saida: "+y);
                    }
                    break;
                }
                case 2:{
                    if(soma<=0){
                        y=-1;
                        System.out.println("Saida: "+y);
                    }
                    else if(soma>0){
                        y=1;
                        System.out.println("Saida: "+y);
                    }
                    break;
                }
                case 3:{
                    if(soma>=0){
                        y=1 - (1/(1+soma));
                        System.out.println("Saida: "+y);
                    }
                    else if(soma<0){
                        y=-1+(1/(1-soma));
                        System.out.println("Saida: "+y);
                    }
                    break;
                }
                case 0:{
                    System.out.println("Encerrado.");
                    break;
                }
            }
        }while (op!=0);
    }

}
