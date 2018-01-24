/**
 * This is a long comment it can span multiple lines and is usually found at the beginning of a class 
 * or a method to describe the input, output, and function.  
 */

// Broken down by word: public describes the accessability of a class.  
// A class is typically public which means it is accessable by anyone.  For now thats all you need but there is also private and protected.  
// Class is the type of object you are creating.  A class can include sub-classes, methods, internal variables... etc.  
// HelloWorld is the name of the class.  
// The open bracket tells the program that this is where the class starts.  
public class HelloWorld {

    // This is the first method in the class.  Broken down by part: 
    // public: able to be accessed by any program that inports its member class.  
    // static: this means that the method is standAlone.  It doesn't require the class to be created in order to run.  A static method can be 
    // called without initializing the member class. 
    // void: the return value type.  In this case we are returning nothing so we put void.  If we were returning an int we would replace void with int. 
    // main: the name of the function. 
    // String[] args: This is the input type and var name.  In this case this method requires input of an array of Strings.  We name that array args. 
    // open brakets indicate the method start. 
    // Every program needs to have exactly one main method.  This is the method that will be run when the program is started.  It always has this format.  
    //   the "args" stand for arguments which is the command line arguments used to run it.  For example if you ran 
    public static void main(String args[]) {
	// this is calling the function printHelloWorld with input of 0
        printHelloWorld(0);
	// this calls the function printHelloWorld with input of 1
        printHelloWorld(1);
    // this ends the method.  
    }

    // printHelloWorld with an even number should print "hello world"
    // printHelloWorld with a odd number should print "not this time sucker"

    // This is another method in the class.  It has the same attributes as the one above but it takes an int as input instead of String[].  
    // This method must be static because it is being called by a static method without initializing its member class.  
    public static void printHelloWorld(int input){
        /**
        * This is the solution to the problem described above.  The if statement checks to see if the condition inside is true and executes the code 
        * in the brackets if it is.  The code inside is skipped if the conditional statement is false. 
        */
        if (input % 2 == 0) {
	    // This line prints out the phrase "Hello World" 
	    // The System class includes the out class which includes the function println(print line) which takes input of a String to print. 
	    System.out.println("Hello World");
        }
        /**
        * Here we say specifically if the condition above is false execute the code in the brackets below. 
        */ 
        else {
            System.out.println("Not this time sucker");
        }
    }

// the close bracket indicates the end of the class
}

