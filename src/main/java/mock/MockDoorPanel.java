package mock;

//import static org.junit.jupiter.api.Assertions.*;

public class MockDoorPanel extends DoorPanel {
    private boolean isCalled = false;

    @Override
    public void close() {
        super.close();
        this.isCalled = true;
    }

    void verifyTheMockDoorPanelIsCalled() {
        //assertTrue(isCalled);
        System.out.println("isCall?:" + isCalled);
    }


}
