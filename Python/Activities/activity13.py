def sum(nums):
    #this is used for initialization and making variable as integer
    tot=0
    for num in nums:
        tot=num+tot
    return tot
    
mylist=[1,2,3,4]
res=sum(mylist)
print(f"sum of all numbers is {res}")