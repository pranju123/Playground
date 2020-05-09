#include<iostream>
using namespace std;
int main()
{
  int r,c,max=0;
  cin>>r>>c;
  int arr1[r][c];
  for(int i=0;i<r;i++)
  {
  for(int j=0;j<c;j++)
    cin>>arr1[i][j];
  }
   for(int i=0;i<r;i++)
  {
  for(int j=0;j<c;j++)
  {
  if(arr1[i][j]>=max)
    max=arr1[i][j];
  }
  }
  cout<<"The maximum element is "<<max;
}