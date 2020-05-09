#include<iostream>
int main()
{
  int n,cnt=0;
  std::cin>>n;
  // Type your code here
  do
  {
    int rem=n%10;
    cnt=cnt+1;
    n=n/10;
  }while(n!=0);
  std::cout<<cnt;
}