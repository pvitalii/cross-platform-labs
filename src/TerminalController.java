public class TerminalController {

    private Model model;
    private TerminalView view;

    public TerminalController(Model model, TerminalView view) {
        this.model = model;
        this.view = view;
        model.setText(view.getCurrName());
        view.setCurrName(model.getTxt());
    }
}
