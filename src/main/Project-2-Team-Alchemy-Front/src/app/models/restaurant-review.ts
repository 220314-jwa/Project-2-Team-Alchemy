export class RestaurantReview {

    constructor(
        public reviewId: number,
        public users: {
            username: string,
            password: string
        },
        public rating: number,
        public reviewtext: string,
        public reviewrating: number,
        public datecreated: string,
        public restaurantid: number
    ){
    }
}
