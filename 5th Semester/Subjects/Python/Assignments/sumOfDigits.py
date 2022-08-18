#Program to count the occurrences of given number

n=int(input("Enter a number:"))         #This takes a number
total=0
while(n>0):
    dig=n%10                            #Storing the last digit of the number in dig variable
    total=total+dig                     
    n=n//10                             #Removing the last digit from the number
print("The total sum of digits is:",total)