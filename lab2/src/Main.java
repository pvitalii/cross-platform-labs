public class Main {

    public static void main(String[] args) {
        Model m = new Model();
        View v = new View();
        Controller c = new Controller(m, v);
        TerminalView tv = new TerminalView("");
        TerminalController tc = new TerminalController(m, tv);
    }
}
