
/**
 * This class models a car.
 *
 * @author justinli30   
 * @version 10 september 2018
 */
public class Car
{
    /*
     * Instance variables store the object's properties.
     *      specify the visibility (e.g., private)
     *          public: accessible by anyone
     *          private: only accessible by methods in this class
     *      specify the type (e.g., double)
     *      specify the name (e.g., fuelEfficiency, fuelInTank)
     *      
     * Instance variables differ from local variables in the following ways:
     *      scoped to their class (accessible for all methods)
     *      automatically initiailize to a default value (0, false, null)
     */
    private double fuelEfficiency; // in units of miles per gallon
    private double fuelIntake; // in units of gallons
    
    /*
     * Constructor:
     *      - responsible for initializing newly created objects
     *      - invoked automatically via the new operator
     *      - name of the constructor must match the name of the class
     *      - has no return type (not even void)
     *      - multiple constructors may be defined for a class
     */
    
    /**
     * Default constructor for the Car class.
     *      Initializes the fuel efficiency to 30mpg and the fuel in this
     *          car's tank to 0 gallons. 
     */
    public Car()
    {
    }
    
    /**
     * Constructs a new Car object with the specified fuel efficiency
     * 
     * @param   initialEfficiency   the initial fuel efficiency, in 
     *                              miles per gallon, of this new car
     */
    public Car(double initialEfficiency)
    {
    }
    /*
     * When defining a method, specify:
     *      the visibility (e.g., public)
     *      the return type(e.g., void)
     *      the method name (e.g., drive)
     *      the parameters and their types (e.g., distance of type double)
     */
    
    /**
     * Drives this car the specified distance, consuming fuel
     * 
     * @param   distance    the distance, in miles, this car drives
     */
    public void drive(double distance)
    {
        
    }
    /**
     * Adds the specified amount of fuel to this car's tank.
     * 
     * @param   amount  the amount of fuel, in gallons, to add to 
     *                  this car's tank
     */
    public void addFuel(double amount)
    {
    }
    /**
     * Returns the amount of fuel in this car's tank.
     * 
     * @return  the amount of fuel, in gallons, in this car's tank
     */
    public double getFuelInTank()
    {
        return 0;
    }
    
}
