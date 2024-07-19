# Bicycle MRP Generator




## Overview
Project Overview
This project generates a Material Requirement Plan (MRP) for manufacturing a specified number of bicycles. The MRP calculates the total quantity of each part required, considering the current inventory, and determines the quantity that needs to be procured. Additionally, it calculates how many bicycles can be made with the available inventory.

## Features

Recipe breakdown for required parts
Inventory net off calculation
Maximum bicycles calculation with current inventory
Exception handling for various scenarios

## Input

1 -  Total available inventory

2 - Number of bicycles to be manufactured

3 -  Recipe for each bicycle and its sub-assemblies

4 -  On-hand inventory for each part

## Output

1 -  Total availeble inventory data

2 -  Total required quantity of each part data

3 -  Maximum number of bicycles that can be assembled with the current inventory

4 -  Quantity of each part to be procured

## Technologies Used

-   Java
-   Spring Boot
-   Object-Oriented Programming
-   MySQL database


## Exception Handling

-   Handles insufficient inventory scenarios.

-   Validates input data for correctness.

-   Ensures all necessary data is available for     calculations.

## Data Structure used

HashMap -  Used to store the recipe and inventory data efficiently. HashMap provides constant-time performance for basic operations (get and put), making it an ideal choice for handling the parts and their quantities.

Map - The interface that HashMap implements, allowing for flexibility in using different types of maps if needed. Map provides a way to map keys to values, which is essential for handling the relationship between parts and their required quantities.

## Object Orient Programming concept used

- Encapsulation
- Abstraction
- Inheritance (I-c model)


## Screenshots of Api testing
