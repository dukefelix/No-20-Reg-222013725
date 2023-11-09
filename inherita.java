
// java program to show first five teams using classes

class A extends B implements E{
	void printa() {
		System.out.println("MANCHESTER CITY");
	}
	public void printe() {
		 System.out.println("MANCHESTER UNITED");
	}
}
class B extends C{
	void printb() {
		System.out.println("REAL MADRID");
	}
}
class C extends D{
	void printc() {
		System.out.println("AJAX AMSTERDAM");
	}
}
class D{
	void printd() {
		System.out.println("FC PORTO");
	}
}
interface E{
	void printe();
}


public class inherita {
	public static void main(String[] args) {
        A Obj = new A();
        Obj.printa();
        Obj.printb();
        Obj.printc(); 
        Obj.printd();
        Obj.printe();
	}

}
