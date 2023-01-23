#import random
#Prompt the user to enter his/her name
#Display a welcome message, with game instrution
#Use loop to ask the user if he is ready to start playing. If yes, start the game. If no, end the game. Else, display invalid response
#Create an array to hold 20 questions
#import random function to randomize questions output. No question must be repeated. User should always see unique questions
#Display the questions, and use if statements to check the user's response for correctness. Check for case sensitivity.
#Show unique statements whether correct or wrong answers are supplied
#loop the game to continue until the player chooses to quit.

import random
name = input("Hello, please enter your name here: ")
start = input(f"welcome {name}. Are you ready to start playing? \nPress 'yes' to play, and 'no' to restart the game. \nYou may quit at anytime during the game ")
while (start.lower() != "yes" or start !="no"):
	if (start.lower() == "yes" or start == "no"):
		break
	print ("invalid entry")
	start = input(f"welcome {name}. Are you ready to start playing?\nPress 'yes' to play, and 'no' to restart the game.\n You may end the game at anytime during the game ")
while (start.lower() == "no"):
	start = input(f"welcome {name}. Are you ready to start playing? \nPress 'yes' to play, and 'no' to restart the game. \nYou may end the game at anytime during the game  ")
	if (start.lower() == "yes"):
		break
	else:
		print ("invalid entry")
		start = input(f"welcome {name}. Are you ready to start playing?\n Press 'yes' to play, and 'no' to restart the game.\n You may end the game at anytime during the game  ")

questions = list(range(1, 21))	
random_number = random.sample(questions, k=20)
for question in random_number:
	if question == 1:
		question1 = input("In which year did Nigeria gain independence?, \n, Type skip to skip to next question, or quit to end game  ")
		if (question1.lower() == "1960"):
			print ("correct! let's see if you will get the next right")
		elif question1 == "skip":
			continue
		elif question1 == "quit":
			break
		else:
			print("That's incorrect. \n 1960 is the answer. \n Let's see if you will get the next question right")
	
	if question == 2:
		question2 = input("The Union Jack is the flag of which country? \n Type skip to skip to next question, or quit to end game  ")
		if (question2.lower() == "england" or question2 == "the uk" or question2 == "the united kingdom" or question2 == "uk"):
			print ("That's amazing. You won!")
		elif question2 == "skip":
			continue
		elif question2 == "quit":
			break
		else:
			print("That's incorrect. The answer is England or The UK. \nLet's go again")
	
	if question == 3:
		question3 = input("Which continent is the world’s biggest continent? \n Type skip to skip to next question, or quit to end game  ")
		if (question3.lower() == "asia"):
			print ("correct! let's see if you will get the next question right")
		elif question3 == "skip":
			continue
		elif question3 == "quit":
			break
		else:
			print("That's incorrect. It is Asia. \nlet's see if you will get the next question right")
	
	if question == 4:
		question4 = input("How many local governments are there in Nigeria? \n Type skip to skip to next question, or quit to end game  ")
		if (question4.lower == "774"):
			print ("correct! You won. Unto the next question")
		elif question4 == "skip":
			continue
		elif question4 == "quit":
			break
		else:
			print("That was incorrect. 774 is the answer. \n Unto the next question")
	
	if question == 5:
		question5 = input("How many states are there in Nigeria? \nType skip to skip to next question, or quit to end game  ")
		if question5 == "36":
			print ("correct! let's see if you will get the next question right")
		elif question5 == "skip":
			continue
		elif question5 == "quit":
			break
		else:
			print("That was incorrect. There are 36 states in Nigeria. \n let's see if you will get the next question right")
	
	if question == 6:
		question6 = input("Which year did Nigeria’s first military coup take place? \nType skip to skip to next question, or quit to end game  ")
		if question6 == "1966":
			print ("correct! let's see if you will get the next question right")
		elif question6 == "skip":
			continue
		elif question6 == "quit":
			break
		else:
			print("That was incorrect. 1966 is the answer. \n let's see if you will get the next question right")
	
	if question == 7:
		question7 = input("What is the name of Nigeria’s football senior national team? The: \n Type skip to skip to next question, or quit to end game  ")
		if (question7.lower() == "super eagles"):
			print ("correct! let's see if you will get the next right")
		elif question7 == "skip":
			continue
		elif question7 == "quit":
			break
		else:
			print("That was incorrect. The answer is Super Eagles. ")
	
	if question == 8:
		question8 = input("What is Nigeria’s capital? \nType skip to skip to next question, or quit to end game  ")
		if (question8.lower() == "abuja"):
			print ("correct! let's see if you will get the next right")
		elif question8 == "skip":
			continue
		elif question8 == "quit":
			break
		else:
			print("That was incorrect. The answer is Abuja. \n Let's see if you will get the next question right")
	
	if question == 9:
		question9 = input("What is the name of Semicolon's 1-year Software Engineering program? \n Type skip to skip to next question, or quit to end game  ")
		if (question9.lower == "techpreneurship"):
			print ("correct! let's see if you will get the next right")
		elif question9 == "skip":
			continue
		elif question9 == "quit":
			break
		else:
			print("That was incorrect. The answer is Techpreneurship. Let's see if you will get the next question right")
	
	if question == 10:
		question10 = input("Which country hosted the 2022 FIFA World Cup? \n Type skip to skip to next question, or quit to end game  ")
		if (question10.lower() == "qatar"):
			print ("correct! let's see if you will get the next right")
		elif question10 == "skip":
			continue
		elif question10 == "quit":
			break
		else:
			print("That was incorrect. The correct answer is Qatar. \n Try the next question")
	
	if question == 11:
		question11 = input("Which football team is currently leading the English Premier League Table? \n Type skip to skip to next question, or quit to end game  ")
		if (question11.lower() == "arsenal"):
			print ("correct! let's see if you will get the next right")
		elif question11 == "skip":
			continue
		elif question11 == "quit":
			break
		else:
			print("That was incorrect. Arsenal is the answer. Try again")
	
	if question == 12:
		question12 = input("What is the full meaning of CPU? \n Type skip to skip to next question, or quit to end game  ")
		if (question12.lower == "central processing unit"):
			print ("correct! let's see if you will get the next right")
		elif question12 == "skip":
			continue
		elif question12 == "quit":
			break
		else:
			print("That was incorrect. CPU means Central Processing Unit. \n let's see if you will get the next question right")
	
	if question == 13:
		question13 = input("Who invented the light bulb? \nType skip to skip to next question, or quit to end game  ")
		if (question13.lower() == "thomas edison"):
			print ("correct! let's see if you will get the next right")
		elif question13 == "skip":
			continue
		elif question13 == "quit":
			break
		else:
			print("That was incorrect. Thomas Edison is the answer. let's see if you will get the next question right")
	
	if question == 14:
		question14 = input("President Buhari is from which state? \nType skip to skip to next question, or quit to end game  ")
		if (question14.lower() == "katsina"):
			print ("correct! let's see if you will get the next right")
		elif question14 == "skip":
			continue
		elif question14 == "quit":
			break
		else:
			print("That was incorrect.let's see if you will get the next question right")
	
	if question == 15:
		question15 = input("Which is the most populous state in Nigeria? \n Type skip to skip to next question, or quit to end game  ")
		if (question15.lower() == "lagos"):
			print ("correct! let's see if you will get the next right")
		elif question15 == "skip":
			continue
		elif question15 == "quit":
			break
		else:
			print("That was incorrect.let's see if you will get the next question right")
	
	if question == 16:
		question16 = input("Which Nigerian musician performed at the closing ceremony of the FIFA 2022 world cup? \nType skip to skip to next question, or quit to end game  ")
		if (question16.lower() == "davido"):
			print ("correct! let's see if you will get the next right")
		elif question16 == "skip":
			continue
		elif question16 == "quit":
			break
		else:
			print("That was incorrect. The answer is Davido. \n let's see if you will get the next question right")
	
	if question == 17:
		question17 = input("How many parliamentarians are elected into the Nigerian House of Reps? \nType skip to skip to next question, or quit to end game  ")
		if question17 == "360":
			print ("correct! let's see if you will get the next right")
		elif question17 == "skip":
			continue
		elif question1 == "quit":
			break
		else:
			print("That was incorrect.let's see if you will get the next question right")
	
	if question == 18:
		question18 = input("How many seats are there at the Nigerian Senate? \nType skip to skip to next question, or quit to end game  ")
		if question18 == "109":
			print ("correct! let's see if you will get the next right")
		elif question18 == "skip":
			continue
		elif question18 == "quit":
			break
		else:
			print("That was incorrect.let's see if you will get the next question right")
	
	if question == 19:
		question19 = input("The world's most populated country? \n Type skip to skip to next question, or quit to end game  ")
		if (question19.lower() == "china"):
			print ("correct! let's see if you will get the next right")
		elif question19 == "skip":
			continue
		elif question19 == "quit":
			break
		else:
			print("That was incorrect.let's see if you will get the next question right")
	
	if question == 20:
		question20 = input("What is the full meaning of LP? \nType skip to skip to next question, or quit to end game  ")
		if (question20.lower() == "labour party"):
			print ("correct! let's see if you will get the next right")
		elif question20 == "skip":
			continue
		elif question20 == "quit":
			break
		else:
			print("That was incorrect.let's see if you will get the next question right")