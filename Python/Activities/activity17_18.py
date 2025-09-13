import pandas as pd # pd is a alias name like shortcut
#create data to input to the excel
data ={
    "usernames":["srikanth","babu","ram"],
    "passwords":["pass1","pass2","pass3"]
}

#convert data into dataframe
df = pd.DataFrame(data)

#write data into csv. If we use index=False in below statement, index column will not be created in csv file
df.to_csv("./Activities/sample.csv") #.represents current folder, .. represents parent folder

#read the file
input_data=pd.read_csv("./Activities/sample.csv")
print(input_data)
print(input_data["usernames"]) #prints usernames
#prints usernames, password of 2nd row
print(input_data["usernames"][1],input_data["passwords"][1]) 
#sort the values, by default it sorts in Ascending
print(input_data.sort_values("usernames"))
print(input_data.sort_values("passwords"))
#print in decending order
print(input_data.sort_values("usernames",ascending=False))


