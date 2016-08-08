# -*- coding: utf-8 -*-
"""
Created on Sat Jul  2 20:28:57 2016

@author: Pashabhai
"""

from sklearn.datasets import load_iris
from sklearn import tree


iris = load_iris()
print ('features',iris.feature_names)
print('labels',iris.target_names)

print('data ',iris.data[0])
print('label',iris.target[0])
for i in range(len(iris.target)):
    j=0
    #print(" example %d: label %s, features %s "% (i,iris.target[i],iris.data[i]))    
      
clf =  tree.DecisionTreeClassifier()
clf = clf.fit(iris.data,iris.target)
print('random test od data',clf.predict([[ 6.7 , 3.1,  5.6,  2.4] ]))

# viz code

from sklearn.externals.six import StringIO  
import pydot 
dot_data = StringIO() 
tree.export_graphviz(clf, out_file=dot_data) 
graph = pydot.graph_from_dot_data(dot_data.getvalue()) 
graph.write_pdf("iris.pdf")    