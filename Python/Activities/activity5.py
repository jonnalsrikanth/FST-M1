num = input("enter a number between 1 to 10 to get a multiplication table: ")
num = int(num)

for i in range(1,11):
    print(f"{num} X {i} = {num*i}")
