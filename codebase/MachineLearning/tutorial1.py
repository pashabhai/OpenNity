# -*- coding: utf-8 -*-
"""
Created on Sat Jul  2 19:52:23 2016

@author: Pashabhai
"""
# this tutorial show how to use trained data and run predictions
# https://www.youtube.com/watch?v=tNa99PG8hR8
# 1 for smooth surface, 0 for rough surface
# 0 for apple , 1 for oranges
from sklearn import tree
features = [ [140, 1],[130,1], [150,0] ,[170,0]]
labels = [0,0,1,1]
clf = tree.DecisionTreeClassifier()
clf = clf.fit(features,labels)
print('fruit is ',clf.predict([[150,0]]))
 
 