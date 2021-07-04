#include<iostream>
using namespace std;
int main()
{
  string s,a,b;
  cin>>s;
  int i,f=0,n=s.size(),j;
  for(i=0;i<n;i++)
  {
    if(s[i]==';')
    {
      f=1;
    }
    if(f==0)
    {
      a+=s[i];
    }
    else if(s[i]!=';')
    {
      b+=s[i];
    }
  }
  int s1=a.size();
  int s2=b.size();
  int dp[s1+1][s2+1];
  for(i=0;i<=s1;i++)
  {
      for(j=0;j<=s2;j++)
      {
          if(i==0 || j==0)
                dp[i][j]=0;
      }
   }
   for(i=1;i<=s1;i++)
   {
     for(j=1;j<=s2;j++)
     {
         if(a[i-1]==b[j-1])
         {
              dp[i][j]=1+dp[i-1][j-1];
         }
         else
         {
             dp[i][j]=max(dp[i-1][j],dp[i][j-1]);
         }
     }
    }
    string ans="";
    i=s1; j=s2;
    while(i>0 && j>0)
    {
        if(a[i-1]==b[j-1])
        {
            ans.push_back(a[i-1]);
            i--;
            j--;
            
        }
        else
        {
            if(dp[i][j-1] > dp[i-1][j])
            {
                j--;
            } 
            else
            {
                i--;
            }   
        }
    }
    //reverse(ans.begin(),ans.end());
    cout<<ans;
}
