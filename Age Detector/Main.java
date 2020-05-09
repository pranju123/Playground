#include<iostream>
using namespace std;
int main()
{
  int a,b,age=0;
  std::cin>>a>>b;
  if(a>b)
  {
    age=(100-a)+b;
    std::cout<<age;
  }
  else if(a<b)
  {
    age=b-a;
    std::cout<<age;
  }
  else
  {
  age=100;
    cout<<age;
  }
  //Type your code here.
}