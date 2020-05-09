#include<iostream>
using namespace std;
int gcd(int,int,int);
int main()
{
int ans,a,b,c;
  cin>>ans>>a>>b>>c;
  int ans1 = gcd(a,b,c);
  if (ans==ans1)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
  
}
int gcd(int x,int y,int z)
{
  int d;
if(x<y && x<z)
  d=x;
 else if(y<x && y<z)
   d=y;
 else
   d=z;
if(x%d==0 && y%d==0 && z%d==0)
  return d;
else
{
for(int i=d;i>=d;i--)
{
  if(x%i==0 && y%i==0 && z%i==0)
  {
  d=i;
    break;
  }
}
  return d;
}
  

}