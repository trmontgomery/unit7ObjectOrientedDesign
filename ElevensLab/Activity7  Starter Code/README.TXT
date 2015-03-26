Activity 7 Questions:
1.  If I was playing Elevens at my desk, I would need the deck, spots for all of the cards in play, 
and a place to put all of the cards that are not in play.  Instance variables needed for the board: 
board size, ranks, suits, point values, cards, and deck.

2.  How to play Elevens :
     a.  Shuffle the deck
     b.  Separate 9 cards from the deck
     c.  If there is a valid play on the board (two cards add up to eleven or a jack, queen,
         and king are present):  take those cards out of play and set them off to the side.  
     d.  Replace the cards that you just took out with cards from the deck.
     e.  Continue to do this until there are no valid moves (the player loses) 
         or there are no more cards in play (the player wins)
3.  Yes
4.  a.  The dealMyCards method is called in the constructor and the newGame method
    b.  isLegal() and anotherPlayIsPossible()
    c.  returned list --> 0   1   3   6   7
    d.  public static printCards(ElevensBoard board) 
    {
        List<Integer> cIndexes = board.cardIndexes();
        for(int i = 0; i < cIndexes.size(); i++)
        {
            Card c = board.cardAt(i);
            System.out.println(c.toString());
        }
    }
    e. anotherPlayIsPossible().  The previous method already has the selected cards passed into it. In 
    in order to determine whether or not another play is possible, you must look iterate through all of
    the cards and compare them to each other.  In order to know which card is which you have to get the 
    indexes of the card so that you can use the cardAt() method.

