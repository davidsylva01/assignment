#To write my quiz game, first I will import math
#Prompt the user to enter his/her name
#Display a welcome message, with game instrution
#Ask the user to start once he is ready
#Display the questions, and use if statements to check the user's response for correctness.
#Show unique statements whether correct or wrong answers are supplied



name = input ("Enter your name:	")
print("Dear " + name + " Welcome to quiz game")



input('Answer all questions. Are you ready? enter any key to start ')

	
question1 = input("what is the sum of angles in a triangle?: ")
if	question1 == "180":
	print("Congrats! you are correct")
else:	print("Sorry, you missed. Try the next question")
		


question2 = int (input("what is the square of the product of 3 and 2?: "))
if	question2 == (3*2)**2:
	print("Congrats! you are correct")
else:	print("Sorry, you missed. Try the next question")

print("Thank you, have a nice day")