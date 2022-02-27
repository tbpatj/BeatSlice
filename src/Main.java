import static org.lwjgl.util.glu.GLU.gluPerspective;

import java.nio.FloatBuffer;



import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.vector.Vector3f;


public class Main {
	int screenWidth = 1000;
	int screenHeight = 900;
	int cameraDirX = 0;
	int cameraDirY = 0;
	Vector3f cameraPos = new Vector3f();
	Vector3f FogColor = new Vector3f();
	Vector3f light0Dif = new Vector3f();
	Vector3f light0Amb = new Vector3f();
	Vector3f light0Pos = new Vector3f();
	int FOV = 500;
	int renderDistance = 500;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		main.start();
	}
	public void start()
	{
	
		try {
			
			Display.setDisplayMode(new DisplayMode(screenWidth,screenHeight));
			//Display.setFullscreen(true);
			int depthBufferBits = 24;
			Display.create(new PixelFormat(0, depthBufferBits, 0));
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public FloatBuffer floatBuffer(float a, float b, float c, float d)
    {
	    float[] data = new float[]{a,b,c,d};
	    FloatBuffer fb = BufferUtils.createFloatBuffer(data.length);
	    fb.put(data);
	    fb.flip();
	    return fb;
     }
	public FloatBuffer asFloatBuffer(float[] values)
	{
		FloatBuffer buffer = BufferUtils.createFloatBuffer(values.length);
		buffer.put(values);
		buffer.flip();
		return buffer;
	}

}
