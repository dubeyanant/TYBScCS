#writig code to use functions

'''def multiply(x, y):
    return x*y'''

multiply = lambda x, y: x*y

n1 = int(input("Enter a number: "))
n2 = int(input("Enter second number: "))

print("Multiplication of", n1,"and", n2,"is", multiply(n1,n2))