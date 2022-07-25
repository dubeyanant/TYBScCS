
import pandas as pd

df = pd.read_csv('Fish.csv')

print(df)
X = df.drop(['Weight', 'Species'], axis=1)

y = df['Weight']

from sklearn.model_selection import train_test_split
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size = 0.33, random_state=101)

from sklearn.linear_model import LinearRegression
lr = LinearRegression()
lr.fit(X_train, y_train)

LinearRegression(copy_X=True, fit_intercept=True, n_jobs=None, normalize=False)
lr.score(X_test, y_test)
df_t = df.copy()

df_t['Predicted Weight'] = lr.predict(df_t.drop(['Weight', 'Species'], axis=1))
df_t['Difference'] = df_t['Weight'] - df_t['Predicted Weight']
df_t[['Weight', 'Predicted Weight', 'Difference']].head(20)
