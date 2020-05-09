#include<iostream>
using namespace std;
int main()
{
  int n1=0,n2=1,ans,n;
  cin>>n;
  for(int i=2;i<n;i++)
  {
  ans=n1+n2;
    n1=n2;
    n2=ans;
  
  }
  cout<<ans;
  //Type your code here.
}