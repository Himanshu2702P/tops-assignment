/*pattern 1
	1
	23
	456
	78910
*/
#include<stdio.h>
int main(){
	int i,j,n=1;
	for(i=0;i<4;i++)
	{
		for(j=0;j<=i;j++)
		{
			printf("%d ",n++);
		}
		printf("\n");
	}
	return 0;
}
