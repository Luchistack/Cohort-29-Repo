import unittest
from book_suggestion_functions import *

class TestBookSugestionFunctions (unittest.TestCase):

    def setUp(self):
        books_list.clear()
        books_list.extend(["The Great Gatsby", "To Kill a Mockingbird", "Brave Kingdom", "The Mystery", "Animal Farm", "The Hobbit" ])

    def test_suggest_random_book_with_random_page_number(self):
        result = suggest_random_book_with_random_page_number()
        self.assertIn("Book Title:", result)

    def test_does_book_exist_function_if_book_exists(self):
        actual = does_book_exist("The Great Gatsby")
        expected = True
        self.assertEqual(actual, expected)

    def test_does_book_exist_function_if_book_does_not_exist(self):
        actual = does_book_exist("Man of Steel")
        expected = False
        self.assertEqual(actual, expected)

    def test_add_book_with_existing_book(self):
        actual =  add_book("The Hobbit")
        expected =  "Book already exists in the list."
        self.assertEqual(actual, expected)

    def test_add_book_with_new_book(self):
        actual =  add_book("Man of Steel")
        expected =  "Book added successfully!"
        self.assertEqual(actual, expected)

    def test_remove_book_with_existing_book_of_different_case(self):
        actual =  remove_book("the hobbit")
        expected =  "Book removed successfully!"
        self.assertEqual(actual, expected)

    def test_remove_book_with_non_existing_book(self):
        actual =  remove_book("Man of Steel")
        expected =  "Book does not exist in the list."
        self.assertEqual(actual, expected)
    def test_remove_book_with_existing_book(self):
        actual =  remove_book("The Hobbit")
        expected =  "Book removed successfully!"
        self.assertEqual(actual, expected)

    def test_remove_book_with_existing_book_of_different_case(self):
        actual =  remove_book("the hobbit")
        expected =  "Book removed successfully!"
        self.assertEqual(actual, expected)

    def test_remove_book_with_non_existing_book(self):
        actual =  remove_book("Man of Steel")
        expected =  "Book does not exist in the list."
        self.assertEqual(actual, expected)
    
    def test_update_book_with_existing_book(self):
        actual =  update_book("The Hobbit", "The Hobbit 2")
        expected =  "Book updated successfully!"
        self.assertEqual(actual, expected)

    def test_update_book_with_existing_book_of_different_case(self):
        actual =  update_book("the hobbit", "The Hobbit 2")
        expected =  "Book updated successfully!"
        self.assertEqual(actual, expected)

    def test_update_book_with_non_existing_book(self):
        actual =  update_book("Man of Steel", "Man of Steel 2")
        expected =  "Book does not exist in the list."
        self.assertEqual(actual, expected)