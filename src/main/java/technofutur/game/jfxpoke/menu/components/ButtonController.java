package technofutur.game.jfxpoke.menu.components;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ButtonController {

    @FXML
    private Button button;

    public void setText(String text) {
        button.setText(text);
    }

    public void setOnAction(Runnable action) {
        button.setOnAction(e -> action.run());
    }
}

