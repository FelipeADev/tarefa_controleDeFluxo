import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calculoMedia();

    }
    private static void calculoMedia() {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite as suas 4 notas: ");

        Float nota1 = Float.valueOf(s.next());
        Float nota2 = Float.valueOf(s.next());
        Float nota3 = Float.valueOf(s.next());
        Float nota4 = Float.valueOf(s.next());
        float media = (nota1 +nota2 + nota3 + nota4) / 4;
        System.out.println("Sua média é: " + media);

        if(media >= 7 && media <=10){
            System.out.println("Você está aprovado!");
            }
        else if (media >= 5 && media < 7) {
            System.out.println("Você está de recuperação!");
            }
        else if (media < 5) {
            System.out.println("Você está de reprovado!");
            }
        }
    }