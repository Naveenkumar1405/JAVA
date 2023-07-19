import java.util.Stack;

public class StackBalancing {

	public static void main(String[] args) {
		Stack <String> s=new Stack <String>();
		s.push("1");
		s.push("2");
		s.push("3");
		s.push("4");
		s.push("5");
		s.push("6");
		s.push("N");
		s.push("I");
		s.push("V");
		s.push("A");
		s.push("N");
		
		while (!s.isEmpty()) { System.out.println(s.pop()); }
		
		System.out.println(isBalanced("[{}(){}{}"));
	}

	private static boolean isBalanced(String s) {
		Stack<Character> stack=new Stack<Character>();
		
		for(int i=0;i<s.length();i++) {char c=s.charAt(i);
		if(c=='['||c=='{'||c=='(') {stack.push(c);}
		else if(c==']'||c=='}'||c==')') {if(stack.isEmpty()) return false;}
	}
		return stack.isEmpty();
	}
}
