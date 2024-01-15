package iterator;

import java.time.LocalDateTime;

public class Post {

    private String title;
    private LocalDateTime createdDateTime;

    // @AllArgsConstructor
    public Post(String title, LocalDateTime createdDateTime) {
        this.title = title;
        this.createdDateTime = createdDateTime;
    }

    // @Getter
    public String getTitle() {
        return title;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }
}
