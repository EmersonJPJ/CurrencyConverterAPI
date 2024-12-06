# 💰 Currency Converter in Java 🌍

Welcome to the **Currency Converter** project! 🚀 This Java application demonstrates good practices in Object-Oriented Programming (OOP) and API consumption. It provides an intuitive tool to convert between different currencies using real-time exchange rates fetched from an external API. The system also keeps track of conversion history, including the converted amount, currency types, and the date/time of each conversion.

## ✨ Features

- 🌐 **Exchange rate lookup**: Fetches real-time exchange rates between various currencies using an API.
- 💵 **Currency conversion**: Effortlessly converts between multiple currencies based on the fetched exchange rates.
- 🕒 **Conversion history**: Stores and displays the history of all conversions, with time stamps for each transaction.
- 🏗️ **Object-Oriented Design**: Follows OOP principles such as encapsulation and modular code with well-defined classes and methods.

## 📂 Project Structure

1. **`Cambio`**: A `record` class that encapsulates conversion data such as the base and target currency codes, conversion rate, and amount to be converted.
2. **`ConsultaApi`**: A class responsible for making HTTP requests to the exchange rate API and retrieving real-time data.
3. **`ConversorMoneda`**: Contains the logic for converting the amount using the exchange rate.
4. **`HistorialDeConversiones`**: Manages a history of all conversions, storing and displaying past conversions with their corresponding date and time.
5. **`Main`**: The core class that runs an interactive menu, allowing the user to choose conversion options and view the conversion history.

## 🚀 Usage

1. **Clone** the repository to your local machine:

    ```bash
    git clone https://github.com/EmersonJPJ/currency-converter-java.git
    ```

2. **Navigate** into the project directory:

    ```bash
    cd currency-converter-java
    ```

3. **Compile** and **run** the project in your favorite IDE or from the command line:

    ```bash
    javac Main.java
    java Main
    ```

4. Enjoy using the **interactive menu** to choose currency conversions or check the history of your past conversions. 💬

## ⚙️ Requirements

- Java **JDK 11** or higher
- **Internet access** to fetch live exchange rates from the API

## 🤝 Contributing

Contributions are always welcome! If you have suggestions, improvements, or bug fixes, feel free to open an issue or create a pull request. 

## ✨ Contact  

Feel free to reach out for any questions or suggestions!  

- 📧 **Email**: emerson04vade@gmail.com  
- 💻 **GitHub**: EmersonJPJ 
