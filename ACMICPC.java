import java.util.*;

public class ACMICPC {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a[]=new int[6],i,j,k,sum=0;
		boolean flag=false;
		for(i=0;i<6;i++) {
		a[i]=in.nextInt();sum+=a[i];}
		if(sum%2==0)
		for(i=0;i<5;i++)
			for(j=0;j<5;j++)
				for(k=0;k<5;k++)
					if(i!=j&&k!=j&&i!=k&&sum==2*(a[i]+a[j]+a[k]))
						{flag=true;break;}

			if(flag)System.out.print("yes");else System.out.print("no");
	}

}