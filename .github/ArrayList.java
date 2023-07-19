import java.util.*;

public class ArrayList {

	private Object [] a ;
	private int p;
	
	public ArrayList() {
		a=new Object[5];
		p=0;}
		
	public void add(Object e) {
		if(p>a.length) increaseSize();
		a[p++]=e;}
	
	private void increaseSize() {
		Object[]temp=new Object[a.length+3];
		
		for(int i=0;i<a.length;i++) {
			temp[i]=a[i];
			a=temp;} }
	
	public void add(int index, Object e) {
		if(index<=-1 || index >Size()) { throw new ArrayIndexOutOfBoundsException();}
		
		if(p>=a.length) increaseSize();
		
		System.arraycopy(a, index, a, index+1, Size()-index);
		a[index]=e;
		p++;	}

	private int Size() { return p;}
	
	public Object get(int index) {
		if(index<=-1 || index>=Size()) {throw new ArrayIndexOutOfBoundsException();}
		return a[index]; }
	
	public void remove(int index) {
		if(index<=-1||index>=Size()) {throw new ArrayIndexOutOfBoundsException();}
		
		for(int i = index+1;i<Size();i++) {a[i-1]=a[i];}
		p--;
		a[p]=null; }
}
