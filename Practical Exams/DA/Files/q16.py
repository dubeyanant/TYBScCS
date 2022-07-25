

from nltk.tokenize import sent_tokenize 
from nltk.tokenize import word_tokenize
import nltk
text ="Hear me, Subjects of Ymir " + \
       "My name is Eren Yeager." + \
       "I'm adressing my fellow Subjects of Ymir, " + \
       "speaking to you directly through the power of the Founder. " + \
       "All the walls on the island of Paradis have crumbled to the ground " + \
       "and the legions of Titans burried within have begun their march." 

import matplotlib.pyplot as plt
from wordcloud import WordCloud
wordcloud = WordCloud(collocations = False, background_color = 'white').generate(text)
plt.imshow(wordcloud, interpolation='bilinear')
plt.axis("off")
plt.show()

print()
print()
print(sent_tokenize(text))
print()
print()
print(word_tokenize(text))
