// Example: Chain of Responsibility design pattern
// (c) Dr. Hong K. Sung

// participant: Client

public class Main {
    
    public static void main(String[] args) {
        Manager manager = new Manager();
        Chef chef = new Chef();
        Waiter waiter = new Waiter();
        
        // setup the chain of responsibility
        waiter.setSuccessor(chef);
        chef.setSuccessor(manager);
        manager.setSuccessor(null);
        
        // participant: Client initiates the request to
        // ConcreteHandler object on the chain
        waiter.processComplaint("I am out of water!");
        
        waiter.processComplaint("This is a ripoff!");
        
        waiter.processComplaint("This steak is overdone!");
    }
    
}
