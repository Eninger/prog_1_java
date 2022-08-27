package Empregados;



public class Empregados {
    private String PrimeiroNome;
    private String UltimoNome;
    private static int count = 0 ; //o número de empregados criados

    //inicializa Empregados, adiciona 1 ao static count e 
    //gera  a saida de String indicando que o contrutor foi chamado



    public Empregados(String first, String last){

        PrimeiroNome = first;
        UltimoNome = last;

        
        ++count;  //imcrementa contagem de empregados  

        System.out.println("Empregados constructor: " + PrimeiroNome + UltimoNome + "count: " + count);
    }

    public String GetPrimeiroNome(){ //metodos de retorno devem conter o tipo de dado
        return PrimeiroNome;
    }

    public String GetUltimoNome(){
        return UltimoNome;
    }

    public static  int GetCount(){
        //metodo estatico para retornar o valor estatico 
        return count;
    }


}
