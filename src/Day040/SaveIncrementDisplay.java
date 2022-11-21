/*Create three  classes:Save,Increment,  andDisplay. Thesave class should save an integer.  
 The increment class  should  create a  thread  that  starts  incrementing  the  value  of integer  variable from  10(10, 11, 12, 13  ...)
 and  saveseach  value  in  thesaveclass. Thedisplayclass  should  create  a  thread  that  willreading  the  value  in  theSave  class  
 and display it.Write  a  program  that  creates  an  instance  of  theSaveclass  and  sets  up  aIncrementand aDisplayobject to operate on it.*/

package Day040;

class Save{
	//Creating The save class.
	int num;
	Save(int num) {
		//Creating constructor to initialize the num.
		this.num=num;
	}
}

class Increment implements Runnable{
	//Creating the increment class.
	Save s;
	Thread t;
	Increment(Save save){
		//Creating constructor for increment.
		t=new Thread(this);
		s=save;
		t.start();
	}
	
	public void run() {
		inc();
	}
	synchronized void inc(){
		for(int i=0;i<5;i++){
			s.num+=1;
			Display d=new Display(s);
			try{
				d.t.join();
			}
			catch(Exception e){
				System.out.println("Exception");
			}
		}
	}
}

class Display implements Runnable{
	//Creating display class.
	Save s;
	Thread t;
	Display(Save save){
		//Creating constructor for display function.
		t=new Thread(this);
		s=save;
		t.start();
	}
	public void run(){
		displayinfo();
	}
	synchronized void displayinfo(){
		System.out.println(s.num+" ");
	}
}

public class SaveIncrementDisplay {
	
	public static void main(String[] args) {
		Save s=new Save(10);
		Increment i=new Increment(s);
		try{
			i.t.join();
		}
		catch(Exception e){
			System.out.println("Exception");
		}	
		System.out.println("Value at the end of program : ");
		@SuppressWarnings("unused")
		Display d=new Display(s);
	}
}




//-------------Test Case-------------
//Output:
//11 
//12 
//13 
//14 
//15 
//Value at the end of program : 
//15 
