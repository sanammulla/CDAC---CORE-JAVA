class B
{
	public int i=10;
	public static void main(String args[]){
		int i=200;
		for(i=0;i<20;i++)
		System.out.println("i="+i);
		new1();
	}
	new1(){
		System.out.println("b="+i);
	}
}