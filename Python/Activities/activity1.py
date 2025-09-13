#used to take input from user
name = input("enter your name: ")
age = input("enter your age: ")
#converting the string to int
age = int(age) 
years = 100-age
currentyear = 2025
# , is used for concatenation
print("you will be 100 years in :", years,"years in the year", currentyear+years)

print(f"{name} will turn 100 in {years} years") 