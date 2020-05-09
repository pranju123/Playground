#include<iostream>
using namespace std;
int main()
{
  int b,a,c;
  cin>>b>>a>>c;
  a=75*a;
  c=30*c;
  if(b>=(a+c))
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
  //Type your code here.
}