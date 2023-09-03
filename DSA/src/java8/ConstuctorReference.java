package java8;

public class ConstuctorReference {
	String s;
	ConstuctorReference(String s){
		this.s=s;
	}
	public void show() {
		System.out.println(this.s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorInterface cf = s->new ConstuctorReference(s);
		cf.get("Hello world").show();
		
		// using constructor reference
		cf = ConstuctorReference::new;
		cf.get("Practice again").show();
		

	}

}
