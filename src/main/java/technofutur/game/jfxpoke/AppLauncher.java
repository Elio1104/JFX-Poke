package technofutur.game.jfxpoke;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import technofutur.game.jfxpoke.menu.MainMenu;

public class AppLauncher extends GameApplication {

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(1200);
        settings.setHeight(800);
        settings.setTitle("JFX-Poke");
        settings.setMainMenuEnabled(false);
    }

    @Override
    protected void initGame() {

    }

    @Override
    protected void initUI() {
        MainMenu mainMenu = new MainMenu();
        mainMenu.init();
    }

    public static void main(String[] args) {
        launch(args);
    }
}