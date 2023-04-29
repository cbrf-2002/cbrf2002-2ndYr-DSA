procedure Fibonacci is
   raptor_prompt_variable_zzyz : Unbounded_String;
   f0 : ??_Variable;
   fi : ??_Variable;
   f1 : ??_Variable;
   n : ??_Variable;
   f2 : ??_Variable;
begin
   f0 :=0;
   f1 :=1;
   fi :=(f0+f1);
   raptor_prompt_variable_zzyz :="Input nth term";
   Put_Line(raptor_prompt_variable_zzyz);
   Get(N);
   n :=n-2;
   Put_Line(f0);
   if n>=1 then 
      Put_Line(f1);
      while not (fi>N) loop
         f2 :=f0+f1;
         f0 :=f1;
         f1 :=f2;
         fi :=fi+1;
         Put_Line(f2);
      end loop;
      Put_Line("Your fibbonaci number from nth input is: "+f2);
   else
      if n=0 then 
         Put_Line(f1);
      else
      end if;
      Put_Line("Your fibbonaci number from nth input is: "+(n+1));
   end if;
end Fibonacci;
