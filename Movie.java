public class Movie {
    private String title;
    private String genre;
    private int year;
    private String imageUrl;

    public Movie(String title, String genre, int year, String imageUrl) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.imageUrl = imageUrl;
    }

    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public int getYear() { return year; }
    public String getImageUrl() { return imageUrl; }
}
