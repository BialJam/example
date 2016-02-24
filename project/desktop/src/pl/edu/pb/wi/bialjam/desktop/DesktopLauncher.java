package pl.edu.pb.wi.bialjam.desktop;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import pl.edu.pb.wi.bialjam.Example;

public class DesktopLauncher {
    public static void main(final String[] arg) {
        final LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        createApplication(config);
    }

    private static Application createApplication(final LwjglApplicationConfiguration config) {
        return new LwjglApplication(new Example(), config);
    }
}
