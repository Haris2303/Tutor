# Membuat kalkulator Sederhana
print("==== Kalkulator Sederhana ====")

# input angka dan operator
angka1 = int(input("Masukkan angka pertama: "))
aritmatika = input("Masukkan Operator MTK: ")
angka2 = int(input("Masukkan angka kedua: "))

# pengecekkan dan hasil
if aritmatika == "+": print(f"Hasil dari {angka1} + {angka2} = {angka1 + angka2}")
elif aritmatika == '-': print(f"Hasil dari {angka1} - {angka2} = {angka1 - angka2}")
elif aritmatika == '*': print(f"Hasil dari {angka1} * {angka2} = {angka1 * angka2}")
elif aritmatika == '/': print(f"Hasil dari {angka1} / {angka2} = {angka1 / angka2}")
else : print("Operator yang anda masukkan tidak diketahui!")