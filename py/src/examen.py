import pandas as pd
from pprint import pprint
from src.mongo_db_managment import MongoDB

from pandas.io.json import json_normalize

ruta = r'C:\Users\Gorra\Desktop\examen.csv'
export = r'C:\Users\Gorra\Desktop\examenExport.csv'

db = MongoDB()

def _leerRuta():
    return pd.read_csv(ruta)

def run():
    dataFrame = _leerRuta()
    
    '''
    Cambiar el indice por el de alguna columna
    dataFrame.set_index('Columna', inplace = True)
    '''
    
    busqueda = dataFrame.loc[dataFrame['city'] == 'SACRAMENTO', ['zip', 'price']]
    
    n_column = busqueda.loc[dataFrame['city'] == 'SACRAMENTO', ['zip']]
    s_column = busqueda.loc[dataFrame['city'] == 'SACRAMENTO', ['price']]
    

    busqueda['prom'] = (s_column['price'] + n_column['zip']) / 2
    
    #print(busqueda['prom'].describe())
    
    #busqueda = busqueda.to_dict(orient = 'records')
    
    #db.insert_many(busqueda)
    
    todo = db.find_all()
    
    todo = pd.DataFrame(list(todo))
    
    todo2 = todo['address'][0]
    
    pprint(todo2)
    
    todo2['coord'].append(-80114444)
    todo2['zipcode'] = int(todo2['zipcode'])
    todo2['zipcode'] = [todo2['zipcode']]
    todo2['zipcode'].append(15024)
    #pprint(todo2)
    
    #todo2.set_index(['building'], inplace = True)
    
    #todo2 = todo2.to_json(orient = 'columns')
    
    #todo2 = todo2.groupby(['building'])[['coord']].sum()
    
    db.insert_one(todo2)
    
    pprint(todo2)
    
    '''
    Importar a CSV
    busqueda.reset_index().to_csv(export, header = True, index = False)
    
    Recorrer columna de un dataFrame
    for index, row in dataFrame.iterrows():
        print(row['zip'])
    '''

if __name__ == '__main__':
    run()