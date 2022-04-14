
public class CoreJavaFresher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 20;
		String website = "Kaul ki MKP";
		char sur = 'S';
		double dec = 10.0009;
		boolean myVal = true;
		
		System.out.println(sum);
		System.out.println(website);
		System.out.println(sur);
		System.out.println(dec);
		System.out.println(website+" "+myVal+" "+"Original Value is"+dec+" "+sur );
		int[] arr = new int[10];
		arr[0] =10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;
		arr[6] = 70;
		arr[7] = 80;
		arr[8] = 90;
		arr[9] = 100;
//		int[] arr1 = {1,2,3,4,5,6,7,8,9};
//		System.out.println(arr[9]);
//		for(int i=0; i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
		for (int i:arr) {
			System.out.println(i);
		}
		String[] name = {"rahul","Kumar","Prajapati","Ritesh","Ritvik","Sumit","jaiswal","Satyam","Giri","Deepak","Daipuria"};
//		
//		for(int i = 0;i<name.length;i++) {
//			
//			System.out.println(name[i]);
//		}
		
		for (String n : name) {
			System.out.println(n);
		}
		
		
		
	}

}
