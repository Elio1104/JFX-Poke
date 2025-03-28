package technofutur.game.jfxpoke.menu;

import com.almasb.fxgl.dsl.FXGL;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import technofutur.game.jfxpoke.AppLauncher;
import technofutur.game.jfxpoke.menu.components.MenuFactory;

public class MainMenu {
    private StackPane container;

    public MainMenu(AppLauncher appLauncher) {
        VBox vbox = new VBox(10,
                MenuFactory.createButton("Play", () -> appLauncher.startGame()),
                MenuFactory.createButton("Options", this::showOptions),
                MenuFactory.createButton("Quit", () -> FXGL.getGameController().exit())
        );

        vbox.setSpacing(10);
        vbox.setAlignment(Pos.CENTER);

        container = new StackPane(vbox);
        container.setPrefSize(FXGL.getAppWidth(), FXGL.getAppHeight());
        container.setAlignment(Pos.CENTER);
    }

    private void showOptions() {

    }

    public void showMenu() {
        FXGL.addUINode(container);
    }

    public void hideMenu() {
        FXGL.removeUINode(container);
    }
}
