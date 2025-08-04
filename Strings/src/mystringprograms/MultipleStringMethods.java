package mystringprograms;

public class MultipleStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="JavaLanguage";
		String str1="JAvaLanguage";
		System.out.println("1.String length= "+str.length());
		System.out.println("2.CharAt() at 1: " + str.charAt(1));
		System.out.println("3.Substring() from index 2: " + str.substring(2));
		System.out.println("4.Substring()from index 2 to 7: " + str.substring(2,7));
		System.out.println("5.equals(): " + str.equals(str1));
		System.out.println("6.equalsIgnoreCase(): " + str.equalsIgnoreCase(str1));
		System.out.println("7.compareTo(): " + str.compareTo(str1));
		System.out.println("8.compareToIgnoreCase(): " + str.compareToIgnoreCase(str1));
		System.out.println("9.contains(World): " + str.contains("World"));
		System.out.println("10.Does string start with Ja: " + str.startsWith("Ja"));
		System.out.println("12.indexOf the L: " + str.indexOf("L"));
	    System.out.println("13.lastIndexOf of e : " + str.lastIndexOf("e"));
	    System.out.println("14.trim "+ str.trim());
	    System.out.println("15.replace l with x : " + str.replace('l', 'x'));
	    System.out.println("16.replaceAll a with 0 " + str.replaceAll("a", "0"));
	    System.out.println("17.replaceFirst L with l" + str.replaceFirst("L", "l"));
	    System.out.println("18.toLowerCase(): " + str.toLowerCase());
	    System.out.println("19.toUpperCase(): " + str.toUpperCase());
	    System.out.println("20.toCharArray()" + str.toCharArray());
		
		
		
		
		
		
		
		
		
		
		

	}

}
