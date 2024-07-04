
package AnalysisOfAlgrithms_Assignment;
import java.util.ArrayDeque;
import java.util.Deque;

class Tester1 {

    public static Deque<Character> updateStack(Deque<Character> inputStack) {
		//Implement your logic here and change the return statement accordingly
        Deque<Character> resultStack = new ArrayDeque<>();
        Deque<Character> temp = new ArrayDeque<>();
   


        for(int i = 0 ; i<2 ; i++){
            temp.addLast(inputStack.pop());  // A ->B
        }

       

        while(!inputStack.isEmpty()){  // C->D->E
            resultStack.addLast(inputStack.pop());  
        }

        while(!temp.isEmpty()){
            resultStack.addLast(temp.pop());
        }



       







        



		return resultStack;
	}
	
	public static void main(String[] args) {
		
		Deque<Character> inputStack = new ArrayDeque<Character>();
		inputStack.push('E');
		inputStack.push('D');
		inputStack.push('C');
		inputStack.push('B');
		inputStack.push('A');


		
		Deque<Character> resultStack = updateStack(inputStack);
		
		System.out.println("The alphabets in updated stack are:");
		for(Character alphabet: resultStack)
		    System.out.println(alphabet);
	}
}