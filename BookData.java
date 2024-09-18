package projects;
import java.util.ArrayList;
import java.util.List;

public class BookData {
    public static List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
            books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "A novel about the American dream and a man's obsession with the past."));
            books.add(new Book("Moby Dick", "Herman Melville", "A classic tale of obsession, revenge, and the sea, focusing on Captain Ahab's hunt for the white whale."));
            books.add(new Book("To Kill a Mockingbird", "Harper Lee", "A story about racial inequality and childhood innocence, set in the American South."));
            books.add(new Book("1984", "George Orwell", "A dystopian novel exploring themes of totalitarianism, surveillance, and freedom."));
            books.add(new Book("Pride and Prejudice", "Jane Austen", "A witty exploration of societal expectations and romantic entanglements in 19th-century England."));
            books.add(new Book("The Catcher in the Rye", "J.D. Salinger", "A coming-of-age novel about teenage rebellion and alienation in post-war America."));
            books.add(new Book("War and Peace", "Leo Tolstoy", "An epic novel that intertwines the lives of several families during the Napoleonic Wars."));
            books.add(new Book("Ulysses", "James Joyce", "A modernist novel that parallels Homer's Odyssey, focusing on the ordinary life of Leopold Bloom."));
            books.add(new Book("The Odyssey", "Homer", "An ancient Greek epic poem that recounts the adventures of Odysseus as he returns home from the Trojan War."));
            books.add(new Book("Crime and Punishment", "Fyodor Dostoevsky", "A psychological drama exploring morality, guilt, and redemption through the lens of a murder."));
            books.add(new Book("The Brothers Karamazov", "Fyodor Dostoevsky", "A philosophical novel about faith, free will, and the complexity of human nature."));
            books.add(new Book("The Iliad", "Homer", "An ancient epic poem telling the story of the Trojan War and its heroes."));
            books.add(new Book("Brave New World", "Aldous Huxley", "A dystopian novel about a society shaped by genetic engineering and mind control."));
            books.add(new Book("Anna Karenina", "Leo Tolstoy", "A tragic love story set against the backdrop of 19th-century Russian aristocracy."));
            books.add(new Book("Fahrenheit 451", "Ray Bradbury", "A novel set in a future where books are banned, and 'firemen' burn any that are found."));
            books.add(new Book("Heart of Darkness", "Joseph Conrad", "A novella exploring imperialism and the darkness within humanity, set in the Congo."));
            books.add(new Book("Invisible Man", "Ralph Ellison", "A novel about an unnamed African-American man and his experiences with racism in early 20th-century America."));
            books.add(new Book("Jane Eyre", "Charlotte Bronte", "A novel about the emotional and moral growth of the orphaned protagonist as she navigates life's challenges."));
            books.add(new Book("Wuthering Heights", "Emily Bronte", "A gothic romance that delves into themes of love, revenge, and the supernatural."));
            books.add(new Book("The Scarlet Letter", "Nathaniel Hawthorne", "A story of sin, guilt, and redemption set in the puritanical society of 17th-century America."));
            books.add(new Book("The Grapes of Wrath", "John Steinbeck", "A novel about the struggles of migrant farmers during the Great Depression in America."));
            books.add(new Book("The Hobbit", "J.R.R. Tolkien", "A fantasy adventure following Bilbo Baggins' quest to reclaim a treasure guarded by a dragon."));
            books.add(new Book("Frankenstein", "Mary Shelley", "A gothic tale of ambition, creation, and the consequences of pushing the boundaries of science."));
            books.add(new Book("Dracula", "Bram Stoker", "A horror novel about Count Dracula's attempt to move from Transylvania to England to spread the undead curse."));
            books.add(new Book("The Count of Monte Cristo", "Alexandre Dumas", "A tale of betrayal, imprisonment, and revenge set in post-Napoleonic France."));
            books.add(new Book("Les Miserables", "Victor Hugo", "A historical novel about the struggles of several characters during the French Revolution."));
            books.add(new Book("Don Quixote", "Miguel de Cervantes", "A comic novel about an aging knight's misguided adventures, often seen as a satire on chivalry."));
            books.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", "An epic fantasy about the quest to destroy a powerful ring to save Middle-earth."));
            books.add(new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "The first book in the Harry Potter series, following a young wizard as he attends Hogwarts School."));
            books.add(new Book("The Alchemist", "Paulo Coelho", "A philosophical novel about a young shepherd's journey to realize his personal legend."));


        return books;
    }
}