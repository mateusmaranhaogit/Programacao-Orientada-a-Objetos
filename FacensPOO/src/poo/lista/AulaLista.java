package poo.lista;

import java.util.ArrayList;


public class AulaLista {
    public static void main(String[] args) {
        //aula de lista
        //comparação entre array e arraylist
        
        /*
        int[] numeros = new int[4];
        int[] novo = new int[5];
        numeros[0] = 1;
        numeros[1] = 25;
        numeros[2] = 40;
        numeros[3] = 89;
        System.out.println(numeros[3]);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        for (int numero : numeros) {
            System.out.println(">>>" + numero);
        }
        int numeroChefe = 100;
        for (int i = 0; i < numeros.length; i++) {
            novo[i] = numeros[i];
        }
        novo[4] = numeroChefe;
        for (int i: novo){
            System.out.println("TODOS: "+i);
        }
        */
        
        //arraylist
        /*
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Mateus");
        nomes.add("Thayna");
        nomes.add("Teresa");
        nomes.add("Claudio");
        System.out.println(nomes);
        nomes.add(2, "Lucas");
        System.out.println(nomes);
        if(nomes.contains("Thayna")){
            System.out.println("Tem a Thayna na lista");
        }
        //pegar item na lista pelo índice
        System.out.println("Terceiro nome: " + nomes.get(2));
        System.out.println("Posicao da Teresa: " + nomes.indexOf("Teresa"));
        nomes.remove("Mateus");
        System.out.println(nomes);
        
        //alterar item
        nomes.set(0, "Thay");
        System.out.println(nomes);
        System.out.println("Quantidade de itens na lista: " + nomes.size());
        */
        
        Fornecedor f1 = new Fornecedor();
        f1.setNome("HP");
        Produto p1 = new Produto();
        p1.setNome("Notebook");
        f1.setProduto(p1);
        Produto p2 = new Produto();
        p2.setNome("caneta");
        f1.setProduto(p2);
        Produto p3 = new Produto();
        p3.setNome("Mouse");
        f2.setProduto(p3);
        
        /*DESISTI*/
        
 {
            
        }
    }
}
