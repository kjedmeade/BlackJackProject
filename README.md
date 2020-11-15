## BLACK JACK PROJECT

 ### Overview
 In this program, the user plays against the dealer in a game of BlackJack. After both parties (dealer and player) are dealt two cards, the player is asked whether they would like to hit or stand. A player can hit multiple times, but stand only once before the dealer begins his turn. A winner is found when either party reaches 21 in card value (Black Jack), doesn't bust (card value greater than 21), or has a card value less than the opponent.


 ### Topics

 * Taking User Input
 User input is retrieved via a simple scanner. After both parties are dealt two cards, the player is asked whether they would like to be dealt another card or keep their hand. The options for taking this input are "hit" and "stand".

 * Classes and objects
 A series of classes were used to build this program. Classes included BlackJackApp (main run program), BlackJackTable (game sequence), Hand(abstract class for general card array/hand information/methods) BlackJackHand (concrete class for card array/hand information/methods ), Card (individual card information/methods), Deck (Deck information/methods), etc. Two classes, Rank and Suit, are enum classes. In the BlackJackTable class, various  objects from these classes are instantiated/created (e.g. player, dealer, deck) to run the program.

 * Highlighted Method
 The methods dealCardToDealerFaceDown(), dealCardToDealerFaceUp(), and dealCardToPlayerFaceUp(Player player) are used in the program to request the dealer/computer to deal cards to the player or dealer. These methods stem from the Dealer class.

* Highlighted Method
 dealerShuffleCards() calls the deck of 52 cards created to be shuffled using the Collections.shuffle() method found in the Deck class.

* Highlighted Method
The methods' dealer.getDealerHand().getHandValue() and player.getPlayerHand().getHandValue() are used to get the total value of the requested hand.

* Highlighted Method
The boolean methods isBlackJack() and isBust() are used to identify whether the player or dealer has won or gone over the 21 card value limit.

### Instructions
The user is welcomed to the game and asked whether they would like to hit or stand based on the cards they have been dealt.

### Lessons learned
I have learned more about how objects are used in programming and how methods are called from classes.  I also learned a bit more about while loops and how they function in more complex programs.
