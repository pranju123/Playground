#include<iostream>
int main()
{
  int f1,f2,n;
  std::cout<<"Enter first number :";
  std::cin>>f1;
  std::cout<<" Enter second number :";
  std::cin>>f2;
  std::cin>>n;
  std::cout<<" Menu \n";
   std::cout<<"1.Addition \n";
   std::cout<<"2.Subtraction \n";
   std::cout<<"3.Multiplication \n";
   std::cout<<"4.Division \n";
   std::cout<<"5.Remainder \n";
  switch(n)
  {
  case 1:
  std::cout<<f1+f2;
  break;
  case 2:
  std::cout<<f1-f2;
  break;
  case 3:
  std::cout<<f1*f2;
  break;
  case 4:
  std::cout<<f1/f2;
  break;
  case 5:
  std::cout<<f1%f2;
  break;
  default:
  std::cout<<"Invalid operation";
  }
}