package Basicjava;

public class Arrayadd {

	public static void main(String[] args) {
		int a[]={3,6,4,8,5};
		int b[]={1,4,7,3,3};
		int c[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i]+b[i];
			System.out.println(c[i]);
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
