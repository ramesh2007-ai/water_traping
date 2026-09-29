import java.util.*;
class Water_traping1
{
	public static int watertrap(int a[],int n)
	{
		int total=0;
		for(int i=0;i<n;i++)
		{
			int leftMax=0;
			int rightMax=0;
			for(int j=0;j<=i;j++)
			{
				leftMax=Math.max(leftMax,a[j]);
			}
			for(int k=i;k<n;k++)
			{
				rightMax=Math.max(rightMax,a[k]);
			}
			int water=Math.min(leftMax,rightMax)-a[i];
			total=total+water;	
		}
		return total;
		
	}
public static void main(String args[])
{
int a[]={3,0,2,0,4};	
int n=a.length;
System.out.println(Water_traping1.watertrap(a,n));
}
}