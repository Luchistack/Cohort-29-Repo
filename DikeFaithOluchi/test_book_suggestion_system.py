from unittest import TestCase
import random
import book_suggestion_system

class TestBookSuggestionSystem(TestCase):

    def setUp(self):

        book_suggestion_system.books[:]= ["The Hobbit", "The Mystery", "The Boy", "Home Alone", "Act", "The Wedding Bell", "Abaccus"]

    def test_that_suggestions_is_random(self):

        book, page = book_suggestion_system.get_suggestion()

        self.assertIn(book, book_suggestion_system.books)
        self.assertIsInstance(page, int)
        self.assertGreaterEqual(page, 1)
        self.assertLessEqual(page, 300)

    def test_that_book_is_added(self):

        actual_result = book_suggestion_system.add_book("New Book")

        self.assertIn('New Book', book_suggestion_system.books)
        self.assertEqual(actual_result, "New Book added successfully")

    def test_book_is_removed(self):

        actual_result = book_suggestion_system.remove_book("The Hobbit")

        self.assertNotIn('The Hobbit', book_suggestion_system.books)
        self.assertEqual(actual_result, "Book removed successfully")

    def test_that_book_update(self):

        actual_result = book_suggestion_system.update_book("The Mystery", "Mystery 2")

        self.assertIn("Mystery 2", book_suggestion_system.books)
        self.assertNotIn("The Mystery", book_suggestion_system.books)
        self.assertEqual(actual_result, "The Mystery as been updated to Mystery 2")


    def test_show_all_runs(self):

        actual_result = book_suggestion_system.show_all_books()
        self.assertEqual(actual_result, book_suggestion_system.books)

    def test_app_exit(self):

        actual_result = book_suggestion_system.exit_system()
        self.assertTrue(actual_result)

