package com.connections.posts_service.event;

import lombok.Builder;
import lombok.Data;

@Data
public class PostLikedEvent {
    Long postId;
    Long creatorId;
    Long likedByUserId;
}
