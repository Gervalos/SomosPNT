from pprint import pprint
from pymongo import MongoClient
from pymongo import ReturnDocument
from bson.objectid import ObjectId

class MongoDB:

    def __init__(self):
        self.client = MongoClient('localhost', 27017)
        self.db = self.client['mongotest']
        self.colletion = self.db['testcollection']
    
    def insert_one(self, document):
        self.colletion.insert_one(document)
    
    def insert_many(self, documents):
        self.colletion.insert_many(documents)
    
    def find_all(self):
        return self.colletion.find({})