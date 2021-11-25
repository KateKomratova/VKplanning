package ru.netology.domain;

public class Post {
    private int postId;
    private int ownerId; //из документации
    private int fromId; //из документации
    private int createdBy; //из документации
    private int replyOwnerId; //из документации
    private int replyPostId; //из документации
    private boolean friendsOnly; //из документации
    private String postType; //из документации
    private int signerId; //из документации
    private boolean canPin; //из документации
    private boolean canDelete; //из документации
    private boolean canEdit; //из документации
    private boolean isPinned; //из документации
    private boolean markedAsAds; //из документации
    private int postponedId; //из документации
    private String name;
    private String imageUrl;
    private String text;
    private int date;
    private int time;
    private boolean favouritesInfo;
    private boolean complaintInfo;
    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private CopyrightInfo copyrightInfo; //из документации
    private DonutInfo donutInfo; //из документации
    private GeoInfo geoInfo; //из документации
    private PostSource postSource; //из документации

    //+getters/setters
}
