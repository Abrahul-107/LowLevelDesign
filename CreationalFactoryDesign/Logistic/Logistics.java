//Abstract Class and the Factory Method 
package CreationalFactoryDesign.Logistic;

import CreationalFactoryDesign.transport.Transport;

public abstract class Logistics 
{
    // Abstract method that subclasses must implement.
    public abstract Transport createTransport();
    
    // This method uses the product (Transport) created by the factory method.
    public void planDelivery()
    {
        // Calls the factory method to create a product (Transport)
        Transport transport = createTransport();
        
        // Calls a method on the created product
        transport.deliver();
    }
     
}