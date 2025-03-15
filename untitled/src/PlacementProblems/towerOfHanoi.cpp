#include<iostream>
using namespace std;
void toh(int n,char &s,char &t,char &a){
  if(n==1){
    cout << "Move" << n << " from " << s << " to " << t<<endl;
    return;
  }else{
    toh(n-1,s,a,t);
    cout << "Move from " <<s << " to " <<t<<endl;
    toh(n-1,a,t,s);
  }
}
int main() {
  int n;

  cin>>n;
   toh(n,'s','t','a');
  return 0;
}