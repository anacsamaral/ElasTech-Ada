package JavaFuncional;

import java.util.function.Supplier;

public class ExemploSupplier {
    public static void main(String[] args) {
        Supplier<String> fornecedor =
                () -> "Sou programadora Java";
        System.out.println(fornecedor.get());
    }
}
