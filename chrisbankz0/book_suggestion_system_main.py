import random

books = ["Lovers in cohort 29", "The Mumu man" ]

def show_menu():
    print("Welcome to the Book Suggestion System!")
    print("1. Get a book suggestion")
    print("2. Add a book")
    print("3. Remove a book")
    print("4. update a book")
    print("5. View all books")
    print("6. Exit")


def get_book_suggestion():
    while True:
        book = random.choice(books)
        page = random.randint(1, 100)

        print("Book for the day: ")
        print(f"Book Title: {book} - Page {page}")

        user_choice = input("Do you want another suggestion? (yes/no): ").lower()
        if user_choice != "yes":
            break


def add_book():
    new_book = input("Enter the title of the book you want to add: ")
    if new_book in books:
        print("This book already exists in the system.")
    else:
        books.append(new_book)
        print(f"{new_book} has been added to the book list.")


def remove_book():
    book_to_remove = input("Enter the title of the book you want to remove: ").lower()
    if book_to_remove in books:
        books.remove(book_to_remove)
        print(f"{book_to_remove} has been removed from the book list.")
    else:
        print("This book does not exist in the system.")


def update_book():
    old_book = input("Enter the title of the book you want to update: ").lower()
    if old_book in books:
        new_book = input("Enter the new title of the book: ").lower()
        index = books.index(old_book)
        books[index] = new_book
        print(f"{old_book} has been updated to {new_book}.")
    else:
        print("This book does not exist in the system.")


def view_books():
    for index, book in enumerate(books,1):
        print(f"{index}. {book}")        


def main():
    while True:
        show_menu()
        choice = input("Enter your choice (1-6): ")
        
        if choice == "1":
            get_book_suggestion()
        elif choice == "2":
            add_book()
        elif choice == "3":
            remove_book()
        elif choice == "4":
            update_book()
        elif choice == "5":
            view_books()
        elif choice == "6":
            print("Thank you for using the Book Suggestion System. Goodbye!")
            break
        else:
            print("Invalid choice. Please enter a number between 1 and 6.")
