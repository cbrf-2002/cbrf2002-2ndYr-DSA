#include <iostream>
#include <string>

using namespace std;
int main()
{
   string raptor_prompt_variable_zzyz;
   ?? f0;
   ?? fi;
   ?? f1;
   ?? n;
   ?? f2;

   f0 =0;
   f1 =1;
   fi =(f0+f1);
   raptor_prompt_variable_zzyz ="Input nth term";
   cout << raptor_prompt_variable_zzyz << endl;
   cin >> n;
   n =n-2;
   cout << f0 << endl;   if (n>=1)
   {
      cout << f1 << endl;      while (!(fi>n))
      {
         f2 =f0+f1;
         f0 =f1;
         f1 =f2;
         fi =fi+1;
         cout << f2 << endl;      }
      cout << "Your fibbonaci number from nth input is: "+f2 << endl;   }
   else
   {
      if (n==0)
      {
         cout << f1 << endl;      }
      else
      {
      }
      cout << "Your fibbonaci number from nth input is: "+(n+1) << endl;   }

   return 0;
}
