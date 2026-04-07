

from unittest import TestCase
import book_suggestion_app

class Book_Suggestion_App(TestCase):

    def test_that_pages_can_be_selected_at_random_between_1_and_100(self):
        result = book_suggestion_app.the_random_pages()
        self.assertTrue(1 <= result <= 100)

    def test_that_books_can_be_added_to_the_list_of_book_suggestions(self):
        actual = book_suggestion_app.add_books("George Orwell", "Animal Kingdom")
        expected = "Book added successfully"
        self.assertEqual(actual, expected)

    
    def test_that_books_can_be_removed_from_the_list_of_book_suggestions(self):
        book_suggestion_app.add_books("George orwell", "Animal Farm")
        actual = book_suggestion_app.remove_book("Animal Farm")
        expected = "Book Removed Successfully"
        self.assertEqual(actual, expected)

    def test_that_books_can_be_updated_in_the_list_of_book_suggestions(self):
        book_suggestion_app.add_books("George Orwell", "Animal Farm")
        actual = book_suggestion_app.update_book()
        expected = "Book Updated Successfully"
        self.assertEqual(actual, expected)

    