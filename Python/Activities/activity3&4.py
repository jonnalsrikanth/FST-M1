while(True):
    name1 = input("what's the name of player1: ")
    name2 = input("what's the name of player2: ")

    player1choice = input("select the option 'Rock, paper, scissors: ").lower()
    player2choice = input("select the option 'Rock, paper, scissors: ").lower()
    
    if player1choice==player2choice:
        print("game is draw")
    elif player1choice=="rock":
        if player2choice=="scissors":
            print(f"{name1} won the game by choosing {player1choice}")
        else:
            print(f"{name2} won the game by choosing {player2choice}")
    elif player1choice=="paper":
        if player2choice=="rock":
            print(f"{name1} won the game by choosing {player1choice}")
        else:
            print(f"{name2} won the game by choosing {player2choice}")
    elif player1choice=="scissors":
        if player2choice=="paper":
            print(f"{name1} won the game by choosing {player1choice}")
        else:
            print(f"{name2} won the game by choosing {player2choice}")
    else:
        print("invalid input") 

    playagain = input("if you want to play again, enter Y: ").lower()
    if playagain=='y':
        pass
    else:
        break
print("thanks for playing")