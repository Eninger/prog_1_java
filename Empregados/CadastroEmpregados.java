package Empregados;
import java.util.Scanner;
import java.util.Random;

public class CadastroEmpregados{

    public static void main(String[] args){


        Random RandomCreator = new Random();

        int counter = 0;
        int number = RandomCreator.nextInt(6);

        Scanner input = new Scanner(System.in);
        while( counter <= number){
            counter++;
            System.out.println("Qual o é nome:");
            String Nome = input.nextLine();
            String Sobrenome = input.nextLine();

            Empregados 

        }
    }
    
}
