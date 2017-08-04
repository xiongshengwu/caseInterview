package oneDrug;

public class NULL {

	public static void haha(){
		System.out.println("haha");
	}
	public static void main(String[] args) {
		((NULL)null).haha();//能正常执行
		NULL.haha();
		NULL n = new NULL();
		n.change(n.str, n.ch);
		System.out.println(n.str+" and "+n.ch[0]);
		String s ;
		//System.out.println("s="+s);
	}
	String str  = new String("hello");
	char[] ch = {'1','2','3'};
	public void change(String str,char[] ch){
		str = new String("你好"); //不会被改变
		ch[0] = '0';//被改变
	}
	
	
}
