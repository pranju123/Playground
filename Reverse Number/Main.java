#include <iostream>
int main() 
{
	// Type your code here
 int n;
  std::cin>>n;
  while(n!=0)
  {
 int rem = n%10;
    std::cout<<rem;
    n=n/10;
  }
	return 0;
}