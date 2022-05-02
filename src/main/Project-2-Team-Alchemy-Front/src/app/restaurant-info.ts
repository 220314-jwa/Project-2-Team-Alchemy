export class RestaurantInfo {
    public id:number;
    public restaurantName: String;
    public restaurantDescription: String;
    public restaurantRating: number;
    public restaurantImage: String;

    constructor(id: number,
                restaurantName: String,
                restaurantDescription:String,
                restaurantRating: number,
                restaurantImage: String
        ){
        this.id = id;
        this.restaurantName = restaurantName;
        this.restaurantDescription = restaurantDescription;
        this.restaurantRating = restaurantRating;
        this.restaurantImage = restaurantImage;
    }
}
