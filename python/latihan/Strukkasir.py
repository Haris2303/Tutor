# MEMBUAT STRUK BELANJA
import datetime

waktu = datetime.datetime.now().strftime("%X")
tanggal = datetime.datetime.now().strftime("%x")

# nama kasir
namaKasir = input("Masukkan nama kasir: ")

# tampilan awal
print(f"""
      PAPUA SPM & DPSTORE
      02.316.442.9-951.000
      JL.SUNGAI MARUNI KM10
          081-2567-5758
        {tanggal} {waktu}
  ============================
                ksr: {namaKasir}
  ============================
""")

tambahBarang = 'y'
totalBelanja = 0
jumlahBelanja = 0
while('y' in tambahBarang):

  # nama barang
  namaBarang = input("Masukkan nama barang: ")

  # harga barang
  hargaBarang = int(input("Masukkan harga barang: "))

  # jumlah barang
  jumlahBarang = int(input("Masukkan jumlah barang: "))

  # tampilkan barang
  print(f"""
  {namaBarang} 
  PCS   {jumlahBarang}   {hargaBarang:,}    {hargaBarang * jumlahBarang:,}
  """)

  # kalkulasi total belanja dan jumlah belanja
  totalBelanja += (hargaBarang * jumlahBarang)
  jumlahBelanja += jumlahBarang

  # tambah barang atau tidak
  tambahBarang = input("Ada barang lagi?(y/n): ")

# tampilkan total dan quatity
print(f"""
{jumlahBelanja} Item
Total Belanja   : Rp.   {totalBelanja:,}
=================================
""")

# pembayaran
pembayaran = int(input("Masukkan pembayaran: "))
print(f"Pembayaran   : Rp.   {pembayaran:,}")
kembalian = pembayaran - totalBelanja
print("--------------------------")
print(f"Kembalian    : Rp.   {kembalian:,}")

# tampilan akhir
print("""
================================
        TERIMA KASIH
  SELAMAT BERBELANJA KEMBALI
================================
""")