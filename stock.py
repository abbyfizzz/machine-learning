import pandas
import quandl

df = quandl.get('WIKI/GOOGL')  #data frame --df
print(df.head())
