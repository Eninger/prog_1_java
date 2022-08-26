package ClasseEstatica;

class ClasseEstatica {
    
    private int numeroNaoEstatico;
    private static int numeroEstatico;

    public ClasseEstatica()
{
    this.numeroNaoEstatico++;
    this.numeroEstatico++;



}



    public void imprimeAtributos(){
        System.out.println("número não estatico");
    }


    public void MetodoNaoEstatico() {

        System.out.println(this +"Método NÃo estatico =" + numeroNaoEstatico);
        System.out.println(this +"numero estatico = "+ numeroEstatico);
    }


    public static void MetodoEstatico() {

        System.out.println("Método estatico");
    }
    
}
