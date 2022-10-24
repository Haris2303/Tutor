# Logika boolean / gerbang logika
# AND, OR, NOT, XOR

# AND
print("========Logika AND=========")
a = False
b = False
c = a and b
print("data C =", c)

a = False
b = True
c = a and b
print("data c =", c)

a = True
b = False
c = a and b
print("data c =", c)

a = True
b = True
c = a and b
print("data c =", c)

print("---------------------------------\n")

# OR
print("========Logika OR=========")
m = False
n = False
o = m or n
print("data o =", o)

m = False
n = True
o = m or n
print("data o =", o)

m = True
n = False
o = m or n
print("data o =", o)

m = True
n = True
o = m or n
print("data o =", o)

print("---------------------------------\n")

# NOT
print("========Logika NOT=========")
p = False
q = not p
print("data q =", q)

p = True
q = not p
print("data q =", q)

print("---------------------------------\n")

# XOR
print("========Logika XOR=========")
x = False
y = False
z = x ^ y
print("data z =", z)

x = False
y = True
z = x ^ y
print("data z =", z)

x = True
y = False
z = x ^ y
print("data z =", z)

x = True
y = True
z = x ^ y
print("data z =", z)