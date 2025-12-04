package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//Array - to store similar data type values in a array variable
		//1. int array
		//lowest bound/index = 0
		//upper bound/index = n-1(n is size of an array)
		
		//one dimensional array
		//disadvantages of an array
		//1. size is fixed - static array ---- to overcome this problem we use collections -- ArrayList, Hashtable -- dynamic array
		//2. stores only similar data types values  --- to overcome this problem we use object array
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		//System.out.println(i[4]);  //ArrayIndexOutOfBoundsException
		
		System.out.println(i.length);  //size or length of an array
		
		//print all the values of an array: use for loop
		
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		//2.double array
		
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 33.45;
		d[2] = 45.12;
		
		System.out.println(d[1]);
		
		//3.char array
		
		char c[] = new char[2];
		c[0] = 'a';
		c[1] = 's';
		
		System.out.println(c[0]);
		System.out.println(c[1]);
		
		//4.boolean array
		
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		//5.String array
		
		String s[] = new String[3];
		s[0] = "Suresh";
		s[1] = "Manik";
		s[2] = "Lokare";
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
		System.out.println(s.length);
		
		//6.Object array: Object is a class -- is used to store different data types values
		
		Object ob[] = new Object[6];
		ob[0] = "Tom";
		ob[1] = 36;
		ob[2] = 12.56;
		ob[3] = 'M';
		ob[4] = "1/1/1899";
		ob[5] = "London";		
		
		System.out.println(ob[5]);
		System.out.println(ob[0]);
		System.out.println(ob.length);
	}

}
