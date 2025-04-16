# Prabhnoor Kaur 
# Lab #8 

import random 

randNum = random.randint(0,9)

print("Guess a number between 0 and 9")

while True:
    guess = int(input("Enter your guess: "))

    if guess == randNum:
        print("That's correct. You got it!")
        break 
    elif guess < randNum:
        print("too low")
    else:
        print("too high")

    for _ in range(5):
        print("I love python");

    fav_food = "burritos"
    counter = 0
    
    while counter < 5:
        print(f"My favorite food is {fav_food}!")
        counter +=1
   
