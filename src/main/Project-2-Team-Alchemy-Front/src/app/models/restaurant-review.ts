export class RestaurantReview {
    public username: String;
    public reviewContent: String;
    public userRating: String;
    constructor(
        username: String,
        reviewContent: String,
        userRating: String
    ){
        this.username = username;
        this.reviewContent = reviewContent;
        this.userRating = userRating;
    }
}
