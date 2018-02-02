import java.awt.Color;
import java.util.Random;
import java.util.List;
import java.lang.String;
import java.util.Arrays;

public class Guitar {
 
    // vairables
    private int numStrings = 6;
    private double guitarLength = 28.2;
    private String guitarManufacturer = "Gibson";
    private Color guitarColor = Color.red;
    private List<String> noteValue = Arrays.asList("A", "B", "C", "D", "E", "F", "G");
    private List<String> duration = Arrays.asList("(.25)", "(.5)", "(1)", "(2)", "(4)");
    private Random randomGenerator = new Random();

    // member methods 
    public String playGuitar() {
	List<String> notes = Arrays.asList();
	for (int i = 0; i<16; i++) {
	    String newNote = noteValue.get(randomGenerator.nextInt(6));
	    newNote += duration.get(randomGenerator.nextInt(5));
	    notes.add(newNote);
	}
	return notes.toString(); 
    }
    
    public String toString() {
	// TODO: Fill this to print a string representation of the class
	return "";
    }
    // subclasses

    // Constructors
    public Guitar(){}
    
    public Guitar(int strings, double length, String manufacturer, Color color) {
	this.numStrings = strings;
	this.guitarLength = length; 
	this.guitarManufacturer = manufacturer;
	this.guitarColor = color;
    }

    public int getNumString(){
	return numStrings;
    }

    // make getter methods for the rest of the variables
    
    
}
