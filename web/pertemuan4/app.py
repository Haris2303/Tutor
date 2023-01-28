# segitiga pascal

def pascal_triangle(n):
    result = [[1] * (i + 1) for i in range(n)]
    for i in range(n):
        for j in range(1, i):
            result[i][j] = result[i-1][j-1] + result[i-1][j]
    return result

# Example usage
inputUser = int(input("Masukkan angka: "))
for row in pascal_triangle(inputUser):
  print(row)