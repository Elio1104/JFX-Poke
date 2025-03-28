package technofutur.game.jfxpoke;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import technofutur.game.jfxpoke.game.Game;
import technofutur.game.jfxpoke.menu.MainMenu;

public class AppLauncher extends GameApplication {

    private Game game;
    private MainMenu menu;

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(1200);
        settings.setHeight(800);
        settings.setFullScreenAllowed(true);
        settings.setFullScreenFromStart(true);
        settings.setTitle("JFX-Poke");
        settings.setMainMenuEnabled(false);
    }

    @Override
    protected void initGame() {
        if (game == null)
            game = new Game(this);
    }

    @Override
    protected void initUI() {
        if (menu == null)
            menu = new MainMenu(this);
        menu.showMenu();
    }

    public void startGame() {
        menu.hideMenu();
        game.showGame();
    }

    public static void main(String[] args) {
        launch(args);
    }
}