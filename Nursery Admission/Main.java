#include<iostream>
using namespace std;
int main()
{
 string s;
  int cnt;
  cin>>s;
  for(int i=0;i<s.size();i++)
  {
  cnt++;
  }
  cout<<"The number of letters in the name is "<<cnt;
}