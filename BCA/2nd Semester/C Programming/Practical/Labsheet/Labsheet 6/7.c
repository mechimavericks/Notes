/*    WAP that initialize ten numbers and search the key (a number given by the user)from the list .If the key is 
found then it displays the index(subscript of an array)otherwise it displays the proper message
i.e. "key is not found".   */
#include<stdio.h>
void main()
{
	int a[10],i,key,x=0;
	printf("Enter the 10 Numbers:- \n");
	for(i=0;i<10;i++)
		scanf("%d",&a[i]);
	printf("Enter your Key:- ");
	scanf("%d",&key);
	for(i=0;i<10;i++)
		if(a[i]==key)
			x++;
	if(x>0)
	{
		printf("Key is Found. \nThe Index of Key are:\n");
		for(i=0;i<10;i++)
			if(a[i]==key)
			printf("%d\n",i);
	}
	else
		printf("Key is Not Found.\n");
	getch();
}
