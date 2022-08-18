

from nltk.tokenize import sent_tokenize 
from nltk.corpus import stopwords
from nltk.tokenize import word_tokenize

text ="Hear me, Subjects of Ymir " + \
       "My name is Eren Yeager." + \
       "I'm adressing my fellow Subjects of Ymir, " + \
       "speaking to you directly through the power of the Founder. " + \
       "All the walls on the island of Paradis have crumbled to the ground " + \
       "and the legions of Titans burried within have begun their march." 

stop_words = set(stopwords.words('english'))
  
word_tokens = word_tokenize(text)
  
filtered_sentence = [w for w in word_tokens if not w.lower() in stop_words]
  
filtered_sentence = []
  
for w in word_tokens:
    if w not in stop_words:
        filtered_sentence.append(w)
  
print(word_tokens)
print()
print()
print(filtered_sentence)
print()
print()
print(sent_tokenize(text))
print()
print()
print(word_tokenize(text))
