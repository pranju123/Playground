#include<iostream>
using namespace std;
int main()
{
  int unit;
  std::cin>>unit;
  if(unit <= 200)
  {
    unit=unit*0.5;
    std::cout<<"Rs."<<unit;
  }
  else if(unit >200 && unit<=400)
  {
     unit=unit*0.65;
    std::cout<<"Rs."<<unit+100;
  }
    else if(unit >400 && unit<=600)
  {
     unit=unit*0.80;
    std::cout<<"Rs."<<unit+200;
  }
    else if(unit >600)
  {
     unit=unit*1.25;
    std::cout<<"Rs."<<unit+425;
  }
  //Type your code here.
}