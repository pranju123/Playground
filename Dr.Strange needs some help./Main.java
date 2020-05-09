#include<iostream>
using namespace std;
void exp(int m,int n,int req)
{
  if(m*n*req<=50)
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else{
    cout<<"Sorry Doctor! You need more bacteria.";
  }
}
int main()
{
  int x,y,z;
  cin>>x>>y>>z;
  exp(x,y,z);
  
}