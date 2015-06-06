import java.io.*;
import java.util.Scanner;

public class TestRuangKelas {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		KontrolRuangKelas Test2 = new KontrolRuangKelas();

		System.out.println("\n>>>>HASIL LOAD<<<<");

		try {
			File load = new File("save_IdentitasRuangKelas.txt");
			FileReader read = new FileReader(load);
			BufferedReader reader = new BufferedReader(read);

			String Membaca = null;
			while ((Membaca = reader.readLine()) != null) {
				System.out.println(Membaca);
			}
			reader.close();

		} catch (FileNotFoundException u) {
			System.out.println("file tidak bisa ditemukan");
		} catch (Exception fail) {
			System.out.println(">>>>GAGAL LOAD<<<<" + fail);
		}

		System.out.println("\n>>>>HASIL LOAD<<<<");

		try {
			File load = new File("save_Perhitungan.txt");
			FileReader read = new FileReader(load);
			BufferedReader reader = new BufferedReader(read);

			String Membaca = null;
			while ((Membaca = reader.readLine()) != null) {
				System.out.println(Membaca);
			}
			reader.close();

		} catch (FileNotFoundException u) {
			System.out.println("file tidak bisa ditemukan");
		} catch (Exception fail) {
			System.out.println(">>>>GAGAL LOAD<<<<" + fail);
		}

		System.out.println("\n>>>>HASIL LOAD<<<<");

		try {
			File load = new File("save_TambahPerhitungan.txt");
			FileReader read = new FileReader(load);
			BufferedReader reader = new BufferedReader(read);

			String Membaca = null;
			while ((Membaca = reader.readLine()) != null) {
				System.out.println(Membaca);
			}
			reader.close();

		} catch (FileNotFoundException u) {
			System.out.println("file tidak bisa ditemukan");
		} catch (Exception fail) {
			System.out.println(">>>>GAGAL LOAD<<<<" + fail);
		}

		System.out.println("\n>>>>HASIL LOAD<<<<");

		try {
			File load = new File("save_KondisiRuangKelas.txt");
			FileReader read = new FileReader(load);
			BufferedReader reader = new BufferedReader(read);

			String Membaca = null;
			while ((Membaca = reader.readLine()) != null) {
				System.out.println(Membaca);
			}
			reader.close();

		} catch (FileNotFoundException u) {
			System.out.println("file tidak bisa ditemukan");
		} catch (Exception fail) {
			System.out.println(">>>>GAGAL LOAD<<<<" + fail);
		}

		System.out.println("\n>>>>HASIL LOAD<<<<");

		try {
			File load = new File("save_JumlahKondisiDanPosisiSarana.txt");
			FileReader read = new FileReader(load);
			BufferedReader reader = new BufferedReader(read);

			String Membaca = null;
			while ((Membaca = reader.readLine()) != null) {
				System.out.println(Membaca);
			}
			reader.close();

		} catch (FileNotFoundException u) {
			System.out.println("file tidak bisa ditemukan");
		} catch (Exception fail) {
			System.out.println(">>>>GAGAL LOAD<<<<" + fail);
		}

		System.out.println("\n>>>>HASIL LOAD<<<<");

		try {
			File load = new File("save_LingkunganRuangKelas.txt");
			FileReader read = new FileReader(load);
			BufferedReader reader = new BufferedReader(read);

			String Membaca = null;
			while ((Membaca = reader.readLine()) != null) {
				System.out.println(Membaca);
			}
			reader.close();

		} catch (FileNotFoundException u) {
			System.out.println("file tidak bisa ditemukan");
		} catch (Exception fail) {
			System.out.println(">>>>GAGAL LOAD<<<<" + fail);
		}

		System.out.println("\n>>>>HASIL LOAD<<<<");

		try {
			File load = new File("save_KebersihanRuangKelas.txt");
			FileReader read = new FileReader(load);
			BufferedReader reader = new BufferedReader(read);

			String Membaca = null;
			while ((Membaca = reader.readLine()) != null) {
				System.out.println(Membaca);
			}
			reader.close();

		} catch (FileNotFoundException u) {
			System.out.println("file tidak bisa ditemukan");
		} catch (Exception fail) {
			System.out.println(">>>>GAGAL LOAD<<<<" + fail);
		}

		System.out.println("\n>>>>HASIL LOAD<<<<");

		try {
			File load = new File("save_KenyamananRuangKelas.txt");
			FileReader read = new FileReader(load);
			BufferedReader reader = new BufferedReader(read);

			String Membaca = null;
			while ((Membaca = reader.readLine()) != null) {
				System.out.println(Membaca);
			}
			reader.close();

		} catch (FileNotFoundException u) {
			System.out.println("file tidak bisa ditemukan");
		} catch (Exception fail) {
			System.out.println(">>>>GAGAL LOAD<<<<" + fail);
		}

		System.out.println("\n>>>>HASIL LOAD<<<<");

		try {
			File load = new File("save_KeamananRuangKelas.txt");
			FileReader read = new FileReader(load);
			BufferedReader reader = new BufferedReader(read);

			String Membaca = null;
			while ((Membaca = reader.readLine()) != null) {
				System.out.println(Membaca);
			}
			reader.close();

		} catch (FileNotFoundException u) {
			System.out.println("file tidak bisa ditemukan");
		} catch (Exception fail) {
			System.out.println(">>>>GAGAL LOAD<<<<" + fail);
		}

		Test2.IdentitasRuangKelas();
		Test2.Perhitungan();
		Test2.TambahPerhitungan();
		Test2.KondisiRuangKelas();
		Test2.JumlahKondisiDanPosisiSarana();
		Test2.LingkunganRuangKelas();
		Test2.KebersihanRuangKelas();
		Test2.KenyamananRuangKelas();
		Test2.KeamananRuangKelas();

		Test2.Analisis();
		Test2.Output();

	}
}
