# Linter
it is a method that reads a JavaScript file with a given Path, and generates an error message whenever it finds a line that doesn’t end in a semi-colon.
so every line must end with ; 
else it will return error message is shown like that :

     Line 5: Missing semicolon. 
except 
- if the line is empty.
- if the line ends with an opening curly brace {
 - if the line ends with an closing curly brace }
- if the line contains if or else

in this case the error message isnt going to appear



## Teasting 
- Test the linter on a file that contains no errors.

empty string so no thing appears


- Test the linter on a file that contains one error.

       Line (nember of line ): Missing semicolon.
- Test the linter on a file that contains few errors.

- Test the linter on a file that contains many errors.
- Test the linter on an empty file.