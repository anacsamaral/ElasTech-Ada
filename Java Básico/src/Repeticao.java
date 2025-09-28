public class Repeticao {
    public static void main(String[] args) {
        System.out.println("=====WHILE=====");
        int i = 0;
        while(i < 5){
            System.out.printf("Valor de i: [%d]\n",i);
            i++;
        }

        System.out.println("=====DO-WHILE=====");
        i = 0;
        do{
            System.out.printf("Valor de i: [%d]\n",i);
            i++;
        }while(i < 5);

        System.out.println("=====FOR=====");
        for(i = 0; i < 5;i++){
            System.out.printf("Valor de i: [%d]\n",i);
        }
    }
}
