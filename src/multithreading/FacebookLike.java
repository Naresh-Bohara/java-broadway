package multithreading;

public class FacebookLike {
	int like;
	
	public FacebookLike(int like) {
		this.like = like;
	}
	
	synchronized void doLike() {
		like++;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Like = "+like);
	}
}
