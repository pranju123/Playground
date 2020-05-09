#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
	std::string fnum;
   cin>>fnum;
   int f=0;
  cout<<"Floating part is : ";
   for(int i=0;i<fnum.size();i++)
   { 
      if(f==1)
        cout<<fnum[i];
      if(fnum[i]=='.')
         f=1;
     
   }
  
}
	//Type your code here
