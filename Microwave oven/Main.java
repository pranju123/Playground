#include<iostream>
using namespace std;
int main()
{
  int num;
  float h_time,temp=0;
  cin>>num;
  cin>>h_time;
  if(num == 2)
  {
    temp=50*h_time/100+h_time;
    cout<<temp;
  }
  else if(num==3)
  {
    float temp2=0;
   temp2=2*h_time;
    cout<<temp2;
  }
  else
  {
  cout<<"Number of items is more";
  }
  //Type your code here.
}