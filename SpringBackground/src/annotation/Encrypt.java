package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//interface 앞에 @ 붙여서 annotaion 생성
//어디에 사용할 것인가? TYPE, METHOD.. API 문서 확인
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Encrypt {
}

//@Encrypt