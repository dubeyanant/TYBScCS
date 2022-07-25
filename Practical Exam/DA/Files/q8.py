

from nltk.tokenize import sent_tokenize 
from nltk.tokenize import word_tokenize
import nltk
nltk.download('all')
text ="Hear me, Subjects of Ymir " + \
       "My name is Eren Yeager." + \
       "I'm adressing my fellow Subjects of Ymir, " + \
       "speaking to you directly through the power of the Founder. " + \
       "All the walls on the island of Paradis have crumbled to the ground " + \
       "and the legions of Titans burried within have begun their march." 


frequency_distribution=FreqDist(tokenized_words)
print(frequency_distribution)
print()
print()
print(sent_tokenize(text))
print()
print()
print(word_tokenize(text))

import matplotlib.pyplot as plt
frequency_distribution.plot(73,cumulative=False)
plt.show()

