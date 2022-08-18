#Program to replace all occurrences of 'p' with '$' in the given string

string=input("Enter string:")           #This will take a string an store it in a variable
string=string.replace('p','$')          #This and the subsequent line of code will replace p with $
string=string.replace('P','$')
print("Modified string:", string)      #This will print the modified string