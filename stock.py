import pandas as p
import quandl

df = quandl.get('WIKI/GOOGL')
print(df.head)