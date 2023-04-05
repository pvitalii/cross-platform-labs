import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TerminalView {
    private String currName;
    private final BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    public TerminalView(String currName) {
        while(true) {
            System.out.println("Current name: " + currName);
            System.out.println("Set name: ");
            try {
                currName = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void setCurrName(String name) {
        currName = name;
    }

    public String getCurrName() {
        return currName;
    }
}
