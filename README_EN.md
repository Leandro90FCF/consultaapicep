# ZIP Code Lookup – Java 17

## Description

Java application designed to demonstrate external REST API consumption, immutable data modeling, and explicit domain error handling using modern Java features.

The project queries Brazilian ZIP codes (CEP) through the public ViaCEP API, processes the JSON response, and persists the result to a local file.

---

## Demonstrated Skills

- REST API consumption using `HttpClient`
- JSON serialization and deserialization with Gson
- Immutable data modeling using `record`
- API response validation
- Custom domain exception handling
- JSON file generation
- Clear separation of concerns
- Readable and maintainable code structure

---

## Technologies

- Java 17
- HttpClient (`java.net.http`)
- Gson (external dependency)
- ViaCEP API

---

## Project Structure

```
src/
 └── main/
     └── java/
         └── com/consultaapicep/
             ├── main/        -> Application entry point
             ├── config/      -> JSON serialization configuration
             ├── exception/   -> Domain exceptions
             ├── model/       -> Data records
             └── repository/  -> HTTP communication and persistence
```

---

## Execution

### Requirements

- Java 17 or higher
- Gson library added to the project

### Steps

1. Run the `Main` class
2. Provide a valid CEP via console input
3. The result will be printed and saved as a `.json` file

---

## Technical Notes

- Framework-free project
- Focus on core Java and modern language features
- Structure allows easy extension or replacement of the CEP provider

---

## API Used

- ViaCEP – https://viacep.com.br/
