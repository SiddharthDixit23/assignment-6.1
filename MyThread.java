/*Program to give the idea of threading as the String "Hello" 
is scheduled before run() method in output instead of being kept after the call in program*/
class MyClass implements Runnable{
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<60;i++)
		{
					
			if(60%i == 4)                              //Any random integer
			System.out.println("Timeout at "+i);
		
		}
		System.out.println("End");
	}
}

class MyThread
{
	public static void main(String[] args)
	{
		MyClass a = new MyClass();
		
		Thread t = new Thread(a);
	
		t.start();
		System.out.println("Hello");
	}
}