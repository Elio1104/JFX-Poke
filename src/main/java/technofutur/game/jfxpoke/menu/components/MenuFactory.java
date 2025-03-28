package technofutur.game.jfxpoke.menu.components;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

import java.io.IOException;
import java.util.Objects;

public class MenuFactory {

    public static Node createButton(String text, Runnable action) {
        try {
            FXMLLoader loader = new FXMLLoader(MenuFactory.class.getResource("/technofutur/game/jfxpoke/menu/components/button.fxml"));
            Parent root = loader.load();

            ButtonController controller = loader.getController();
            controller.setText(text);
            controller.setOnAction(action);

            root.getStylesheets().add(Objects.requireNonNull(MenuFactory.class.getResource("/assets/ui/style.css")).toExternalForm());

            return root;
        } catch (IOException e) {
            throw new RuntimeException("Erreur lors du chargement du bouton FXML", e);
        }
    }
}

