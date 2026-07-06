package multithreading;

public class TestFBLike {
public static void main(String[] args) {
	FacebookLike photo = new FacebookLike(900);
	
	for(int i=1; i<50; i++) {
	Thread user = new Thread() {
		@Override
		public void run() {
			photo.doLike();
			super.run();
		}
	};
	user.start();
	}
	
//	Thread user2 = new Thread() {
//		@Override
//		public void run() {
//			photo.doLike();
//			super.run();
//		}
//	};
//	
//	Thread user3 = new Thread() {
//		@Override
//		public void run() {
//			photo.doLike();
//			super.run();
//		}
//	};
//	
//	Thread user4 = new Thread() {
//		@Override
//		public void run() {
//			photo.doLike();
//			super.run();
//		}
//	};
//	
//	Thread user5 = new Thread() {
//		@Override
//		public void run() {
//			photo.doLike();
//			super.run();
//		}
//	};
//	
//	user1.start();
//	user2.start();
//	user3.start();
//	user4.start();
//	user5.start();
	
}
}
