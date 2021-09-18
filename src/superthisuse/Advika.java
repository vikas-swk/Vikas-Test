package superthisuse;

class Advika extends Vikas {

	int a = 30;
	void add(){
		
int t = a+a;
System.out.println(t);
	}
	void add1(){
		int t = super.a+this.a;
		System.out.println(t);
		
	}
	void advika(){
		super.display();
		
	}
}
