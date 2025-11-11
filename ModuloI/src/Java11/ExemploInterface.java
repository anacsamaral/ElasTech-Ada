package Java11;

public interface ExemploInterface {
    default void metodoDefault(){
        System.out.println("Método Default");
        auxiliarPrivado();
    }

    private void auxiliarPrivado(){
        System.out.println("Método Privado");
    }
}

class TesteInterface implements ExemploInterface{
    public static void main(String[] args) {
        var obj = new TesteInterface();
        obj.metodoDefault();
    }
}
