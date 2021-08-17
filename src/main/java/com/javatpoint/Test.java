package com.javatpoint;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;


public class Test {	
public static void main(String[] args) {
	
	Resource r=new ClassPathResource("applicationContext.xml");
	BeanFactory b=new XmlBeanFactory(r);
	MailMail m=(MailMail)b.getBean("mailMail");
	String sender="mahatorahul4400@gmail.com";//write here your id
	String receiver="rahulmahato440@gmail.com";//write here receiver id
	m.sendMail(sender,receiver,"Hii This is a test mail.","Hii there nice to meet you");
	
	System.out.println("success");
}
}
