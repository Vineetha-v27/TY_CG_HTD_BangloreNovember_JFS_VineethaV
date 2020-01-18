import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { PostsComponent } from './posts/posts.component';

@Injectable({
  providedIn: 'root'
})
export class PostserviceService {
  selectedPostToUpdate: PostserviceService;

  api = `https://jsonplaceholder.typicode.com/posts`;

  constructor(private http: HttpClient) { }

  postData(posts): Observable<any> {
    return this.http.post<any>(`${this.api}/add-posts`,
    posts);
  }

  getData(): Observable<any> {
    return this.http.get<any>(`${this.api}/view-allposts`);
  }

  deleteData(posts: PostserviceService): Observable<any> {
    return this.http.delete<any>(
      `${this.api}/delete-product/${posts.id}`
    );
  }
}
