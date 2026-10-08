# Quotes Web Scraper

A professional web scraper that extracts famous quotes from quotes.toscrape.com using Java and Jsoup. The scraper collects quote text, author names, and relevant tags, saving all data to a CSV file.

## Features

- Extracts quotes, authors, and tags from the web
- Saves data in professional CSV format with numbered entries
- Displays real-time progress in console
- Robust error handling
- Clean, documented code in English

## Requirements

- Java JDK 11 or higher
- Maven 3.6+
- Jsoup 1.15.3

## Installation

```bash
git clone https://github.com/jacobgyu/quotes-scraper.git
cd quotes-scraper
mvn clean install
```

## Usage

```bash
mvn exec:java -Dexec.mainClass="com.scraper.App"
```

This will generate a `quotes.csv` file with the extracted data and display progress in the console.

## Console Output Example
Total phrases: 10

Saved: 1
Phrase: "The world as we have created it is a process of our thinking. It cannot be changed without changing our thinking."
Author: Albert Einstein
Tags: change deep-thoughts thinking world

Saved: 2
Phrase: "It is our choices, Harry, that show what we truly are, far more than our abilities."
Author: J.K. Rowling
Tags: abilities choices

Saved: 3
Phrase: "There are only two ways to live your life. One is as though nothing is a miracle. The other is as though everything is a miracle."
Author: Albert Einstein
Tags: inspirational life live miracle miracles

Saved: 4
Phrase: "The person, be it gentleman or lady, who has not pleasure in a good novel, must be intolerably stupid."
Author: Jane Austen
Tags: aliteracy books classic humor

Saved: 5
Phrase: "Imperfection is beauty, madness is genius and it's better to be absolutely ridiculous than absolutely boring."
Author: Marilyn Monroe
Tags: be-yourself inspirational

The total number of phrases has been limited to: 5
CSV Saved


## CSV Output Format

Phrase ----> Author ----> Tags

1. "The world as we have created it is a process of our thinking. It cannot be changed without changing our thinking." ---> Albert Einstein ---> change deep-thoughts thinking world
2. "It is our choices, Harry, that show what we truly are, far more than our abilities." ---> J.K. Rowling ---> abilities choices
3. "There are only two ways to live your life. One is as though nothing is a miracle. The other is as though everything is a miracle." ---> Albert Einstein ---> inspirational life live miracle miracles
4. "The person, be it gentleman or lady, who has not pleasure in a good novel, must be intolerably stupid." ---> Jane Austen ---> aliteracy books classic humor
5. "Imperfection is beauty, madness is genius and it's better to be absolutely ridiculous than absolutely boring." ---> Marilyn Monroe ---> be-yourself inspirational

## Technologies Used

- Java - Programming language
- Jsoup - Web scraping library
- Maven - Build tool and dependency manager

## Project Structure

quotes-scraper/
├── src/main/java/com/scraper/
│ └── App.java
├── pom.xml
├── README.md
└── quotes.csv


## How It Works

1. Connects to quotes.toscrape.com using Jsoup with Mozilla user agent
2. Retrieves all quote containers using CSS selector (div.quote)
3. Extracts quote text, author name, and tags from each container
4. Limits results to 5 quotes per execution
5. Saves numbered data to quotes.csv in formatted structure
6. Displays real-time progress and details in console

## Customization

To change the number of quotes extracted, modify this line in App.java:

```java
if(counter >= 5) break;  // Change 5 to desired number
```

## Author

Jacob G. - [GitHub](https://github.com/jacobgyu)

## License

MIT License