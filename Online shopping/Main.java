#include<iostream>
using namespace std;
int main()
{
  int fa,fd,fs,sa,sd,ss,aa,ad,as;
  std::cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  fd=fd*fa/100;
  sd=sd*sa/100;
  ad=ad*aa/100;
  int flip=(fa-fd)+fs;
  int snap=(sa-sd)+ss;
  int ama=(aa-ad)+as;
  cout<<"In Flipkart Rs."<<flip<<"\n";
  cout<<"In Snapdeal Rs."<<snap<<"\n";
  cout<<"In Amazon Rs."<<ama<<"\n";
  if(flip <= snap && flip <= ama)
  {
  cout<<"He will prefer Flipkart";
  }
  else if(snap<= flip && snap <= ama)
  {
  cout<<"He will prefer Snapdeal";
  }
  else
  {
  cout<<"He will prefer Amazon";
  }

}