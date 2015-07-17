import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.bean.EchoBean;


public class EchoBeanTest {

   public static void main(String[] args) {
      
      ApplicationContext ctx = new GenericXmlApplicationContext("echo.xml");  
      //bean을 저장하고 수납하는 공간
      
      //bean 접근할때는 "id값"으로 접근
/*      EchoBean bean = (EchoBean)ctx.getBean("echo");
      System.out.println(bean.sayEcho("홍길동"));
      
      //2번째 방법
      EchoBean bean2 = 
            (EchoBean)ctx.getBean(Echobean.class);
      System.out.println(bean2.sayEcho("이순신"));*/
      
      //3번째 방법
      EchoBean bean3 =      //아이디가 echo인것을 가져옴.
            ctx.getBean("echo",EchoBean.class);  //getBean = 저장된 것들 중에서 필요한 것을 가져오겠다
      System.out.println(bean3.sayEcho("강감찬"));
      
      
   }//end main

}//end class