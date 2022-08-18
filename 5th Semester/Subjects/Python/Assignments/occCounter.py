#Program to count the occurrences of given number

count = 0

n=int(input("Enter a number: "));
num=int(input("Enter the number to find its occurance: "))

while(n>0):
    dig = n%10
    if(dig == num):
        count += 1
    n = n//10

print(count)