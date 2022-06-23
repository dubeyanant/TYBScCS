
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

dataset = pd.DataFrame(np.random.randint(0,100, size=(500,2)), columns=list(['NEWSPAPER', 'SALES']))
print(dataset)


dataset.plot(x='NEWSPAPER', y='SALES', style='o')
plt.title('NEWSPAPER VS SALES')
plt.xlabel('NEWSPAPER')
plt.ylabel('SALES')
plt.show()

X = dataset.iloc[:, :-1].values
y = dataset.iloc[:, 1].values

from sklearn.model_selection import train_test_split
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.3, random_state=0)

from sklearn.linear_model import LinearRegression
regressor = LinearRegression()
regressor.fit(X_train, y_train)

print("INTERCEPT")
print(regressor.intercept_)

print("COEFF")
print(regressor.coef_)

y_pred = regressor.predict(X_test)
df = pd.DataFrame({'Actual': y_test, 'Predicted': y_pred})
print("Y PRED AND Y ACTUAL")
print(df)

from sklearn import metrics
print('Mean Absolute Error:', metrics.mean_absolute_error(y_test, y_pred))
print('Mean Squared Error:', metrics.mean_squared_error(y_test, y_pred))
print('Root Mean Squared Error:', np.sqrt(metrics.mean_squared_error(y_test, y_pred)))


plt.scatter(X_train,y_train,color="blue") # Plot a graph with X_train vs y_train
plt.plot(X_train,regressor.predict(X_train),linewidth=3) # Regressior line showing
plt.title('Regression(training Set)')
plt.xlabel('NEWSPAPER')
plt.ylabel('Sales')
plt.show()

plt.scatter(X_test,y_test,color="blue") # Plot a graph with X_train vs y_train
plt.plot(X_train,regressor.predict(X_train),linewidth=3) # Regressior line showing
plt.title('Regression(test Set)')
plt.xlabel('NEWSPAPER')
plt.ylabel('Sales')
plt.show()
