# LinkedList, Stack, and Queue Implementation

This project contains implementations of fundamental data structures: LinkedList, Stack, and Queue. It includes extensive test drivers to validate the functionality of these data structures.

## Project Structure

- **LinkedList**: A custom implementation of a singly linked list with methods for adding, removing, and accessing elements.
- **Stack**: A stack implementation built on top of the LinkedList class, supporting typical stack operations like `push`, `pop`, and `peek`.
- **Queue**: A queue implementation built on top of the LinkedList class, supporting typical queue operations like `push`, `pop`, and `peek`.

## Folder Structure

- `src`: Contains the source code for the data structures and their test drivers.
- `lib`: Placeholder for external dependencies (if any).
- `bin`: Compiled output files (generated automatically).

## Running the Tests

1. Open the project in your preferred Java IDE (e.g., Visual Studio Code, IntelliJ IDEA, or Eclipse).
2. Compile the project to ensure all dependencies are resolved.
3. Run the following test drivers to validate the implementations:
   - `LinkedListTester`: Tests all methods of the `LinkedList` class.
   - `StackDriver`: Tests all methods of the `Stack` class.
   - `QueueDriver`: Tests all methods of the `Queue` class.

## Efficiency Testing

The `StackDriver` and `QueueDriver` classes include efficiency tests for adding and removing 1 million elements. These tests demonstrate the performance of the data structures under heavy workloads.

## Customization

If you want to modify the folder structure or settings:
- Open `.vscode/settings.json` and update the related settings.

## Contribution

Feel free to contribute by adding new features, optimizing existing code, or improving test coverage.

## License

This project is for educational purposes and does not include a specific license.
