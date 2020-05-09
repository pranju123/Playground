#include<iostream>
using namespace std;
int main()
{
  int r,l;
  std::cin>>r>>l;
  int ca=(3.14/4)*(l*l);
  int sa=3.14*(r*r);
  if(ca >= sa)
  {
  std::cout<<"circle can be inside a square";
  }
  else
    std::cout<<"circle cannot be inside a square";
  
  //Type your code here.
}