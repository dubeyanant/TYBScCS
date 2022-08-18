import nltk
nltk.download('vader_lexicon')

from nltk.sentiment.vader import SentimentIntensityAnalyzer

vader_analyzer=SentimentIntensityAnalyzer()

text1="I saw the movie yesterday. The animation was really good but the script was ok."
print(vader_analyzer.polarity_scores(text1))

text2="I enjoy listening to music."
print(vader_analyzer.polarity_scores(text2))

