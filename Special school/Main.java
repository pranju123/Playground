#include<iostream>
#include<string>
using namespace std;
int main()
{
   string a,b;
   int j=0,cnt=0;
   cin>>a>>b;
   for(int i=a.size()-1;i>=0;i--)
   {
     if(a[i]==b[j++])
       cnt++;
     else{
       cnt--;
       break;}
   }
  if(cnt==a.size())
    cout<<"It is correct";
  else
    cout<<"It is wrong";
    
}