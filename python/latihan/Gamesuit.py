# membuat game suit

import random
print("==== Game suwit ==== ")
player = input("Masukkan [batu, gunting, kertas]: ").lower()
# komputer
komputer = ""
rand = random.randrange(0, 11)
if rand >= 0 and rand <= 3:
    komputer = "Gunting"
    # tentukan rule
    if "kertas" in player: hasil = "Kamu Kalah"
    elif "batu" in player: hasil = "Kamu menang"
    else: hasil = "Kita Seri"

elif rand > 3 and rand <= 6:
    komputer = "Kertas"
    # tentukan rule
    if "batu" in player: hasil = "Kamu kalah"
    elif "gunting" in player: hasil = "Kamu Menang"
    else: hasil = "Kita Seri"

else:
    komputer = "Batu"
    # tentukan rule
    if "kertas" in player: hasil = "Kamu Menang"
    elif "gunting" in player: hasil = "Kamu Kalah"
    else: hasil = "Kita Seri"

print(f"Saya {komputer} kamu {player} hasilnya {hasil}")