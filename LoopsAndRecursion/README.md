# The If Statement 

The if statement is probably one of the most useful things you will learn.  We use this concept everyday in every aspect of our life and don't even notice.  
A good way to understand an if statment is as a decision tree.  

For Example: You want to buy a game that costs 30$.  If you have 30$ in your wallet you can buy it.  Otherwise you can't.  
Put into code (note code does not compile due to undefined variable): 
```
if (moneyInWallet >= 30) {
    buyGame(); 
} 
```

If there is something you can do to get the money that you wouldn't do if you already had it that can be represented too.  For example if you got 5$ an hour 
you might work a few extra hours if you don't have the money. This can be represented using an else statement.    
Put into code that would be (note code does not compile due to undefined variables): 
```
if (moneyInWallet >= 30) {
    buyGame(); 
} else {
    workMoreHours(); 
}
```

# The While Loop  

Now imagine if you wanted to check every hour if you had enough money to buy the game while you work.  First you would need a way to store the amount of money 
in your pocket right?  We can do this by actually defining moneyInWallet and using whats called a while loop.  Each time you realize you haven't worked enough 
to buy the game you'll work another hour and check again.  Now you might be saying "Sophie!  I know I need to work 6 hours to make 30$ at that income" and I'd 
reply "well yes YOU do but the computer isn't smart enough to do math we didn't tell it to do" (because yes you just did math in your head without knowing don't freak out).  
Put into code we can see it in action: 
```
// you start with no money because I said so =P 
int moneyInWallet = 0;
while (moneyInWallet < 30) {
    // work another hour to earn 5 more dollars
    moneyInWallet = moneyInWallet + 5;
}
```
This program will continue until moneyInWallet > 30.  That will be for 6 itterations. 
Note that you need to make very sure that the condition you are checking for will acutally be reached.  Infinite loops are a thing and they are very bad and 
they will crash a program.  An Infinite loop is a loop that goes on forever, it never reaches what we call its base case.  Never ever do a while(true). 

# The Recursive Loop 
Now.  Imagine the exact same scenario as above.  We're just gonna code it up a bit different.  Think of recursion as those russian dolls that stack.  If the condition 
is not met we call the method again.  Then if the condition isn't met within that iteration we call it again.  Then once we get to a iteration that returns a value we return a value in the iteration that called that one and the one that called that one before it and so on until we reach the top level.  (Don't worry that sentance got away from me... Nobody understands it the first time... If you say you do you're lying.) Anyway... best to show an example now... 
```
public bool canIBuyGame(int moneyInWallet) {
    if (moneyInWallet > 30) {
        return true;
    } else {
        // work another hour
        moneyInWallet = moneyInWallet + 5; 
        // check again with the newly fattened wallet and return the result
        return canIBuyGame(moneyInWallet);
    }
}
```

Ok so a good exercise to do with this is to step through and draw a diagram of everything that is going on.  Like such: 
```
canIBuyGame(0)
    canIBuyGame(5)
        canIBuyGame(10)
            canIBuyGame(15)
                canIBuyGame(20)
                    canIBuyGame(25)
                        canIBuyGame(30)
                            true
                        true
                    true
                true
            true
        true 
    true
true 
```

I hope this has been at least a little helpful in explaining.  Please leave comments where you find it confusing and I'll address them as well as I can. 
