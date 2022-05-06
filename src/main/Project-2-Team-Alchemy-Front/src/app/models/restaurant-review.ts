export class RestaurantReview {

    constructor(
        public reviewId: number,
        public users: string,
        public rating: number,
        public reviewtext: string,
        public reviewrating: number,
        public datecreated: string,
        public restaurant_id: number
    ){
    }
}
