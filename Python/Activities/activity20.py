import pandas as pd
df=pd.read_excel("./activities/sample1.xlsx")
#Excel data is stored as Dictionary in df, columns being as keys & rows will be values in a LIST
print(df)
print("data read")
# Print the number of rows and columns
print("no of rows & colmns ", df.shape)
#prints all the values under the key Email
print(df['Email'])
print(df['PhoneNumber'])
#prints the value of key "FirstName" having the index 1 from the list
print(df['FirstName'])
# Sort the data based on FirstName in ascending order and print the data
print(df.sort_values('FirstName')['FirstName'])
