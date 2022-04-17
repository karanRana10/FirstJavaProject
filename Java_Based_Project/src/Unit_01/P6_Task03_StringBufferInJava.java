package Unit_01;

public class P6_Task03_StringBufferInJava {
	/*3 Ways:
	 * -StringBuffer()
	 * -StringBuffer(String str)
	 * -StringBuffer(int capacity)
	 * 
	 *  -StringBuffer is mutable unlike string
	 */

		public static void main(String[] args) {

			StringBuffer sb = new StringBuffer("Hello..!");
			sb.append("Java");
			System.out.println(sb.charAt(0));

			// StringBuffer class append() Method, now original string is changed
			System.out.println(sb);

			// StringBuffer Insert() Method
			StringBuffer sb2 = new StringBuffer("Hello..!:)");
			sb2.insert(1, "Java");// now original string is changed
			System.out.println(sb2);// prints HJavaello...!:)

			// StringBuffer replace() method
			StringBuffer sb3 = new StringBuffer("Hello..!:)");
			sb3.replace(1, 3, "Java");// now original string is changed
			System.out.println(sb3);// prints HJavalo...!:)

			// StringBuffer delete() method
			StringBuffer sb4 = new StringBuffer("Hello..!:)");
			sb4.delete(1, 3);// now original string is changed
			System.out.println(sb4);
		}

}
