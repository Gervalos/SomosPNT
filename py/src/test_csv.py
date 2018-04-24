import pandas as pd
from pprint import pprint
from src.mongo_db_managment import MongoDB

ruta = r'C:\Users\Gorra\Desktop\csv.csv'
ruta2 = r'C:\Users\Gorra\Desktop\sample.csv'

db = MongoDB()

def _leerRuta():
    return pd.read_csv(ruta2, encoding = 'latin')

def _mostrarLista(listCampos):
    for item in listCampos:
        print(item)  

def run():
    listCampos = _leerRuta()
    print(listCampos['Computadora'])
    print('')
    print('El promedio es', listCampos['Computadora'].mean())
    
    df = pd.DataFrame(listCampos)
    
    data = df.to_dict(orient = 'records')
    
    pprint(data)
    
    #db.insert_one(data[0])

if __name__ == '__main__':
    run()
