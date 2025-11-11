package Java17I;

public class ExemploTextBlock {
    public static void main(String[] args) {
        String sql = """
                SELECT id, name, age FROM users
                WHERE age > 18
                ORDER BY name
                """;

        System.out.println(sql);
    }
}
