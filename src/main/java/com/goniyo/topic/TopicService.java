package com.goniyo.topic;

import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	
	public List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
				new Topic("1000","Spring Framework","Just started Learning yet"),
				new Topic("1005","Express Framework","Interesting"),
				new Topic("1010","Play 2 ! Framework","My favorite Framework")
				));
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	
	public Topic getTopic(String id){
		return topics.stream().filter(x -> x.getId().equals(id)).findFirst().get();
	}


	public void addTopic(Topic topic) {
		topics.add(topic);
	}


	public void updateTopic(String id, Topic topic) {
	for(int i=0;i<topics.size();i++){
		if(topics.get(i).getId().equals(topic.getId())) {topics.set(i, topic);return;}
	}
	}


	public void deleteTopic(String id) {
		topics.removeIf(x -> x.getId().equals(id));
		// TODO Auto-generated method stub
		
	}

}
