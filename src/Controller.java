import java.awt.event.*;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        view.addButtonActionListener((ActionEvent e) -> {
            model.setText(view.getText());
            view.setLabelText(model.getTxt());
       });
    }

}
