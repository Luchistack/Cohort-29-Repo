from unittest import TestCase
import random
import book_suggestion_system

class TestBookSuggestionSystem(TestCase):

    def setUp(self):

        book_suggestion_system.books[:]= ["The Hobbit", "The Mystery", "The Boy", "Home Alone", "Act", "The Wedding Bell", "Abaccus"]

    def test_that_suggestions_is_random(self):
        book = random.choice(book_suggestion_system.books)
        page = random.randint(1, 300)
        self.assertIn(book, book_suggestion_system.books)
        self.assertIsInstance(page, int)
        self.assertGreaterEqual(page, 1)
        self.assertLessEqual(page, 300)

    def test_that_book_is_added(self):
        book_suggestion_system.books.append("New Book")
        self.assertIn('New Book', book_suggestion_system.books)

    def test_book_is_removed(self):
        book_suggestion_system.books.remove("The Hobbit")
        self.assertNotIn('The Hobbit', book_suggestion_system.books)

    def test_that_book_update(self):
        old_book = "The Mystery"
        new_book = "Mystery 2"
        if old_book in book_suggestion_system.books:
            index = book_suggestion_system.books.index(old_book)
            book_suggestion_system.books[index] = new_book
        self.assertIn(new_book, book_suggestion_system.books)
        self.assertNotIn(old_book, book_suggestion_system.books)

    def test_show_all_runs(self):
        book_suggestion_system.show_all_books()
