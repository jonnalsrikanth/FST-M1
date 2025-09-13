# new_tuple=(30,40,51,65,77)

# for i in new_tuple:
#     if (i%5==0):
#         print (i)

#input will always be a list with string type
input_nums = input("enter 5 numbers seperated by ,: ")
#spliting the values using the delimiter ,
new_list = input_nums.split(",") 
#converting the list to tuple
new_tuple = tuple(new_list)

for i in new_tuple:
    #converting the value to int from string before checking
    if int(i)%5 == 0:
        print(i)
        

