
/**
 * @author Guilherme Jacichen email:<gui_jaci@yahoo.com.br>
 */
public class Jogador implements Comparable <Jogador> {

    private final int numero;
    private final String nome;

    public Jogador(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return numero + " - " + nome;
    }

    @Override
    public int compareTo(Jogador o) {
        int length = nome.length();

        if(length > o.getName().length())
            length = o.getName().length();
        
        for(int i = 0; i < length; i++){
            if(nome.charAt(i) > o.getName().charAt(i))
                return 1;
            if(nome.charAt(i) < o.getName().charAt(i))
                return -1;
        }
        
        if(nome.length() < o.getName().length())
            return 1;
        if(nome.length() > o.getName().length())
            return -1;
        
        if(numero != o.getNumber())   
            return numero - o.getNumber();
        return 0;
    }

    public int getNumber() {
        return numero;
    }

    public String getName() {
        return nome;
    }
}
