
/**
 * Pack_1 is package name and package keyword is used to create a package and it should 
 * be declare top of the program in java and from this package we will 
 * access another package Pack_2 
 */
package pack_1;
/**
 * Using "import" keyword for access another package to access any  package we have 
 * to write a package name in which package we wants to import and put a dot with package 
 * name and than which particular class we wants to import write name of the class
 * and in this program i'll access Student class which is in another package
 * */ 
import Pack_2.Student; 
                         
/**
 * 
 * @author Vishwas
 * creating class and main method
 *
 */
public class Vishwas { 
	
	public static void main(String[] args) {
		/**
		 * this is student object which will call the class of "package pack_2"
		 * using import keyword
		 */
		Student student = new Student();
		

		student.setRollno(5);
		student.setName("Vishwas");
		
		//window console
		System.out.println("Roll  No:--> "+ student.getRollno());
		System.out.println("Name is:--> " + student.getName());
		
	}

}
