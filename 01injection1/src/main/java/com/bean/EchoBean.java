package com.bean;

public class EchoBean {
   
   int num;
   String name;
   String aslkfj;
   String as;
   String asadsf;
   
   //생성자 생성
   public EchoBean(){
      super();
      System.out.println("EchoBean 생성자");
   }
   
   //constructor injection
   public EchoBean(int n){
      System.out.println("EchoBean(int n)생성자"+n);
      num =n;
   }
   
   public EchoBean(int n, String na){
	      System.out.println("(int n, String na)생성자"+n+"\t"+na);
	      num = n;
	      name = na;
	   }

   //출력
   public String sayEcho(String mesg){
      return "Hello"+mesg;
   }
}