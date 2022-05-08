import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'searchText'
})
export class SearchTextPipe implements PipeTransform {

  transform(restaurantItems: any[], searchText: string, fieldName: string): any[] {

    // return empty array if array is falsy
    if (!restaurantItems) { return []; }

    // return the original array if search text is empty
    if (!searchText) { return restaurantItems; }

    // convert the searchText to lower case
    searchText = searchText.toLowerCase();

    // retrun the filtered array
    return restaurantItems.filter(item => {
      if (item && item[fieldName]) {
        return item[fieldName].toLowerCase().includes(searchText);
      }
      return false;
    });
   }
}
