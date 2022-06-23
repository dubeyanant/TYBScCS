import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LogisticRegression
from sklearn import preprocessing
from sklearn.metrics import accuracy_score, classification_report
from matplotlib import pyplot as plt

data = pd.read_csv("Iris.csv")

print("BASIC INFO")
print('Iris-setosa')
setosa = data['Species'] == 'Iris-setosa'
print(data[setosa].describe())
print('\nIris-versicolor')
setosa = data['Species'] == 'Iris-versicolor'
print(data[setosa].describe())
print('\nIris-virginica')
setosa = data['Species'] == 'Iris-virginica'
print(data[setosa].describe())

data.drop_duplicates(inplace = True)

X = data.iloc[:, 1:4].values
y = data.Species


from sklearn.model_selection import train_test_split
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.3, random_state=0)

scaler = preprocessing.StandardScaler().fit(X_train)
X_train_scaled = scaler.transform(X_train)

model = LogisticRegression()
model.fit(X_train_scaled, y_train)

X_test_scaled = scaler.transform(X_test)
y_pred = model.predict(X_test_scaled)

print()
train_acc = model.score(X_train_scaled, y_train)
print("The Accuracy for Training Set is {}".format(train_acc*100))
print()
test_acc = accuracy_score(y_test, y_pred)
print("The Accuracy for Test Set is {}".format(test_acc*100))
print()
print(classification_report(y_test, y_pred))
print()
print()
print("Predicted Test")
print(y_pred)
print()
print("Actual Test")
print(y_test)
