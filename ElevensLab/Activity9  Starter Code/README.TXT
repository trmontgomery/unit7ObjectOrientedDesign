Questions:

1.  Methods within subclasses are to be used to exhibit a different behavior from the parent class or any 
    other class that extends from the parent class.  Because all of three of the games that extend the 
    Board class have a size, there is no need for a method in the parent class.
    
2.  In each game there are different cards that need to be removed and replaced, so it makes sense that 
    each class would need its own unique method for to do this. 
    
3.  The concept of polymorphism would still apply to each new game, however, this design would work 
    just as well as the abstract Board design because they both take advantage of abstraction.