package week15.d03;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class PostFinder
{
    private List<Post> posts;

    public PostFinder(List<Post> posts)
    {
        this.posts = posts;
    }

    public List<Post> findPosts(String user)
    {
        return posts.stream()
              .filter(post -> post.getPublishedAt().isBefore(LocalDate.now()) || (post.getOwner().equals(user)))
              .filter(post -> post.getContent()   != null && post.getContent().isBlank())
              .filter(post -> post.getTitle()     != null && post.getTitle().isBlank())
              .filter(post -> post.getDeletedAt() == null || post.getDeletedAt().isAfter(LocalDate.now()))
              .collect(Collectors.toList());
    }


    public static void main(String[] args)
    {
        PostFinder  postfin = new PostFinder(List.of(new Post("My First Post", LocalDate.of(2018, 1, 6), LocalDate.of(2019, 6, 19), "Tartalom", "Pista"),
                                                     new Post("My Article", LocalDate.of(2019, 3, 18), null, "Tartalom", "Pista"),
                                                     new Post("I like Java", LocalDate.of(2020, 2, 20), null, "Tartalom", "Pista")));

        System.out.println(postfin.findPosts("Pista"));
    }
}


/*  Implementáljunk a PostFinder osztályban egy public List<Post> findPosts(String user) metódust az alábbi módon:
  - A Post publishedAt dátuma korábbi kell, hogy legyen, mint a LocalDate.now()
  - Ha a Post publishedAt dátuma későbbi, mint a LocalDate.now(), akkor csak azokat a Post-okat adjuk vissza,
    melyek owner-e megegyezik a megadott user-rel.
  - A content és a title nem lehet üres
  - A deletedAt értéke null kell, hogy legyen, vagy későbbi, mint a LocalDate.now().
  - Használjunk stream-eket az implementációhoz!
    Tároljunk egy List<Post> objektumot a PostFinder osztályban,
    melyet konstruktor paraméterként kap meg és ezt használjuk! */