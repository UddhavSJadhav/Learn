playerSym =""
compSym=""
board = ["", " ", " ", " ", " ", " ", " ", " ", " ", " "]


def clearBoard():
    i=1
    while(i<10):
        board[i]=" "
        i+=1
    playerSym=""
    compSym=""

def checkEmpty(posi):
    if(board[posi] == " "):
        return True
    else:
        return False


def printBoard():
    print('    |    |')
    print(' ', board[1], '| ', board[2], '| ', board[3])
    print('--------------')
    print('    |    |')
    print(' ', board[4], '| ', board[5], '| ', board[6])
    print('--------------')
    print('    |    |')
    print(' ', board[7], '| ', board[8], '| ', board[9])
    print('')

def ifWinning(xboard):
    if((xboard[1]==xboard[2]and xboard[2]==xboard[3] and xboard[1]!=" ")or
       (xboard[4]==xboard[5]and xboard[4]==xboard[6] and xboard[4]!=" ")or
       (xboard[7]==xboard[8]and xboard[7]==xboard[9] and xboard[7]!=" ")or
       (xboard[1]==xboard[4]and xboard[1]==xboard[7] and xboard[1]!=" ")or
       (xboard[5]==xboard[2]and xboard[5]==xboard[8] and xboard[2]!=" ")or
       (xboard[6]==xboard[9]and xboard[6]==xboard[3] and xboard[3]!=" ")or
       (xboard[1]==xboard[5]and xboard[1]==xboard[9] and xboard[1]!=" ")or
       (xboard[7]==xboard[5]and xboard[7]==xboard[3] and xboard[3]!=" ")):
        return True
    else:
        return False


def playerMove():
    pmove = int(input("Enter your move in numbers from 1 to 9: "))
    if(pmove % 1 == 0):
        if(checkEmpty(pmove)):
            global board
            board[pmove] = playerSym
            getWinner(True)
            compMove()
            checkTie()
        else:
            print('Entered square is not empty')
            playerMove()
    else:
        playerMove()


def compMove():
    global board,compSym,playerSym
    compMoved=True
    possibleMoves=[]
    boardCopy=["", " ", " ", " ", " ", " ", " ", " ", " ", " "]
    i=1
    while(i<10):
        boardCopy[i]=board[i]
        if(checkEmpty(i)):
            possibleMoves.append(i)
        i+=1
    if(checkEmpty(5)):
        board[5] = compSym
        compMoved = False
    if(compMoved):
        for x in possibleMoves:
            boardCopy[x]= playerSym
            if(ifWinning(boardCopy)):
                board[x]=compSym
                compMoved = False
                break
            else:
                boardCopy[x]=compSym
                if(ifWinning(boardCopy)):
                    board[x]=compSym
                    getWinner(False)
                    compMoved = False
                    break
            boardCopy[x]=" "
    if(compMoved):
        for x in [1,3,7,9]:
            if(checkEmpty(x)):
                board[x]=compSym
                compMoved = False
                break
    if(compMoved):
        for x in [2,4,6,8]:
            if(checkEmpty(x)):
                board[x]=compSym
                compMoved = False
                break
    printBoard()
    if(getWinner(False) or checkTie()):
        checkTie()
        playerMove()

def getWinner(winner):
    if(ifWinning(board)):
        print('Looks like we have a winner!!!')
        if(winner):
            print('Noice You Won!!!')
        else:
            print('You Lost to a bot')
        clearBoard()
        return True
    return False

def checkTie():
    i=0
    for x in board:
        if(x!=" "):
            i+=1
    if(i==9):
        print('Its a Tie!!!')
        clearBoard()
        return True
    return False

def newGame():
    global compSym,playerSym
    playerChoice = input("Choose 'X' or 'O':  ")
    if(playerChoice == 'X' or playerChoice == 'x'):
        compSym = "O"
        playerSym = "X"
        printBoard()
        playerMove()
    elif(playerChoice == 'O' or playerChoice == 'o'):
        compSym = "X"
        playerSym = "O"
        compMove()
    else:
        newGame()
    return 0

def main():
    confirmPlaying = input('Do you want to play? y/n:  ')
    if(confirmPlaying == 'y' or confirmPlaying == 'Y'):
        clearBoard()
        newGame()
    elif(confirmPlaying == 'n' or confirmPlaying == 'N'):
        clearBoard()
main()
