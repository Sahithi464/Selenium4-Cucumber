**This is Selenium Cucumber Project using TestNG**

**Running the project:**
1) Download the project from GitHub
   
    Option 1: git clone https://github.com/Sahithi464/Selenium4-Cucumber.git
   
    Option 2: Download it as a Zip file and extract it
2) Navigate to the project folder
3) Set up Maven
    Run the following command in the terminal:mvn clean
4) Running Tests in the project
    Run "mvn clean test" in the path of the project
   
**Running with Number of workers from the command line:**

mvn clean test -Ddataproviderthreadcount=No of workers

**Running with tags from the command line:**

mvn clean test -Dcucumber.filter.tags="TagName"

**Running with specific browser from the command line:**

mvn clean test -Dbrowser=browserName  -Durl=URL
