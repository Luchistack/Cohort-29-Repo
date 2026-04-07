from unittest import TestCase
from book_suggestion_system import *

class TestClass(TestCase):

    def test_book_exists_true(self):
        books = ["The Hobbit", "The Mystery", "Animal Farm", "Brave Kingdom"]
        self.assertEqual(book_exists(books, "The Hobbit"), True)

    def test_book_exists_false(self):
        books = ["The Hobbit", "The Mystery", "Animal Farm", "Brave Kingdom"]
        self.assertEqual(book_exists(books, "Ghost Book"), False)

    def test_add_book_new(self):
        books = ["The Hobbit"]
        result, message = add_book(books, "Harry Potter")

        self.assertEqual(result, True)
        self.assertEqual("Harry Potter" in books, True)

    def test_add_book_duplicate(self):
        books = ["The Hobbit"]
        result, message = add_book(books, "The Hobbit")

        self.assertEqual(result, False)
        self.assertEqual(message, "Book already exists.")

    def test_remove_book(self):
        books = ["The Hobbit", "Animal Farm"]
        result, message = remove_book(books, "The Hobbit")

        self.assertEqual(result, True)
        self.assertEqual("The Hobbit" in books, False)

    def test_update_book(self):
        books = ["Old Title"]
        result, message = update_book(books, "Old Title", "New Title")

        self.assertEqual(result, True)
        self.assertEqual("New Title" in books, True)

    def test_get_all_books(self):
        books = ["A", "B", "C"]
        self.assertEqual(get_all_books(books), ["A", "B", "C"])
