import  java.util.Scanner;
public class etkinlikOneri {
    public static void main(String[] args) {
        double sicaklik = 0.0;
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("Hava kaç derece?");
            sicaklik = scanner.nextDouble();
            if (sicaklik < 5) {
                System.out.println("Kayak yapabilrsin");
            } else if (sicaklik < 15) {
                System.out.println("Sinemaya gidebilirsin");
            } else if (sicaklik < 25) {
                System.out.println("Pikniğe gidebilirsin");
            } else {
                System.out.println("Yüzmeye gidebilirsin");

            }
        }
    }
}
