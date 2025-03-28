package technofutur.game.jfxpoke.menu;

import com.almasb.fxgl.dsl.FXGL;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import technofutur.game.jfxpoke.menu.components.MenuFactory;

public class MainMenu {

    public void init() {
        VBox vbox = new VBox(10,
                MenuFactory.createButton("Play", this::launchGame),
                MenuFactory.createButton("Options", this::showOptions),
                MenuFactory.createButton("Quit", () -> FXGL.getGameController().exit())
        );

        vbox.setSpacing(10);
        vbox.setAlignment(Pos.CENTER);

        StackPane container = new StackPane(vbox);
        container.setPrefSize(FXGL.getAppWidth(), FXGL.getAppHeight());
        container.setAlignment(Pos.CENTER);

        FXGL.addUINode(container);
    }

    private void launchGame() {
        FXGL.getGameController().startNewGame();
        FXGL.removeUINode(FXGL.getGameScene().getRoot().getChildren().getFirst());
    }

    private void showOptions() {

    }
}
