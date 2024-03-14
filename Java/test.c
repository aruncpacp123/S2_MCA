#include<stdio.h>
void main()
{
    int i,j,n;
    printf("\n Enter n:");
    scanf("%d",&n);
    int m=n;
    for(i=1;i<=n;i++)
    {
        for(int k=m;k>0;k--)
        {
            printf(" ");
        }
        m--;
        for(j=1;j<=i;j++)
        {
            printf("* ");
        }
        printf("\n");
    }
}