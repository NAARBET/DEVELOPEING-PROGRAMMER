package javajava;

public class JavaInterfacee implements javainter{
		public int add() {
			int a=1, b=2,c=0;
		c=a+b;
		return(c);
	}
		public int sub() {
			int a=1, b=2,c=0;
		c=a-b;
		return(c);
	}
		public static void main(String[] args){
			JavaInterfacee s = new JavaInterfacee();
			int f =s.add();
			int g =s.sub();
			System.out.println(f);
			System.out.println(g);
		}
	
	}


