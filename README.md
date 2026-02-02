# Week-4 : Java-Collections
## Section A : GCR codebase

- detailed about folder structure of gcr-codebase.
```
project folder structure

java-collections-practice/
└── gcr-codebase/
   └── JavaCollectionPractice/
       └── src/
           └── com/
             ├──generics/
             ├──collections/
             ├──regex/
             ├──exceptionHandling/
             ├──Junit/
             ├──java streams/

```
-------
### Day 1 : Generics
*(Date: 15-Jan-2026)*
- Generics provide compile-time type safety and prevent runtime casting errors.
- Understood basic operations and use cases.
- Commited and pushed all works
```
java-collections-practice/
  └── gcr-codebase/
      └── JavaCollectionConcept/
          └── src/
              └── com/
                   └──generics/
                      ├──dynamiconlinemarketplace/
                      ├──mealplangeerator/
                      ├──resumescreeningsystem/
                      ├──smartwarehousemanagement/
                      ├──universitycoursemanagement/

```
- 🔗👉[ Generics ](https://github.com/Muskangupta15223/BridgeLabz-Training/tree/java-collection-practice/java-collections-practice/gcr-codebase/JavaCollectionsConcept/src/com/generics)

  ### Day 2 : Collection framework
  *(Date: 16-Jan-2026)*
- Studied Java Collections Framework architecture and hierarchy.
- Understood the role of Collection and Map interfaces.
- Learned **List Interface** and its implementations:
   - ArrayList
   - LinkedList
   - Vector
- Performed common List operations:
  - Add, remove, update, search
- Iteration using for-each, Iterator, and ListIterator
- Learned **Set Interface** and its implementations:
  - HashSet
  - LinkedHashSet
  - TreeSet
- Understood uniqueness, ordering, and sorting behavior in Sets.
- Learned **Map Interface** and its implementations:
  - HashMap
  - LinkedHashMap
  - TreeMap
- Performed key-value operations:
  - Insertion, deletion, retrieval
- Iteration using entrySet(), keySet(), and values()
- Learned **Queue Interface** and its implementations:
  - PriorityQueue
  - ArrayDeque
- Studied queue operations:
  - Enqueue, dequeue, peek & poll

```
java-collections-practice/
  └── gcr-codebase/
      └── JavaCollectionConcept/
          └── src/
              └── com/
                   └──generics/
                       └──listinterface/
                          ├──FrequencyCounter.java
                          ├──NthFromEnd.java
                          ├──RemoveDuplicates.java
                          ├──ReverseArrayList.java
                          ├──RotateList.java
                       └──setinterface/
                          ├──CheckSetEquality.java
                          ├──SetToSortedList.java
                          ├──SubsetCheck.java
                          ├──SymmetricDifference.java
                          ├──UnionIntersection.java
                       └──mapinterface/
                          ├──Employee.java
                          ├──InvertMap.java
                          ├──MaxValueKey.java
                          ├──MergeMap.java
                          ├──WordFrequency.java
                       └──queueinterface/
                          ├──Patient.java
                          ├──ReverseQUeue.java
                          ├──StackUsingQueue.java
                          ├──BinaryNumber.java
                          ├──CircularBuffer.java

```
- Commited and pushed all works

### Day 3 – Java Streams
*(Date: 18-Jan-2026)*

- Studied Java I/O Streams architecture and stream-based data handling.
- Covered Byte Streams and Character Streams for file operations.
- Learned and implemented:
  - FileInputStream, FileOutputStream
  - FileReader, FileWriter
  - BufferedInputStream, BufferedOutputStream
- BufferedReader, BufferedWriter
- Understood Object Streams:
  - ObjectInputStream, ObjectOutputStream
- Serialization and deserialization
- Practiced in-memory streams:
  - ByteArrayInputStream, ByteArrayOutputStream
- Used bridge streams:
   - InputStreamReader, OutputStreamWriter
- Applied try-with-resources, buffering, and performance best practices.
 
```
java-collections-practice/
└── gcr-codebase/
    └── src/
        └── com/
            └── java/
                └── streams/
                    ├── BufferedStreams.java
                    ├── ByteArrayStream.java
                    ├── CountWordsFile.java
                    ├── DataStreams.java
                    ├── FileHandling.java
                    ├── FilterStreams.java
                    ├── PipedStreams.java
                    ├── ReadLargeFileLBL.java
                    ├── Serialization.java
                    └── UserInputfromConsole.java

```
 
- Commited and pushed all works

### Day 4 – Exception Handling
*(Date: 19-Jan-2026)*

- Checked vs Unchecked Exceptions
- Custom exception creation and handling
- Try-catch-finally blocks and exception propagation
- Try-with-resources for automatic resource management
- Concepts Covered:
   - Checked Exception - File handling, I/O operations
   - Unchecked Exception - Runtime errors
- Custom Exception - Domain-specific error handling
 
```
Project Structure:
java-collections-practice/
└── gcr-codebase/
     └── src/
         └── com/
             └── exceptionHandling/
                    ├── BankSystemCustomException.java
                    ├── CheckedException.java
                    ├── CustomException.java
                    ├── ExceptionPropagation.java
                    ├── FinallyExecution.java
                    ├── MultipleCatchBlocks.java
                    ├── NestedTryCatch.java
                    ├── ThrowVsThrows.java
                    ├── TryWithResources.java
                    └── UncheckedException.java
```

### Day 5 – Regular Expressions & JUnit Testing
*(Date: 20-Jan-2026)*

- Regular expressions with Pattern and Matcher classes
- Input validation, text parsing, and data extraction
- JUnit testing framework with assertions and test cases
- Regex Problems Solved:
 
```
Project Structure:

JavaCollectionPractice/
   └── gcr-codebase/
     └── src/
        ├── com/
        │    └── regex/
        │           ├── extraction/
        │           │   ├── ExtractCapitalWord.java
        │           │   ├── ExtractEmailAddress.java
        │           │   ├── ExtractDate.java
        │           │   ├── ExtractLinks.java
        │           ├── advance/
        │           │   ├── ExtractCurrency.java
        │           │   ├── ExtractProgrammingLanguageNames.java
        │           │   ├── FindRepeatingWords.java
        │           │   ├── ValidateIPAddress.java
        │           │   ├── ValidateCreditCard.java
        │           │   ├── ValidateSSN.java
        |           ├── validation/
        │           │   ├── HexColorCode.java
        │           │   ├── LicencePlateNumber.java
        │           │   ├──ValidateUsername.java
        |           ├── replaceModify/
        │           │   ├── CensorBadWords.java
        │           │   ├── ReplaceMspaceToSspace.java
```
   -----     
```
junit/
    └── src/
        ├── main/
        │   └── java/
        │       └── JUnit/
        │               ├── BankAccount.java
        │               ├── Calculator.java
        │               ├── DatabaseConnection.java
        │               ├── FileProcessor.java
        │               ├── ListManager.java
        │               ├── MathUtils.java
        │               ├── NumberUtils.java
        │               ├── PasswordValidator.java
        │               ├── PerformanceUtils.java
        │               ├── StringUtils.java
        │               ├── TemperatureConverter.java
        │               └── UserRegistration.java
        └── test/
            └── java/
                └── regexJUnit/
                    ├── BankAccountTest.java
                    ├── CalculatorTest.java
                    ├── DatabaseConnectionTest.java
                    ├── FileProcessorTest.java
                    ├── ListManagerTest.java
                    ├── MathUtilsTest.java
                    ├── NumberUtilsTest.java
                    ├── PasswordValidatorTest.java
                    ├── PerformanceUtilsTest.java
                    ├── StringUtilsTest.java
                    ├── TemperatureConverterTest.java
                    └── UserRegistrationTest.java

   ```
---------
## Section B : Scenario-based-codebase

### Day 28 – Scenario-Based Practice
*(Date: 23-Jan-2026)*

- Solved 5 scenario-based problems.
- Focused on logical thinking and real-world problem solving.
- Committed and pushed all solutions.
- 🔗 Code Links:
👉 [Scenario Based Problems](https://github.com/Muskangupta15223/BridgeLabz-Training/tree/java-collection-practice/java-collections-practice/scenario-based/JavaCollectionScenarioBased/src/com/collections)

### 🗓 Day 29 – Scenario-Based Practice
*(Date: 24-Jan-2026)*

- Solved 5 scenario-based problems.
- Focused on logical thinking and real-world problem solving.
- Committed and pushed all solutions.
- 🔗 Code Links:
👉 [Scenario Based Problems](https://github.com/Muskangupta15223/BridgeLabz-Training/tree/java-collection-practice/java-collections-practice/scenario-based/JavaCollectionScenarioBased/src/com/collections)

-------
