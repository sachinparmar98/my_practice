#include<stdio.h>
void show(int a,int b,int n)
{
	if(b>n)return;
	if(b%2==1)
		printf("%d ",a);
	else
	printf("* ");
	if(a==n)
	{
		printf("\n");
		a=0;
		b++;
	}
	a++;
	show(a,b,n);
}
void main()
{
show(1,1,5);
}


/*

1 2 3 4 5
* * * * *
1 2 3 4 5
* * * * *
1 2 3 4 5

*/