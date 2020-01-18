import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-data-from-json',
  templateUrl: './data-from-json.component.html',
  styleUrls: ['./data-from-json.component.css']
})
export class DataFromJsonComponent implements OnInit {
  products: products[];
  constructor(private http: HttpClient) {
    this.getDataFromJSON();
  }
  getDataFromJSON() {
    this.http.get<products[]>('../../assets/products.json.txt').subscribe(response => {
      console.log(response);
      this.products = response;
    });
   }

  ngOnInit() {
  }

  }
interface products {
    name: string;
    url: string;
    price: number;
}