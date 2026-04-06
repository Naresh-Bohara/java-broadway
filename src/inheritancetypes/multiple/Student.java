package inheritancetypes.multiple;

public class Student implements Study, Play {

	@Override
	public void play() {
		 System.out.println("Student is playing");
		
	}

	@Override
	public void study() {
		System.out.println("Student is studying");
		
	}

}
