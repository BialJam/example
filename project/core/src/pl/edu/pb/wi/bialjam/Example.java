package pl.edu.pb.wi.bialjam;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Example extends ApplicationAdapter {
    private Batch batch;
    private Camera camera;
    private Texture texture;

    @Override
    public void create() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        batch = new SpriteBatch();
        camera = new OrthographicCamera();
        texture = new Texture(Gdx.files.internal("lizard.png"));
    }

    @Override
    public void resize(final int width, final int height) {
        camera.viewportWidth = width;
        camera.viewportHeight = height;
        camera.update();
    }

    @Override
    public void render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        batch.draw(texture, -texture.getWidth() / 2f, -texture.getHeight() / 2f);
        batch.end();
    }

    @Override
    public void dispose() {
        if (texture != null) {
            texture.dispose();
        }
        if (batch != null) {
            batch.dispose();
        }
    }
}
