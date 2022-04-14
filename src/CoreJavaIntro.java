import java.util.ArrayList;

public class CoreJavaIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
		
		ArrayList<String> base = new ArrayList<String>();
		base.add("Sumit");
		base.add("Sarkar");
		base.add("BJP");
		base.remove(0);
		System.out.println(base.get(0));
		
			
	}

}
