import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calculoMedia();

    }
    private static void calculoMedia() {
        float nota1 = 7;
        float nota2 = 8;
        float nota3 = 6;
        float nota4 = 8;
        float media = (nota1 +nota2 + nota3 + nota4) / 4;
        System.out.println("Sua média é: " + media);

        if(media >= 7 || media <= 10){
            System.out.println("Você está aprovado!");
            }
        else if (media >= 5 || media < 7) {
            System.out.println("Você está de recuperação!");
            }
        else if (media < 5) {
            System.out.println("Você está de reprovado!");
            }
        }
    }