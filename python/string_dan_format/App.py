# pengenalan string

# string itu bisa dengan tanda (') atau (")

nama_depan = 'Mario '
nama_belakang = "Bambang"

print(nama_depan)
print(nama_belakang)

nama_lengkap = nama_depan + nama_belakang
print(nama_lengkap)

# panjang string
panjang_nama = len(nama_lengkap)
print(panjang_nama)

cekKata = "Bam" in nama_lengkap
print(cekKata)


# format
print("Teman dia " + nama_belakang)
print(f"Teman saya {nama_lengkap}")

uangSaku = 1000000
print(f'Uang saya ada {uangSaku}')
print(f'Uang saya ada {uangSaku:,}')