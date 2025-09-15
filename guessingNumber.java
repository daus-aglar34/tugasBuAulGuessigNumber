import java.util.Scanner;

public class guessingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberToGuess = (int) (Math.random() * 101); // Angka acak antara 0-100

        int userGuess = 0;

        int numberOfAttempts = 0;
        do {
            System.out.print("Tebak angka antara 0-100: ");
            userGuess = input.nextInt();

            numberOfAttempts++;

            if (userGuess < numberToGuess) {
                System.out.println("Terlalu rendah! Coba lagi.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Terlalu tinggi! Coba lagi.");
            } else if (userGuess == numberToGuess) {
                System.out.println("Selamat! Tebakan Anda benar.");
            } else if (numberOfAttempts <= 10) {
                System.out.println("Kesempatan anda sudah habis");
            }

            if (numberOfAttempts >= 10 && userGuess != numberToGuess) {
                System.out.println("Kesempatan anda sudah habis.");
                break;
            }

        } while (userGuess != numberToGuess);

        System.out.println("Permainan selesai. Angka yang benar adalah: " + numberToGuess);
        System.out.println("Jumlah tebakan Anda: " + numberOfAttempts);
        System.out.println("Terima kasih telah bermain!");

        input.close();
    }
}
