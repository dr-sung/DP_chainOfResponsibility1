
// participant: ConcreteHandler
public class Manager extends ComplaintHandler {

    @Override
    public void processComplaint(String message) {
        System.out.println("manager: get out of my restaurant!");
    }
}
