package com.prueba.zemoga.app.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

@Service
public class TwitterTimeLineImpl {

  Twitter twitter = TwitterFactory.getSingleton();
  List<String> ListaTweets = new ArrayList<String>();
  
  public List<String> readTweet(){
      ListaTweets.clear();
      try{
          ResponseList<Status> responseList=twitter.getUserTimeline();
          responseList.forEach(s->{
     
              ListaTweets.add(s.getUser().getScreenName()+"  : "+s.getText()+ " fecha "+ s.getCreatedAt().toString());     
          });
      }catch(TwitterException e){
        return ListaTweets;
      }
      return ListaTweets;
  }
  
}
