#include<iostream>
using namespace std;
int main()
{
  int age;
  float show;
  cin>>age>>show;
if(age<=13)
{
if(show<=12.00)
  cout<<"$4.00";
 else
   cout<<"$2.00";
}
  else if(age>13)
  {
 if(show<=12.00)
  cout<<"$8.00";
 else
   cout<<"$5.00";
  
  }
  
}