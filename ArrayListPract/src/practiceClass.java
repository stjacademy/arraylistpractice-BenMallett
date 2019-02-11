import java.util.ArrayList;

public class practiceClass {

	public static void main(String[] args) {
		/*
		int[] grades = new int[2];
		
		grades[0] = 92;
		grades[1] = 89;
		
		for (int i=0; i<grades.length; i++)
			System.out.println(grades[i]);	
			*/
		ArrayList<Integer> grades = new ArrayList<Integer>();
		
		grades.add(100);
		grades.add(98);
		grades.add(507);
		grades.add(89);
		
		System.out.println(grades);	
		grades.add(1, 99);
		
		grades.set(3, 57);
		System.out.println(grades);	
	}
	
}
