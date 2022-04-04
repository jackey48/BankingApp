# BankingApp
BankingApp on Netbeans with Matthew
Basic Structure:
Bank - has a - > 
Client - has an account - > 
Account  - > 
Savings account, Checking account
<p>BankApp Java file should contain all our classes, it gets extended to every jFrame
<p>We also have to consider how to get the correct name in, do we need a login page in that case?
<p> We have discovered an issue where action performed cannot read objects because it is a private method meaning we'd have to remake it every time. To rectify this issue we have an idea: Just compare everything to the balance text and leave the current adding method be.
