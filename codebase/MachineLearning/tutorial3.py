# -*- coding: utf-8 -*-
"""
Created on Sat Jul  2 22:10:50 2016

@author: Pashabhai
"""
# https://www.youtube.com/watch?v=N9fDIAflCMY 
# tutorial to demonstrate good features selection

import numpy as np
import matplotlib.pyplot as plt
import tensorflow as tf

 
 
greyhounds = 500
labs = 500

grey_heights = 28 + 4 * np.random.randn(greyhounds)
lab_heights = 24 + 4 * np.random.randn(labs)


print('grey heights ',len(grey_heights))
#print(lab_heights)


plt.hist([grey_heights,lab_heights],stacked=True,color=['r','b'])
plt.show()