import java.util.*;

public class Mahasiswa {

    public static void main(String args[]) {
        Mahasiswa app = new Mahasiswa();
        Scanner sc = new Scanner(System.in);
        while(true) {
            app.printMenu();
            int pilihan = sc.nextInt();
            switch(pilihan) {
                case 1:
                    System.out.println("Tambah Data Mahasiswa");
                    app.addData();
                    break;
                case 2:
                    System.out.println("Ubah Data Mahasiswa");
                    app.ubahData();
                    break;
                case 3:
                    System.out.println("Hapus Data Mahasiswa");
                    app.hapusData();
                    break;
                case 4:
                    System.out.println("List Data Mahasiswa");
                    app.listData();
                    break;
                case 5:
                    return;
            }
        }
    }

    public void hapusData() {
       
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Silahkan Pilih Data ke :"); int idx = sc.nextInt();
        Operasi.removeData(idx-1);
    }

    public void ubahData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Silahkan Pilih Data Ke :"); int idx = Integer.parseInt(sc.nextLine());
        System.out.println("=====================");
        System.out.print("NIM : "); String nim = sc.nextLine();
        System.out.print("Nama : "); String nama = sc.nextLine();
        System.out.print("Kelas : "); String kelas = sc.nextLine();
        System.out.print("Program Studi : "); String program_Studi = sc.nextLine();
        System.out.print("Alamat : "); String alamat = sc.nextLine();
        
        Operasi.editData(new Data(nim, nama, kelas, program_Studi, alamat), idx-1);
    }

    public void listData() {
        List<Data> result = Operasi.getListData();1
        for(int i=0; i<result.size(); i++) {
            System.out.println();
            System.out.println("Ini Data ke :" + (i+1));
            System.out.println("  NIM : " + result.get(i).getNim());
            System.out.println("  Nama : " + result.get(i).getNama());
            System.out.println("  Kelas : " + result.get(i).getKelas());
            System.out.println("  Program_Studi : " + result.get(i).getProgram_Studi());
            System.out.println("  Alamat : " + result.get(i).getAlamat());
        }
    }

    public void addData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Masukkan NIM : "); String nim = sc.nextLine();
        System.out.print("Masukkan Nama : "); String nama = sc.nextLine();
        System.out.print("Masukkan Kelas : "); String kelas = sc.nextLine();
        System.out.print("Masukkan Program_Studi : "); String program_studi = sc.nextLine();
        System.out.print("Masukkan Alamat : "); String alamat = sc.nextLine();
        Operasi.addData(new Data(nim, nama, kelas, program_studi, alamat));
    }

    public void printMenu() {
        System.out.println();
        System.out.println("||=========================================||");
        System.out.println("||         SELAMAT DATANG DISINI           ||");
        System.out.println("|| INI ADALAH APLKASI INPUT DATA MAHASISWA ||");
        System.out.println("||=========================================||");
        System.out.println("||=========================================||");
        System.out.println("|| 1. Tambah Data Mahasiswa                ||");
        System.out.println("|| 2. Ubah Data Mahasiswa                  ||");
        System.out.println("|| 3. Hapus Data Mahasiswa                 ||");
        System.out.println("|| 4. Lihat Data Mahasiswa                 ||");
        System.out.println("|| 5. Keluar                               ||");
         System.out.println("||=========================================||");
        System.out.print("Masukkan Pilihan Anda : ");
    }

}