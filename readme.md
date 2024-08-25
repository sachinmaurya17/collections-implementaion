
---

# ArrayList Implementation

Welcome to the **ArrayList Implementation** repository! This project provides a custom implementation of the `ArrayList` data structure in Java, demonstrating how dynamic arrays work internally. This is a part of a series of custom implementations for various collection types.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Overview

The purpose of this repository is to provide a deep understanding of how the `ArrayList` in Java works under the hood. The implementation covers dynamic resizing, adding, removing, and accessing elements, and offers insights into the internal workings of this widely used data structure.

## Features

- Dynamic array resizing
- Element addition and removal
- Accessing elements by index
- Custom implementation of basic `ArrayList` methods

## Getting Started

### Prerequisites

Ensure you have the following installed:

- Java JDK 8 or higher
- A Java IDE or text editor of your choice

### Installation

Clone the repository to your local machine using the following command:

```bash
git clone https://github.com/sachinmaurya17/collections-implementaion.git
```

Navigate to the `ArrayListImpl` directory:

```bash
cd collections-implementaion/ArrayListImpl
```

## Usage

The implementation can be tested and run using any Java IDE or through the command line. Here's a basic example of how to use the custom `ArrayList`:

```java
public class Main {
    public static void main(String[] args) {
        IDynamicArray<Integer> arrayList = new DynamicArray<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        System.out.println("Element at index 1: " + arrayList.get(1));
        System.out.println("Size of ArrayList: " + arrayList.size());

        arrayList.remove(1);
        System.out.println("Element at index 1 after removal: " + arrayList.get(1));
    }
}
```

### Running the Example

Compile and run the above example using the following command:

```bash
javac Main.java
java Main
```

## Contributing

Contributions are welcome! If you have any suggestions or improvements, feel free to create an issue or submit a pull request.

### Steps to Contribute

1. Fork the repository
2. Create a new branch (`git checkout -b feature-branch`)
3. Make your changes and commit (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature-branch`)
5. Create a new Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

This `README.md` gives a clear overview of your project, provides instructions for usage, and encourages contributions. You can customize it further as needed!