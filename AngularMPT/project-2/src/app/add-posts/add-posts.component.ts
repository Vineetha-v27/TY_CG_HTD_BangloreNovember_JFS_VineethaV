import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { PostserviceService } from '../postservice.service';

@Component({
  selector: 'app-add-posts',
  templateUrl: './add-posts.component.html',
  styleUrls: ['./add-posts.component.css']
})
export class AddPostsComponent implements OnInit {

  message: string;

  constructor(private postService: PostserviceService) { }

  ngOnInit() {PostserviceService
  }
  addPost(form: NgForm) {
    this.postService.postData(form.value).subscribe(data => {
        console.log(data);
        this.message = data.message;
        setTimeout(() =>
        {
          this.message = null;
        }, 2000);
        form.reset();
      }, err => {
        console.log(err);
      });
  }

}
