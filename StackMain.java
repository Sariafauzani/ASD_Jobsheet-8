import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        Stack stk = new Stack(5);

        Scanner sc26 = new Scanner(System.in);
        char pilih;
        do {
            System.out.println("Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.print("Pilih operasi (1/2/3/4): ");
            int choice = sc26.nextInt();
            sc26.nextLine(); // membaca karakter new line

            switch (choice) {
                case 1:
                    System.out.print("Jenis: ");
                    String jenis = sc26.nextLine();
                    System.out.print("Warna: ");
                    String warna = sc26.nextLine();
                    System.out.print("Merk: ");
                    String merk = sc26.nextLine();
                    System.out.print("Ukuran: ");
                    String ukuran = sc26.nextLine();
                    System.out.print("Harga: ");
                    double harga = sc26.nextDouble();
                    sc26.nextLine(); // membaca karakter new line

                    Pakaian26 p = new Pakaian26(jenis, warna, merk, ukuran, harga);
                    stk.push(p);
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.peek();
                    break;
                case 4:
                    Pakaian26 maxPakaian = stk.getMax();
                        if (maxPakaian != null) {
                            System.out.println();
                            System.out.println("Pakaian dengan harga tertinggi:");
                            System.out.println(maxPakaian.jenis + " " + maxPakaian.warna + " " + maxPakaian.merk +
                            " " + maxPakaian.ukuran + " " + maxPakaian.harga);
                        }
                    stk.print();
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            
            System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
            pilih = sc26.nextLine().charAt(0);
        } while (pilih == 'y' || pilih == 'Y');

        
        sc26.close();
    }
}
