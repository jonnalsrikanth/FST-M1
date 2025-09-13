def sum(n):
    if n:
        #Recursive function call
        return n+sum(n-1)
    else:
        return(0)

res=sum(10)
print(res)
