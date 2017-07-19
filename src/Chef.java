
// participant: ConcreteHandler

public class Chef extends ComplaintHandler {

    @Override
    public void processComplaint(String message) {
        if (message.contains("overdone")) {
            System.out.println("Chef: sorry, another steak is on the way.");
        } else {
            getSuccessor().processComplaint(message);
        }
    }
}
