
// participant: Handler
//      Hanlder defines an interface for handling requests

public abstract class ComplaintHandler {
    
    private ComplaintHandler successor;

    public void setSuccessor(ComplaintHandler successor) {
        this.successor = successor;
    }
    
    public ComplaintHandler getSuccessor() {
        return successor;
    }
    
     abstract void processComplaint(String message);
}
