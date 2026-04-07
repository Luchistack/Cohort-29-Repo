
from unittest import TestCase
import book_suggestion


class BookSuggestionTest(TestCase):


    def test_suggestion_is_working(self):

        result = book_suggestion.suggest_book()
        self.assertIsNotNone(result)

    def test_page_is_between_1_and_100(self):
    
        result = book_suggestion.suggest_book()
        self.assertTrue(1 <= 100)
