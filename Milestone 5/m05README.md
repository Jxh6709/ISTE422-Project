## Changes made to the edge converter program
1)	Rather than having an infinite loop when selecting the wrong definitions folder, the while loop has been converted to an if to account for the error without frustrating the butterhead user
2) The edge file needs to be selected in order to select a definitions folder
3) General improvments (added some comments to clarify the code)
# To Make This Program Work With Another DBMS
1) Add the language to the product names list
2) Create an CreateDDL..."language".java which will mimic the CreateDDLMySQL, but account for the proper syntax
3) Pray and hope that it works before attempting