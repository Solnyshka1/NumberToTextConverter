![image](https://github.com/user-attachments/assets/1d05c45f-9f3b-4d67-85c8-38c89d2633dc)
**Number to Text Converter in Kyrgyz**

Project Overview
This Java program converts numbers (0-99,999) into words in the Kyrgyz language. The user enters a number, and the program prints its written form.

Design Choices
- The code is divided into small methods to keep it simple and easy to understand.
- Arrays store number words (ones, tens, hundreds) for quick access.
- `StringBuilder` is used to efficiently build the output text.

How It Works?
- The program splits numbers into thousands and hundreds.
- It uses arrays to find the correct words for each part.
- Special rules handle numbers like 11-19 and round tens.

Challenges and Improvements
- Writing numbers correctly in Kyrgyz required careful grammar rules.
- Some numbers (like 1010 or 1100) needed extra conditions to display properly.
- Using `StringBuilder` improved speed and efficiency.

File Input/Output
Right now, the program works with user input from the keyboard. In the future, it could:
- Read numbers from a file.
- Save the results to a file for later use.

