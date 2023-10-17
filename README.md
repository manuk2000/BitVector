# BitVector

BitVector is a Java class that represents a bit vector and implements the InterfaceBitVector interface.

## Overview

This project implements the BitVector class, which represents a bit vector. A bit vector is a data structure used to store a sequence of bits. It provides methods to set and reset bits, as well as to print bits in binary format.

## Usage

The BitVector class provides the following methods:

- `boolean inputYesNo()`: Prompts the user to input "Yes" or "No" and returns `true` if "Yes" is entered, and `false` otherwise.
- `boolean inputSetReset()`: Prompts the user to input "Set" or "Reset" and returns `true` if "Set" is entered, and `false` otherwise.
- `int inputChangingBit()`: Prompts the user to input the position of the bit to change.
- `void realitionArr()`: Prompts the user to input the size of the bit array.
- `void set(int changingBit)`: Sets the bit at the specified position.
- `void reset(int changingBit)`: Resets the bit at the specified position.

## Installation

This project is written in Java. To use the BitVector class in your project, simply add it to your project and call the appropriate methods to work with the bit vector.

```java
BitVector bitVector = new BitVector();
bitVector.realitionArr();
int changingBit = bitVector.inputChangingBit();
bitVector.set(changingBit);
bitVector.reset(changingBit);
