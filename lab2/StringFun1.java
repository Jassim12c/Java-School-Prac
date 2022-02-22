package lab2;

public class StringFun1 {


	public static void main(String[] args) {


		String msg = "hi";

	// Q1) Write code to make the String msg become => hi hi hi
               
		msg = msg + " " + msg + " " + msg;
        
		System.out.println(msg);

	/* Q2) Next, using one line, make the msg become=>
		I said:
		"hi hi hi!"

		Note: \n for a newline, \" for a quotation
	*/
		  
		msg  = "I said: \n\"" + msg + "\"";
		System.out.println(msg);

	/* Q3) Finally, using one line and the variable msg2, make the msg become=>
		I said:
		"hi hi hi!"
		You said:
		"bye!"

	*/
		String msg2 = "bye";
		msg = msg + "You said:\n\"" + msg2 + "!\"";

               
                
                
		System.out.println(msg);
	}
}