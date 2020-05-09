#include<iostream>
using namespace std;
int main()
{
  int fact(int);
  int f,num;
  cin>>num;
  f=fact(num);
  cout<<"The factorial of"<<" "<<num<<" "<<"is"<<" "<<f;
  return 0;
}
int fact(int n)
{
if(n<0)
  return(-1);
 if(n==0)
   return(1);
  else
  {
  return(n*fact(n-1));
  }


}