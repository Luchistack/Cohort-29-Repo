import random


def book_exists(book_list, book_title):
    return book_title in book_list


def get_suggestion(book_list):
    if not book_list:
        return None
    return {
        "title": random.choice(book_list),
        "page_number": random.randint(1, 100)
    }


def add_book(book_list, book_title):
    if book_exists(book_list, book_title):
        return False, "Book already exists."

    book_list.append(book_title)
    return True, "Book added successfully."


def remove_book(book_list, book_title):
    if not book_exists(book_list, book_title):
        return False, "Book not found."

    book_list.remove(book_title)
    return True, "Book removed successfully."


def update_book(book_list, old_title, new_title):
    if not book_exists(book_list, old_title):
        return False, "Book not found."

    index = book_list.index(old_title)
    book_list[index] = new_title
    return True, "Book updated successfully."


def get_all_books(book_list):
    return book_list.copy()

def main():
    print("Welcome to Good Friday Book Suggestion System")

    user_name = input("Enter your name: ")

    while True:
        print("\nMenu:")
        print("1. Get suggestions")
        print("2. Add Book")
        print("3. Remove Book")
        print("4. Update Book")
        print("5. Show All Books")
        print("6. Exit")

        user_choice = input("Enter a choice between 1 and 6: ")

        if not user_choice.isdigit():
            print("Please enter a number.")
            continue

        user_choice = int(user_choice)

        if user_choice < 1 or user_choice > 6:
            print("Invalid choice.")
            continue

        match user_choice:
            case 1:
                while True:
                    suggestion = get_suggestion()
                    if suggestion:
                        print(f"\nBook Title: {suggestion['title']}")
                        print(f"Page: {suggestion['page_number']}")
                    else:
                        print("No books available.")
                        break

                    user_response = input("Would you like another suggestion? (yes/no): ").lower()
                    if user_response != "yes":
                        break

            case 2:
                new_book_title = input("Enter the book title: ")
                success, message = add_book(new_book_title)
                print(message)

            case 3:
                book_to_remove = input("Enter the book title to remove: ")
                success, message = remove_book(book_to_remove)
                print(message)

            case 4:
                old_book_title = input("Enter the old title: ")
                new_book_title = input("Enter the new title: ")
                success, message = update_book(old_book_title, new_book_title)
                print(message)

            case 5:
                all_books = get_all_books()
                if not all_books:
                    print("No books available.")
                else:
                    print("\nAll Books:")
                    for index, title in enumerate(all_books, start=1):
                        print(f"{index}. {title}")

            case 6:
                print("Goodbye!")
                break



