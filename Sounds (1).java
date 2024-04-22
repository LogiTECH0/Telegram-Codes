package soundTesting;

import java.util.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Sounds {
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		Scanner scanner = new Scanner(System.in);
		
		File file = new File("derzhavnij_gimn_ukrani_-_shche_ne_vmerla_ukrana__z3.fm_.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		clip.start();
		
		String response = scanner.next();
	}
}
