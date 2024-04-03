package kao;

public class MainEx1 {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Joao","Masculino",21,false);
        Pessoa pessoa2 = new Pessoa("Kaily","Feminina",21,false);
        Pessoa pessoa3 = new Pessoa("Renato","Masculino",10,true);
        Pessoa pessoa4 = new Pessoa("Juliana","Feminino",3,false);
        
        Churrasco churrasco = new Churrasco(0);
        
        churrasco.verificarConsumo(pessoa1);
        churrasco.verificarConsumo(pessoa2);
        churrasco.verificarConsumo(pessoa3);
        churrasco.verificarConsumo(pessoa4);
        
        double quantidadeTotalCarne = churrasco.getQtCarne();

        System.out.println("Quantidade total de carne consumida: " + quantidadeTotalCarne + " quilos");
    }
}