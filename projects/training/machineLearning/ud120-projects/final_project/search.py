import re
import pandas


enron_data = pandas.read_pickle('../final_project/final_project_dataset.pkl')

def rat(str):
for key in enron_data:
    m = re.search(str,key)
    if m is not None:
        print key
