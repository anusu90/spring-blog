package com.anunay.blogspring.comment;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blogs/{blogId}/comments")
public class CommentController {
}
