package annotation;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) throws Exception{
		// AboutMe
//		Class<?> myClass = Class.forName("annotation.MyClass");
//		
//		Annotation[] annotations = myClass.getAnnotations();
//		//AboutMe annotation의 속성값을 확인/처리
//		for(Annotation annotation:annotations) {
//			if(annotation instanceof AboutMe) {
//				AboutMe aboutMe = (AboutMe) annotation;
//				//AboutMe annotaion 대응 코드
//				System.out.println(aboutMe.love());
//				System.out.println(aboutMe.hate());
//			}
//		}
		
		// Encrypt
		User user = new User("민정", "0206");
		System.out.println(user);
		
		//@Encrypt를 사용한 필드가 있으면 필드값을 암호화 변경
		Field[] fields = user.getClass().getDeclaredFields();
		
		for(Field field : fields) {
			if(field.isAnnotationPresent(Encrypt.class)) {
				field.setAccessible(true); //private도 가능
				field.set(user, field.get(user) + "5678");
			}
		}
		System.out.println(user);
	}
}


// 워크샵 : 각 조원이 annotation.MyClass처럼 특정