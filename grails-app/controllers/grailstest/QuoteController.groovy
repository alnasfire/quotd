package grailstest

class QuoteController {
    def scaffold = true

    def quoteService

    def index() {
        redirect(action : home)
    }

    def random = {

        def randomQuote = quoteService.getRandomQuote()
        [quote : randomQuote]
    }

    def home = {
        render "<h1>Real Programmers do not eat Quiche</h1>"
    }
}
