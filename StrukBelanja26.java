public class StrukBelanja26 {
    String nomorTransaksi;
    String tglPembelian;
    int jmlBarang;
    double totalHrgBayar;

    public StrukBelanja26(String nomorTransaksi, String tglPembelian, int jmlBarang, double totalHrgBayar){
        this.nomorTransaksi = nomorTransaksi;
        this.tglPembelian = tglPembelian;
        this.jmlBarang = jmlBarang;
        this.totalHrgBayar = totalHrgBayar;
    }

    public String toString() {
        System.out.println("-----------------------------------------");
        return "Nomor Transaksi: " + nomorTransaksi + "\n" +
                "Tanggal Pembelian: " + tglPembelian + "\n" +
                "Jumlah Barang: " + jmlBarang + "\n" +
                "Total Harga Bayar: " + totalHrgBayar + " ";
    }
}