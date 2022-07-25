import numpy as np
import matplotlib.pyplot as plt
import pandas as pd
from apyori import apriori

store_data = pd.read_csv("groceries.csv", header = None)
print(store_data.head())
print(store_data.shape)

transactions=[]  
for i in range(0, 7501):  
    transactions.append([str(store_data.values[i,j])  for j in range(0,20)]) 

rules= apriori(transactions= transactions, min_support=0.003, min_confidence = 0.2, min_lift=3, min_length=2, max_length=2)  
association_rules = list(rules)

print(len(association_rules))

#display 1 record
print(association_rules[0])


