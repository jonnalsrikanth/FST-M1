def fib(num):
    if num <= 1:
        return num
    else:
        return (fib(num-1)+fib(num-2)) 

input_num = int(input("enter a postive number: "))

if input_num < 1:
    print("enter positive number")
else:
    for i in range(input_num):
        print(fib(i))


        