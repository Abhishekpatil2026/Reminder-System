import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
public class Mp3 
{
	void play()
	{
		try{
		FileInputStream f=new FileInputStream("kamehameha.mp3");
		Player p=new Player(f);
		p.play();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	void play1()
	{
		try{
		FileInputStream f=new FileInputStream("Yell.mp3");
		Player p=new Player(f);
		p.play();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
