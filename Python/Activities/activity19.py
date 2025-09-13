import pandas as pd
from pandas import ExcelWriter
	
# Create a dictionary that will be used to create the DataFrame
data = {
	'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

df=pd.DataFrame(data)
print(df)

# Write the dataframe to a Excel file
writer=ExcelWriter("./activities/sample1.xlsx")
df.to_excel(writer,'Sheet1')

# Commit data to the Excel file
writer.close()


