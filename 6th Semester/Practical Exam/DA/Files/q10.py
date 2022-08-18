import nltk
nltk.download('vader_lexicon')

from nltk.sentiment.vader import SentimentIntensityAnalyzer

vader_analyzer=SentimentIntensityAnalyzer()

text1=" I enjoy listening to music"
print(vader_analyzer.polarity_scores(text1))

text2=" I take a walk in the park everyday"
print(vader_analyzer.polarity_scores(text2))

