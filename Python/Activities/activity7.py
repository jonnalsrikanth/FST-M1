mylist = input("enter the numbers")
mylist = mylist.split(",")
print(mylist)
#mylist = int(mylist)
i=j=0
for i in mylist:
    i=int(i)
    j=j+i
print(f"Sum of all numbers given is {j}")
