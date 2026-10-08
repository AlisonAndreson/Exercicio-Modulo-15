import java.util.Scanner;

public class recursao {

    public static void main(String[] args) {
        int n = 4;// Exemplo para calcular
        System.out.println("Degraus de " + n + ", existem " + degrau(n) + " maneiras de subir ao topo!");
    }


    //Recursão
    public static int degrau(int n){
        if(n <= 1){
            return 1;
        }
        //Chamada recursiva seguindo a relação F(n) = F(n-1) + F(n-2)
        return degrau(n-1) + degrau(n-2);
    }


}
