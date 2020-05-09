#include<iostream>
using namespace std;
int main()
{
int inc,ter,sum1=0,i=1,sum2=0;
  cin>>inc>>ter;
  sum1=inc+ter;
  while(i<=sum1/2)
  {
    if(sum1%i==0)
      sum2=sum2+i;
      i++;
  }
  if(sum2==sum1)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";

}