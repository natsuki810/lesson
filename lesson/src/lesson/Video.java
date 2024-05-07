package lesson;

public class Video {
	public String name;
	public int playCount;
	public void play() {
		System.out.println("動画を再生します");
		this.playCount++;
	}
}
