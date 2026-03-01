# Selenium TestNG Automation Framework

A simple and scalable **Selenium WebDriver + TestNG + Maven** based test automation framework for UI testing of web applications.

This project demonstrates how to structure and execute automated functional tests using industry-standard tools such as:

- **Selenium WebDriver** – for browser automation
- **TestNG** – for test organization, annotations, and reporting :contentReference[oaicite:1]{index=1}
- **Apache Maven** – for project build, dependency management, and execution

---

## 📦 Project Overview

This framework includes:

- Structured test packages under `src/test/java`
- Maven build file (`pom.xml`)
- TestNG suite configuration (`testng.xml`)
- Automatically generated test reports (`test-output`)
- Screenshots captured on test failures

---

## 🚀 Features

✔ Cross-browser test execution (configurable)  
✔ Organized tests with TestNG annotations (`@Test`, `@BeforeMethod`, etc.)  
✔ Maven-managed dependencies and run lifecycle  
✔ HTML test reports after execution  
✔ Screenshots on failure for easier debugging

---

## 📁 Folder Structure
selenium-testng-automation/
├── .settings/
├── screenshots/ # Failed test screenshots
├── src/
│ └── test/
│ └── java/ # Test and page classes
├── test-output/ # TestNG results
├── .gitignore
├── pom.xml
└── testng.xml



---

## ⚙️ Prerequisites

Before running tests, make sure you have installed:

✔ Java JDK 8 or higher  
✔ Apache Maven  
✔ Browser drivers (ChromeDriver, GeckoDriver, etc.) placed in your PATH or managed via WebDriverManager

---

## 🧪 How to Run Tests

Clone the repository:

```bash
git clone https://github.com/testwithankit26/selenium-testng-automation.git

cd selenium-testng-automation

mvn clean install

mvn test


📊 Test Reports

After execution completes:

✔ The TestNG HTML report is available in the test-output folder (open index.html)
✔ Screenshots taken on failure are stored in the screenshots folder (if configured)

📝 Adding New Tests

Create a new Java class under src/test/java

Write test methods using TestNG annotations (@Test, @BeforeMethod, etc.)

Add logic and assertions for your test scenarios

Add any new test suites or groups to testng.xml if required

📦 Dependencies

This project uses Maven to manage dependencies like:

selenium-java

testng

...which are declared in the pom.xml. Maven will automatically download and manage them.

👨‍💻 Author

Ankit Kumar

GitHub: https://github.com/testwithankit26

Email: testwithankit26@gmail.com

Website: https://thoughtcoders.com/

Automation Test Engineer passionate about building scalable and maintainable test automation frameworks using Selenium, TestNG, and Maven.

🤝 Contributing

Pull requests are welcome! You can improve the framework by:

✔ Adding page object classes and utilities
✔ Improving reporting or logging
✔ Integrating with CI systems like Jenkins or GitHub Actions

🪪 License

This project is open source — feel free to use and modify for your own learning or testing purposes.




If you’d like, I can also format the author section with **GitHub profile badges**, a **profile image**, or make it more recruiter-friendly for showcasing in interviews.