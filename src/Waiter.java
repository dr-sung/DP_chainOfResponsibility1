
// participant: ConcreteHandler

public class Waiter extends ComplaintHandler {

    @Override
    public void processComplaint(String message) {
        if (message.contains("out of water")) {
            System.out.println("Waiter: I'll get you water immediately.");
        } else {
            getSuccessor().processComplaint(message);
        }
    }
    
}
