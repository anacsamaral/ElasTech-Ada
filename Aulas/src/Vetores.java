public class Vetores {
    public static void main(String[] args) {
        int[] numeros = new int[3];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        for(int num : numeros){
            System.out.println(num);
        }
    }
}
