# -*- coding: utf-8 -*-
"""
Created on Sun Jul  3 01:42:17 2016

@author: Pashabhai
"""

import tensorflow as tf

hello= tf.constant('hello tensorflow')
session = tf.session()
print(session.run(hello))

