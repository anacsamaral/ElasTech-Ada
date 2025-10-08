public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        byte varByte = 127;
        System.out.println(varByte);
        int varInt = 2147483;
        System.out.println(varInt);
    }
}

/* (String... args) = o varargs serve para definir
quantas variáveis eu estou recebendo no método */

// o nome args não é obrigatório

// byte = vai até o 127, pois define na memória que vai usar apenas 8 bits
// short = -32768 a 32767
// char = 0 a 65535
// int = - 2b a 2b
// long = - 9t a 9t