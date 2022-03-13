package beans;

public class Tvshow {
    private int id;
    static private int cmp = 0;
    private String imageUrl;
    private String title;
    private String type;
    private String details;
    private float stars;

    public Tvshow(String imageUrl, String title, String type, String details, float stars) {
        this.id = ++cmp;
        this.imageUrl = imageUrl;
        this.title = title;
        this.type = type;
        this.details = details;
        this.stars = stars;
    }
    public Tvshow(int id, String imageUrl, String title, String type, String details, float stars) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.title = title;
        this.type = type;
        this.details = details;
        this.stars = stars;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public float getStars() {
        return stars;
    }

    public void setStars(float stars) {
        this.stars = stars;
    }
}
