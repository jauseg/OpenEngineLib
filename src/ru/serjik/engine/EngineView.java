package ru.serjik.engine;

import ru.serjik.engine.utils.RenderRequester;
import android.content.Context;
import android.opengl.GLSurfaceView;

public class EngineView extends GLSurfaceView
{
	private RenderRequester renderRequester = new RenderRequester();

	public EngineView(Context context, Renderer renderer)
	{
		super(context);
		setRenderer(renderer);
		setRenderMode(RENDERMODE_WHEN_DIRTY);
	}

	@Override
	public void onPause()
	{
		renderRequester.pause();
	}

	@Override
	public void onResume()
	{
		renderRequester.resume(this);
	}
}
