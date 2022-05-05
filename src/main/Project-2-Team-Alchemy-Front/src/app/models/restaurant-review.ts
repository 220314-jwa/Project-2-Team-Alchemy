export class RestaurantReview {

    constructor(
        public reviewId: number,
        public users: String,
        public rating: number,
        public reviewtext: String,
        public reviewrating: number,
        public datecreated: string,
        public restaurant_id: number
    ){
    }
}
