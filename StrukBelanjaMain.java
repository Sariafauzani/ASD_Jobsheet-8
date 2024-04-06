import java.util.Scanner;

public class StrukBelanjaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StrukStack strukStack = new StrukStack();

        strukStack.push(new StrukBelanja26("123", "24-01-2024", 5, 250000));
        strukStack.push(new StrukBelanja26("124", "10-01-2024", 3, 150000));
        strukStack.push(new StrukBelanja26("130", "12-02-2024", 4, 80000));
        strukStack.push(new StrukBelanja26("26", "03-03-2024", 1, 25000));
        strukStack.push(new StrukBelanja26("111", "25-03-2024", 4, 105000));
        strukStack.push(new StrukBelanja26("100", "12-02-2024", 5, 160000));
        strukStack.push(new StrukBelanja26("27", "13-01-2024", 3, 110000));
        strukStack.push(new StrukBelanja26("30", "08-02-2024", 2, 75000));

        System.out.println("=================================================================");
        System.out.println("           Informasi Struk Belanja yang masih tersimpan          ");
        System.out.println("=================================================================");
        strukStack.print();

        System.out.println("=================================================================");
        System.out.print("Masukkan jumlah struk yang akan ditukarkan dengan voucher: ");
        int jumlahStrukDitukarkan = scanner.nextInt();

        jumlahStrukDitukarkan = Math.min(strukStack.size(), jumlahStrukDitukarkan);
        for (int i = 0; i < jumlahStrukDitukarkan; i++) {
            if (!strukStack.isEmpty()) {
                System.out.println(strukStack.pop());
            } else {
                System.out.println("Stack kosong, tidak ada struk yang bisa ditukarkan.");
                break; 
            }
        }

        System.out.println();
        System.out.println("=================================================================");
        System.out.println("      Sisa struk belanja yang masih tersimpan di dalam stack     ");
        System.out.println("=================================================================");
        strukStack.print();

        scanner.close();
    }
}
