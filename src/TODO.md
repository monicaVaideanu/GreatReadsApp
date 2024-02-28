Calls I need to implement
- create user
- login
- logout
- getWishListForUser
- getReviewsForBook
- getAverageRatingForBook
-getAllBooksByGenre
-getAllBooksByAuthor
-getAllBooksByLanguage
-getAllReviewsByUser
-getAllBooksInStatusPending
-getAllAuthors
- getBooksFromCollection
TODO
- manyToMany books-genres
- change PK from int to UUID
- o carte poate apratine unei colectii => add field de colectie
- separare metode in controllere specifice
-consume api for review validation and password

Validation:
-password API?

Functionalitati dorite:

Un cititor
- poate marca o carte ca fiind citita
- poate lasa un review + rating(verificare daca cartea este citita)
- poate crea un wishlist de carti
- poate downlaoda o carte
* poate adauga un autor ca preferat si sa ii urmareasca activitatea-> tabela noua?
* poate cauta utilizatori sa vada wishlists si books read? -> sa fie publice?
* poate deveni un citior un autor?

Un autor
- functionalitate cititor ++
- poate publica o carte => request admin
* sa primeasca mail cu statusul cartii(accepted/declined)

Un admin
- poate sterge reviews
- poate aproba / respinge publicarea cartii