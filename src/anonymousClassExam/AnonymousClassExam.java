package anonymousClassExam;

public class AnonymousClassExam {

	public static void main(String[] args) {
		// 익명 클래스
		
		// 상속받을 자식 클래스를 생성하지 않고 이름이 없는 클래스를 생성해서 사용한다.
		Parent pr = new Parent() {
			String name = "han";
			
			// public이어도 외부에서 접근이 불가능
			@Override
			public void testMethod() {				
				System.out.println("저의 이름" + name + "입니다");
			}			
		};
		pr.testMethod();
		//pr.name; // 부모의 객체변수로는 익명객체에서 새로만든 멤버는 접근이 불가능하다
		
		// 익명객체를 부모 객체변수로 참조할 수 있기 때문에 매개변수로 사용가능하다.
		walk(new Parent() {
			String name = "han";
			
			// public이어도 외부에서 접근이 불가능
			@Override
			public void testMethod() {				
				System.out.println("저의 이름" + name + "입니다");
			}			
		});
				
	}
	
	public static void walk(Parent p) {}

}
class Parent{
		
	void testMethod() {
		
		System.out.println("testMethod");
	}
}