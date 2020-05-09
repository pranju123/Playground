#include<iostream>
using namespace std;
int main()
{
int start,end,sum1=0;
  cin>>start>>end;
  for(int i=start;i<=end;i++)
  {
    int p=1;
  while(p<=i/2)
  {
    if(i%p==0)
      sum1=sum1+p;
      p++;
  }
    if(sum1==i)
      cout<<i<<" ";
        sum1=0;
  }
}